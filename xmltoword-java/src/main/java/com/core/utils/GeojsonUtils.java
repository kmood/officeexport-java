//package com.core.utils;
//
//import com.google.gson.Gson;
//import com.vividsolutions.jts.geom.*;
//import com.vividsolutions.jts.io.WKTReader;
//import org.activiti.engine.impl.util.json.JSONArray;
//import org.activiti.engine.impl.util.json.JSONObject;
//import org.geotools.data.FeatureWriter;
//import org.geotools.data.Transaction;
//import org.geotools.data.shapefile.ShapefileDataStore;
//import org.geotools.data.shapefile.ShapefileDataStoreFactory;
//import org.geotools.data.simple.SimpleFeatureCollection;
//import org.geotools.data.simple.SimpleFeatureIterator;
//import org.geotools.data.simple.SimpleFeatureSource;
//import org.geotools.feature.simple.SimpleFeatureTypeBuilder;
//import org.geotools.geojson.feature.FeatureJSON;
//import org.geotools.geojson.geom.GeometryJSON;
//import org.geotools.referencing.crs.DefaultGeographicCRS;
//import org.opengis.feature.simple.SimpleFeature;
//import org.opengis.feature.simple.SimpleFeatureType;
//
//import java.io.*;
//import java.nio.charset.Charset;
//import java.util.HashMap;
//import java.util.Map;
//
//public class GeojsonUtils {
//	public static final Gson gson=JsonBinder.buildNormalBinder("yyyy-MM-dd HH:mm:ss");
//
//	public static String conversion(double jwd){
//		int shi = (int)jwd;
//		int fen = (int)((jwd-shi)*60);
//		double miao = ((jwd-shi)*60-fen)*60.0;
//		return shi+"°"+fen+"'"+miao+"\"";
//	}
//
////	@Test
////	public void test(){
////		String conversion = conversion(113.211);
////		System.out.println(conversion);
////
////	}
//	/**
//	 * 由wkt格式的geometry生成geojson
//	 * @param wkt
//	 * @return
//	 */
//	public static String geoToJson(String wkt){
//		String json = null;
//		try{
//			WKTReader reader = new WKTReader();
//			Geometry geometry = reader.read(wkt);
//			StringWriter writer = new StringWriter();
//			GeometryJSON g = new GeometryJSON();
//			g.write(geometry,writer);
////			System.out.println(writer);
//			json = writer.toString();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return json;
//	}
//	/**
//	 * 将geojson解析为geometry的wkt形式
//	 * @param geoJson
//	 * @return
//	 */
//	public static String jsonToWkt(String geoJson){
//		String wkt = null;
//		GeometryJSON gjson = new GeometryJSON();
//		Reader reader = new StringReader(geoJson);
//		Geometry geometry=null;
//		try{
//			geometry = gjson.read(reader);
//			wkt = geometry.toString();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		return wkt;
//	}
//
//
//	/**
//	 * shp文件转换为geojson
//	 * @param jsonPath
//	 * @param shpPath
//	 * @return
//	 */
//	public static String shape2Geojson(String shpPath)throws Exception{
//
//		FeatureJSON fjson = new FeatureJSON();
//		StringBuffer sb = new StringBuffer();
//		sb.append("{\"type\": \"FeatureCollection\",\"features\": ");
//
//		File file = new File(shpPath);
//		ShapefileDataStore shpDataStore = null;
//
//    	shpDataStore = new ShapefileDataStore(file.toURI().toURL());
//        //设置编码
//        Charset charset = Charset.forName("GBK");
//        shpDataStore.setStringCharset(charset);
//        String typeName = shpDataStore.getTypeNames()[0];
//        SimpleFeatureSource featureSource = null;
//        featureSource =  shpDataStore.getFeatureSource (typeName);
//        SimpleFeatureCollection result = featureSource.getFeatures();
//        SimpleFeatureIterator itertor = result.features();
//        JSONArray array = new JSONArray();
//        while (itertor.hasNext())
//        {
//            SimpleFeature feature = itertor.next();
//            StringWriter writer = new StringWriter();
//            fjson.writeFeature(feature, writer);
//            JSONObject json = new JSONObject(writer.toString());
//            array.put(json);
//        }
//        itertor.close();
//        sb.append(array.toString());
//        sb.append("}");
//		return sb.toString();
//	}
//
//
//
//	/**
//	 * geojson转换为shp文件
//	 * @param strJson
//	 * @param shpPath 例：c://test//test.shp
//	 * @return
//	 */
//	public static void geojson2Shape(String strJson, String shpPath)throws Exception{
//		GeometryJSON gjson = new GeometryJSON();
//		JSONObject json = new JSONObject(strJson);
//		JSONArray features = (JSONArray) json.get("features");
//		JSONObject feature0 = new JSONObject(features.get(0).toString());
//		System.out.println(feature0.toString());
//		String strType = ((JSONObject)feature0.get("geometry")).getString("type").toString();
//
//		Class<?> geoType = null;
//		switch(strType){
//			case "Point":
//				geoType = Point.class;
//			case "MultiPoint":
//				geoType = MultiPoint.class;
//			case "LineString":
//				geoType = LineString.class;
//			case "MultiLineString":
//				geoType = MultiLineString.class;
//			case "Polygon":
//				geoType = Polygon.class;
//			case "MultiPolygon":
//				geoType = MultiPolygon.class;
//		}
//		//创建shape文件对象
//		File file = new File(shpPath);
//		Map<String, Serializable> params = new HashMap<String, Serializable>();
//		params.put( ShapefileDataStoreFactory.URLP.key, file.toURI().toURL() );
//		ShapefileDataStore ds = (ShapefileDataStore) new ShapefileDataStoreFactory().createNewDataStore(params);
//		//定义图形信息和属性信息
//		SimpleFeatureTypeBuilder tb = new SimpleFeatureTypeBuilder();
//		tb.setCRS(DefaultGeographicCRS.WGS84);
//		tb.setName("shapefile");
//		tb.add("the_geom", geoType);
//		tb.add("POIID", Long.class);
//		ds.createSchema(tb.buildFeatureType());
//		//设置编码
//        Charset charset = Charset.forName("GBK");
//        ds.setStringCharset(charset);
//		//设置Writer
//		FeatureWriter<SimpleFeatureType, SimpleFeature> writer = ds.getFeatureWriter(ds.getTypeNames()[0], Transaction.AUTO_COMMIT);
//
//		for(int i=0,len=features.length();i<len;i++){
//			String strFeature = features.get(i).toString();
//			Reader reader = new StringReader(strFeature);
//			SimpleFeature feature = writer.next();
//			feature.setAttribute("the_geom",gjson.readMultiPolygon(reader));
//			feature.setAttribute("POIID",i);
//			writer.write();
//		}
//		writer.close();
//		ds.dispose();
//	}
//}
//

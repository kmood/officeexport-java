package com.core.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.google.gson.Gson;


public class JdbcUtil {
	private static Gson gson = JsonBinder.buildNormalBinder("yyyy-MM-dd HH:mm:ss");
	private static final Logger logger = Logger.getLogger(JdbcUtil.class);
	private static Connection connection = null;
	public static Connection getConnection (String url1, String user1, String password1){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url1, user1, password1);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return connection;
	}
	/**
	 * 
	 * @Title getOracleConnect
	 * @Description TODO
	 * @return
	 * @author SunBC
	 * @time 2018年9月19日 上午11:29:30
	 */
	public static Connection getOracleConnect() {
		try {
			String oracleUrl = "jdbc:oracle:thin:@10.166.140.87:1521:ORCL";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(oracleUrl, "ft_zz", "ft_zz");
		} catch (Exception e) {
			logger.error("数据对接数据库");
			throw new RuntimeException(e);
		}
		return connection ;
	}
	/**
	 * 
	 * @Title close
	 * @Description TODO
	 * @param connection
	 * @param rs
	 * @param ps
	 * @author SunBC
	 * @time 2018年9月19日 上午11:29:23
	 */
	public static void  close(	Connection connection, ResultSet rs, PreparedStatement ps ){
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * @Title packageData
	 * @Description TODO
	 * @param tableName
	 * @param data
	 * @return
	 * @author SunBC
	 * @time 2018年9月19日 上午11:29:19
	 */
	public static String generatorSql(String tableName,List<Map<String, Object>> data){
		StringBuilder sqlbuilder = new StringBuilder();
		if(data == null || data.isEmpty()) return null;
		sqlbuilder.append(" insert all ");
		for (Map<String, Object> map : data) {
			sqlbuilder.append(" into "+tableName+ " ( ");
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				sqlbuilder.append(key).append(",");
			}
			sqlbuilder = new StringBuilder(sqlbuilder.substring(0, sqlbuilder.length()-1));
			
			sqlbuilder.append(" ) values ( ");
			for (String key : keySet) {
				Object value_ = map.get(key);
				if(value_ == null) {
					sqlbuilder.append(" null ,");
					continue;
				}
				String value = String.valueOf(value_);
				if(value.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}.*$")) 
					sqlbuilder.append("to_date('").append(StringUtils.substringBeforeLast(value, ".0")).append("','yyyy-mm-dd hh24:mi:ss'),");
				else sqlbuilder.append("'").append(value).append("',");
			}
			sqlbuilder = new StringBuilder(sqlbuilder.substring(0, sqlbuilder.length()-1));
			sqlbuilder.append(" ) ");
		}
		sqlbuilder.append(" select 1 from dual");
		return sqlbuilder.toString();
	}
	
	public static void main(String[] args) {
//		StringBuilder sqlbuilder = new StringBuilder("test");
//		String substring = sqlbuilder.substring(0, sqlbuilder.length()-1);
//		ArrayList<Map<String, String >> data = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			HashMap<String, String> hashMap = new HashMap<>();
//			hashMap.put("ID", String.valueOf(i));
//			if(i==2)hashMap.put("CCFBRQ", null);
//			else hashMap.put("CCFBRQ", "2018-01-01 10:10:10");
//			data.add(hashMap);
//		}
//		String packageData = packageData("TSRQGL_ZDGLRQ_ZSZHDYZJSZAHZ", data);
		System.out.println(String.valueOf(null));
	}
}

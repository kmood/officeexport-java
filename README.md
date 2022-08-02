# officeexport-java

 ![jdk1.6+](https://img.shields.io/badge/jdk-1.6%2B-orange.svg) 
 ![freemarker-2.3.28+](https://img.shields.io/badge/freemarker-2.3.28%2B-orange.svg)
 ![](https://img.shields.io/badge/platform-all-orange.svg)
 ![](https://img.shields.io/badge/language-java-orange.svg)
 ## 解决哪些问题
   * 开发中偶尔会有固定模板导出word的需求，常见的导出通常通过直接修改xml或者通过工具库代码调整样式输出，这些方式开发困难并且不利于后期维护。
  * 一些有规则的文档需要人工填写，费时费力，此时配置数据库做模板渲染导出，如数据库设计文档等
   
 
## 简单介绍
officeexport-java基于[Apache FreeMarker](https://freemarker.apache.org)，遵从*模板 + 数据模型 = 输出*的理念，
通过极简API实现javaBean即数据源，模板即样式的Word导出，提供以下功能：

  * 基本文本的输出，文本占位符样式即输出文本样式。
  * 文本行、表格行单行或多行的遍历输出，并能够进行循环嵌套。
  * 提供数据处理的插件，通过添加处理器可定制任意输出值，例如：特定项的日期、数字等文本格式转换
  * 图片保留样式的输出。
 
## 现有实现方案的对比

| 方案 | 跨平台 | 易用性
| --- | --- | --- |
| Freemarker | 跨平台  | 需要掌握freemarker的语法，配置xml结构，复杂模型导出非常繁琐
| Apache POI | Java组件，跨平台 | 需要掌握POIApi，对于复杂样式配置起来很复杂
| **officeexport** | **Java组件，跨平台** | **拥有极简API，极简的模板语法，模板样式即输出样式（模板样式直接通过word调整）**



## 快速开始
>### 代码示例

   >>1、直接调整word模板，添加占位符，在word2007 版本前需要导出word2003xml， **word2007 版本之后直接调整word** 即可。
   
   >>2、Maven引入jar包，通过api导出

   ```xml：
     
      <dependency>
          <groupId>com.github.kmood</groupId>
          <artifactId>officeexport-java</artifactId>
          <version>1.0.3.0-RELEASE</version>
      </dependency>

   ```
   ```java
     HashMap<String, Object> data = new HashMap<>();
     ...准备数据
     data.put("zxsm",zxsmList);
     data.put("sbsm","kmood-导出-商标说明");
     
     DocumentProducer dp = new DocumentProducer(ActualModelPath);
     dp.Complie(xmlPath, "filename.xml",true);
     dp.produce(map, ExportFilePath);
   ```
>### 示例1-文本输出
>>#### 代码实例
   ```java
            HashMap<String, Object> map = new HashMap<>();
            map.put("text", "kmood-文本占位输出");
            map.put("text1", "kmood-文本占位输出2");
            DocumentProducer dp = new DocumentProducer(ActualModelPath);
            String complie = dp.Complie(xmlPath, "text.xml", true);
            dp.produce(map, ExportFilePath);
   ```
>>#### 实现效果
<div align=center><img src="https://github.com/kmood/officeexport-java/blob/master/file/text.png"/></div>

>### 示例2-文本循环输出
>>#### 代码实例
   ```java
           //准备数据
           HashMap<String, Object> map = new HashMap<>();
           ArrayList<Object> tables = new ArrayList<>();
           HashMap<String, Object> map1 = new HashMap<>();
           map1.put("text", "kmood-文本占位输出-循环1");
           map1.put("text1", "kmood-文本占位输出2-循环1");
           tables.add(map1);
           HashMap<String, Object> map2 = new HashMap<>();
           map2.put("text", "kmood-文本占位输出-循环2");
           map2.put("text1", "kmood-文本占位输出2-循环2");
           tables.add(map2);
           map.put("tables",map);
           //编译输出
           DocumentProducer dp = new DocumentProducer(ActualModelPath);
           String complie = dp.Complie(xmlPath, "textf.xml", true);
           dp.produce(map, ExportFilePath);
   ```
>>#### 实现效果
<div align=center><img src="https://github.com/kmood/officeexport-java/blob/master/file/textf.png"/></div>

>### 示例3-文本、表格循环输出
>>#### 代码实例
   ```java
           //准备数据
          HashMap<String, Object> map = new HashMap<>();
          ArrayList<Object> tables = new ArrayList<>();
          HashMap<String, Object> map1 = new HashMap<>();
          map1.put("text", "kmood-文本占位输出-循环1");
          map1.put("text1", "kmood-文本占位输出2-循环1");
          //表格数据
          ArrayList<Object> columns1= new ArrayList<>();
          HashMap<String, Object> row = new HashMap<>();
          row.put("column1", "kmood-table1-column1-row1");
          row.put("column2", "kmood-table1-column2-row1");
          columns1.add(row);
          HashMap<String, Object> row2 = new HashMap<>();
          row2.put("column1", "kmood-table1-column1-row2");
          row2.put("column2", "kmood-table1-column2-row2");
          columns1.add(row2);
          map1.put("columns", columns1);
          tables.add(map1);
  
          HashMap<String, Object> map2 = new HashMap<>();
          map2.put("text", "kmood-文本占位输出-循环2");
          map2.put("text1", "kmood-文本占位输出2-循环2");
          //表格数据
          ArrayList<Object> columns2= new ArrayList<>();
          HashMap<String, Object> row3 = new HashMap<>();
          row3.put("column1", "kmood-table2-column1-row1");
          row3.put("column2", "kmood-table2-column2-row1");
          columns2.add(row3);
          HashMap<String, Object> row4 = new HashMap<>();
          row4.put("column1", "kmood-table2-column1-row2");
          row4.put("column2", "kmood-table2-column2-row2");
          columns2.add(row4);
          map2.put("columns", columns2);
  
          tables.add(map2);
          map.put("tables",tables);
          //编译输出
          DocumentProducer dp = new DocumentProducer(ActualModelPath);
          String complie = dp.Complie(xmlPath, "table.xml", true);
          dp.produce(map, ExportFilePath);
   ```
>>#### 实现效果
<div align=center><img src="https://github.com/kmood/officeexport-java/blob/master/file/textf-table.png"/></div>

>### 示例4-图片输出
 docx文档中图片占位 : 文本占位： {^mypicture^} ;图片占位:（在图片的可选文字中配置占位符{^mypicture^}）详见[**wiki**](https://github.com/kmood/officeexport-java/wiki) 

>>#### 代码实例
   ```java
        Class<? extends Class> aClass = Main.class.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        if (classLoader == null){
           classLoader = ClassLoader.getSystemClassLoader();
        }
        String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
        String xmlPath = classLoader.getResource("./model").toURI().getPath();
        String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/picture.doc";
        
        HashMap<String, Object> map = new HashMap<>();
        //读取输出图片
        URL introUrl = classLoader.getResource("./picture/exportTestPicture-intro.png");
        URL codeUrl = classLoader.getResource("./picture/exportTestPicture-code.png");
        URL titleUrl = classLoader.getResource("./picture/exportTestPicture-title.png");
        
        String intro = Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(introUrl.toURI().getPath()));
        map.put("intro", intro);
        String code = Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(codeUrl.toURI().getPath()));
        map.put("code", code);
        map.put("title", Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(titleUrl.toURI().getPath())));
        //编译输出
        DocumentProducer dp = new DocumentProducer(ActualModelPath);
        String complie = dp.Complie(xmlPath, "picture.xml", true);
        dp.produce(map, ExportFilePath);
   ```
>>#### 实现效果
<div align=center><img src="https://github.com/kmood/officeexport-java/blob/master/file/picture.png"/></div>

  >>[完整导出示例](https://github.com/kmood/officeexport-java/blob/master/src/main/java/main/Main.java)


中文文档：[**https://github.com/kmood/officeexport-java/wiki**](https://github.com/kmood/officeexport-java/wiki)
## 建议和完善
欢迎在GitHub Issue中提问和交流。有问题可通过微信咨询： **1761104164、18330019132**
## 贡献者



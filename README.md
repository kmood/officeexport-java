# officeexport-java

 ![jdk1.6+](https://img.shields.io/badge/jdk-1.6%2B-orange.svg) 
 ![freemarker-2.3.28+](https://img.shields.io/badge/freemarker-2.3.28%2B-orange.svg)
 ![](https://img.shields.io/badge/platform-all-orange.svg)
 ![](https://img.shields.io/badge/language-java-orange.svg)
 

officeexport-java基于[Apache FreeMarker](https://freemarker.apache.org)，遵从*模板 + 数据模型 = 输出*的理念，
通过极简API实现javaBean即数据源，模板即样式的Word导出，提供以下功能：

  * 基本文本的输出，文本占位符样式即输出文本样式。
  * 文本行、表格行单行或多行的遍历输出，并能够进行循环嵌套。
  * 提供数据处理的插件，通过添加处理器可定制任意输出值，例如：特定项的日期、数字等文本格式转换
  * 图片保留样式的输出。
 
## 解决的问题以及现有实现方案的对比

工具主要为减少word模板导出的复杂性而设计，使用者无需了解如poi Api、Freemarker等语法即可实现导出。

现有方案对比：

| 方案 | 跨平台 | 易用性
| --- | --- | --- |
| Freemarker | 跨平台  | 需要掌握freemarker的语法，配置xml结构，复杂模型导出非常繁琐
| Apache POI | Java组件，跨平台 | 需要掌握POIApi，对于复杂样式配置起来很复杂
| **officeexport** | **Java组件，跨平台** | **拥有极简API，极简的模板语法，模板样式即输出样式（模板样式直接通过word调整）**



## 快速开始
>### 代码示例
   >>1、调整word模板，添加占位符，并转换到word 2003 xml文档（.xml）。
   
   >>2、Maven引入jar包，通过api导出

   ```xml
     
      <dependency>
          <groupId>com.github.kmood</groupId>
          <artifactId>officeexport-java</artifactId>
          <version>1.0.1.5-RELEASE</version>
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
   >>[测试用例源码](https://github.com/kmood/officeexport-java/blob/master/src/test/java/com/test/test.java)
   
   
   >>[完整导出示例](https://github.com/kmood/officeexport-java/blob/master/src/main/java/main/Main.java)
   

>### 实现效果
<div align=center><img src="https://github.com/kmood/officeexport-java/blob/master/file/exportExample.png"/></div>


>### 文本输出
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

>### 文本循环输出
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

>### 文本、表格循环输出
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


中文文档：[**https://github.com/kmood/officeexport-java/wiki**](https://github.com/kmood/officeexport-java/wiki)
## 建议和完善
欢迎在GitHub Issue中提问和交流。有问题可通过QQ咨询： **838979971**


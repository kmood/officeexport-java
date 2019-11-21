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

工具主要解决word模板导出的复杂性，使用者无需了解众多poi Api、Freemarker语法等即可实现导出。

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
          <version>1.0.1.2-RELEASE</version>
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
   

>### 实现效果

<div align=center><img src="https://github.com/kmood/officeexport-java/blob/master/file/exportExample.png"/></div>

中文文档：[**https://github.com/kmood/officeexport-java/wiki**](https://github.com/kmood/officeexport-java/wiki)
## 建议和完善
欢迎在GitHub Issue中提问和交流。有问题可通过QQ咨询： **2932808575**


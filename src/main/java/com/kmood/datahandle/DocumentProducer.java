package com.kmood.datahandle;

import com.kmood.utils.FileUtils;
import com.kmood.utils.StringUtil;
import com.kmood.utils.ZipUtils;
import com.kmood.word.WordModelHandlerImpl;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.lingala.zip4j.ZipFile;
import org.dom4j.DocumentException;

import java.io.*;

public class DocumentProducer {
    private ThreadLocal<String> ActualModelPathLocal = new ThreadLocal<>();
    private ThreadLocal<String> ActualModelNameLocal = new ThreadLocal<>();
    private ThreadLocal<String> ActualModelOriginPathLocal = new ThreadLocal<>(); // 记录模板文件绝对路径
    private ThreadLocal<String> ActualModelDocxPathLocal = new ThreadLocal<>(); // 记录docx文件解压后的xml文件路径
    public DocumentProducer(Configuration CustomerConfig,String ActualModelPath){
        FMConfiguration.Init(CustomerConfig);
        ActualModelPathLocal.set(ActualModelPath);
    }
    public DocumentProducer(String ActualModelPath)throws Exception{
        FMConfiguration.Init();
        Configuration configuration = FMConfiguration.addFMModelPath(ActualModelPath);
        ActualModelPathLocal.set(ActualModelPath);
    }
    public DocumentProducer()throws Exception{
        FMConfiguration.Init();
    }
    public String Complie(String XmlModelPath,String XmlModelName,boolean debugModel)throws Exception {
        // 增加支持docx文件模板渲染
        if("docx".equalsIgnoreCase(FileUtils.getFileSuffixByPath(XmlModelPath+File.separator+XmlModelName))){
            ActualModelOriginPathLocal.set(XmlModelPath+File.separator+XmlModelName);
            String docxFilePath=XmlModelPath+File.separator+XmlModelName;
            String compressPath=XmlModelPath+File.separator+XmlModelName.substring(0,XmlModelName.lastIndexOf(".") );
            new ZipFile(docxFilePath).extractAll(compressPath);
            XmlModelPath=XmlModelPath+File.separator+XmlModelName.substring(0,XmlModelName.lastIndexOf(".")) +File.separator+"word"+File.separator;
            XmlModelName="document.xml";
            FMConfiguration.clearFMModelPathArr();
            ActualModelPathLocal.remove();
            ActualModelDocxPathLocal.set(XmlModelPath+File.separator+XmlModelName);
        }
        if(StringUtil.isBlank(ActualModelPathLocal.get())){
            FMConfiguration.addFMModelPath(XmlModelPath);
            ActualModelPathLocal.set(XmlModelPath);
        }
        if (debugModel){
            WordModelHandlerImpl wordXmlModelHandler = new WordModelHandlerImpl();
            String path = wordXmlModelHandler.WordXmlModelHandle(XmlModelPath+File.separator+XmlModelName,ActualModelPathLocal.get());
        }
        ActualModelNameLocal.set(XmlModelName+".ftl");
        return XmlModelPath+File.separator+XmlModelName+".ftl";
    }
    //增加构造函数
    public void produce(Object data,String ProduceFilePath)throws IOException,TemplateException {
        String produceFilePathOrigin=ProduceFilePath;
        if("docx".equalsIgnoreCase(FileUtils.getFileSuffixByPath(ProduceFilePath))  ){
            ProduceFilePath=ActualModelDocxPathLocal.get();
        }
        Configuration configuration = FMConfiguration.getConfiguration();
        Template template = configuration.getTemplate(ActualModelNameLocal.get());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(ProduceFilePath), template.getEncoding());
        Object dataConvert = DataConverter.convert(data, null);
        template.process(dataConvert,outputStreamWriter);
        if("docx".equalsIgnoreCase(FileUtils.getFileSuffixByPath(produceFilePathOrigin))  ){
            String sourceFolderPath=ActualModelOriginPathLocal.get().substring(0,ActualModelOriginPathLocal.get().lastIndexOf("."));
            ZipUtils.compress(produceFilePathOrigin,sourceFolderPath);
        }
    }
    public void produce(Object data,OutputStream ProduceFileout)throws IOException,TemplateException {
        Configuration configuration = FMConfiguration.getConfiguration();
        Template template = configuration.getTemplate(ActualModelNameLocal.get());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(ProduceFileout, template.getEncoding());
        Object dataConvert = DataConverter.convert(data, null);
        template.process(dataConvert,outputStreamWriter);
    }
    public void produce(Object data,OutputStream ProduceFileout,Config config)throws IOException,TemplateException{
        Configuration configuration = FMConfiguration.getConfiguration();
        Template template = configuration.getTemplate(ActualModelNameLocal.get());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(ProduceFileout, template.getEncoding());
        Object dataConvert = DataConverter.convert(data, config);
        template.process(dataConvert,outputStreamWriter);
    }
    public void produce(Object data,String ProduceFilePath,Config config)throws IOException,TemplateException{
        Configuration configuration = FMConfiguration.getConfiguration();
        Template template = configuration.getTemplate(ActualModelNameLocal.get());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(ProduceFilePath), template.getEncoding());
        Object dataConvert = DataConverter.convert(data, config);
        template.process(dataConvert,outputStreamWriter);
    }
}

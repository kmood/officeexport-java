package com.kmood.datahandle;

import com.kmood.utils.StringUtil;
import com.kmood.word.WordModelHandlerImpl;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.dom4j.DocumentException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DocumentProducer {
    private ThreadLocal<String> ActualModelPathLocal = new ThreadLocal<>();
    private ThreadLocal<String> ActualModelNameLocal = new ThreadLocal<>();
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
    public void produce(Object data,String ProduceFilePath)throws IOException,TemplateException {
        Configuration configuration = FMConfiguration.getConfiguration();
        Template template = configuration.getTemplate(ActualModelNameLocal.get());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(ProduceFilePath), template.getEncoding());
        template.process(data,outputStreamWriter);
    }
    public void produce(Object data,String ProduceFilePath,Config config)throws IOException,TemplateException{
        Configuration configuration = FMConfiguration.getConfiguration();
        Template template = configuration.getTemplate(ActualModelNameLocal.get());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(ProduceFilePath), template.getEncoding());
        Object dataConvert = DataConverter.convert(data, config);
        template.process(dataConvert,outputStreamWriter);
    }
}

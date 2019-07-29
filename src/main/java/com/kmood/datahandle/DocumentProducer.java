package com.kmood.datahandle;

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

    public String Complie(String XmlModelPath,boolean debugModel)throws DocumentException,IOException {
        if (debugModel){
            WordModelHandlerImpl wordXmlModelHandler = new WordModelHandlerImpl();
            String path = wordXmlModelHandler.WordXmlModelHandle(XmlModelPath,ActualModelPathLocal.get());
        }
        File file = new File(XmlModelPath);
        String name = file.getName();
        ActualModelNameLocal.set(name+".ftl");
        return XmlModelPath+File.separator+name;
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

package com.kmood.datahandle;

import com.kmood.utils.StringUtil;

import java.util.HashMap;

public class Config {
    private ThreadLocal<HashMap<String,DataHandler>> configLocal = new ThreadLocal<>();
    private ThreadLocal<HashMap<String,String>> GlobalConfigocal = new ThreadLocal<>();
    public HashMap<String,DataHandler> getKeyConfMap(){
        return configLocal.get();
    }
    public HashMap<String,String> getKeyGlobalConfrMap(){
        return GlobalConfigocal.get();
    }
    public Config setKeyHandler(String path,DataHandler handler){
        HashMap<String, DataHandler> dataHandlerHashMap = configLocal.get();
        if (dataHandlerHashMap == null) dataHandlerHashMap = new HashMap<>();
        dataHandlerHashMap.put(StringUtil.removeInvisibleChar(path),handler);
        configLocal.set(dataHandlerHashMap);
        return this;
    }
    public Config setGlobalKeyHandler(GlobalConfItemEnum confItemEnum,String format){
        HashMap<String, String> StringHashMap = GlobalConfigocal.get();
        if (StringHashMap == null ) StringHashMap = new HashMap<>();
        StringHashMap.put(confItemEnum.getName(),format);
        GlobalConfigocal.set(StringHashMap);
        return this;
    }

}





package com.core.datahandle;

import com.core.utils.StringUtil;

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
        configLocal.get().put(StringUtil.removeInvisibleChar(path),handler);
        return this;
    }
    public Config setGlobalKeyHandler(GlobalConfItemEnum confItemEnum,String format){
        GlobalConfigocal.get().put(confItemEnum.getName(),format);
        return this;
    }



}





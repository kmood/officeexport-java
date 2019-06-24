package com.project.test.service;


/**
 * @Auther: SunBC
 * @Date: 2019/5/13 19:18
 * @Description:
 */
public class CustomCondition {
    static final ThreadLocal<String> LOCAL_CONDITION = new ThreadLocal<String>();

    public static void setLocalCond(String condition) {
        LOCAL_CONDITION.set(condition);
    }


    public static String getLocalCond() {
        return LOCAL_CONDITION.get();
    }

    public static void clearCond() {
        LOCAL_CONDITION.remove();
    }
}

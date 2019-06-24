package com.test.mybatis;


import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.util.PageObjectUtil;

/**
 * @Auther: SunBC
 * @Date: 2019/5/13 19:18
 * @Description:
 */
public class CustomCondition {
    static final ThreadLocal<String> LOCAL_CONDITION = new ThreadLocal<String>();

    protected static void setLocalCond(String condition) {
        LOCAL_CONDITION.set(condition);
    }

    public static String getLocalCond() {
        return LOCAL_CONDITION.get();
    }

    public static void clearCond() {
        LOCAL_CONDITION.remove();
    }
}

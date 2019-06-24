package com.project.redis.service;


import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Auther: SunBC
 * @Date: 2019/1/21 12:41
 * @Description:
 */
//@Component
public class LoginCheckFilter  implements Filter {
    private static final Logger logger = Logger.getLogger(LoginCheckFilter.class);
    @Autowired
    private RedisClient redisClient;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        StatefulRedisConnection<String, String> connect = null;
        try {
            HttpServletRequest req = (HttpServletRequest) servletRequest;
            HttpSession session = req.getSession();
            connect = redisClient.connect();
            RedisCommands<String, String> sync = connect.sync();
            Boolean expire = sync.expire("spring:session:sessions:expires:" + session.getId(), 1800);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connect != null){
                try {
                    connect.close();
                } catch (Exception e) {
                    logger.error("redis连接释放失败！！"+e);
                }
            }
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("1");
    }
}

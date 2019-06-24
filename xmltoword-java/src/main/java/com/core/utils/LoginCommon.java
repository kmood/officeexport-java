package com.core.utils;

import javax.servlet.http.HttpSession;

import com.project.basic.entity.PRIVS_USER;

import hprose.server.HproseHttpService;
import hprose.server.HttpContext;

/*得到当前登录人*/
public class LoginCommon {

	// 获取当前用户
	public static PRIVS_USER getValue(String attribute) {
		HttpContext context = HproseHttpService.getCurrentContext();
		HttpSession session = context.getSession();
		PRIVS_USER user = (PRIVS_USER) session.getAttribute(attribute);
		return user;
	}

	// 清空登录信息
	public static void loginOut() {
		HttpContext context = HproseHttpService.getCurrentContext();
		HttpSession session = context.getSession();
		session.removeAttribute("logineduser");
	}
}

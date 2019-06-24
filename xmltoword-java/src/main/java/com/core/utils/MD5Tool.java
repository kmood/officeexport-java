package com.core.utils;
import java.security.MessageDigest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author WHB
 * @time 2015年9月21日:上午9:05:06
 * @remark:
 */
public class MD5Tool {

	/**
	 * 记录日志
	 */
	private final static Log log = LogFactory.getLog(MD5Tool.class);

	/**
	 * 根据算法编译密码
	 * 
	 * @param password
	 *            密码
	 * @param algorithm
	 *            算法
	 * 
	 * @return 编译后的密码.
	 */
	public static String encodePassword(String password, String algorithm) {
		byte[] unencodedPassword = password.getBytes();

		MessageDigest md = null;

		try {
			// first create an instance, given the provider
			md = MessageDigest.getInstance(algorithm);
		} catch (Exception e) {
			log.error("Exception: " + e);

			return password;
		}

		md.reset();

		// call the update method one or more times
		// (useful when you don't know the size of your data, eg. stream)
		md.update(unencodedPassword);

		// now calculate the hash
		byte[] encodedPassword = md.digest();

		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < encodedPassword.length; i++) {
			if ((encodedPassword[i] & 0xff) < 0x10) {
				buf.append("0");
			}

			buf.append(Long.toString(encodedPassword[i] & 0xff, 16));
		}

		return buf.toString();
	}

	public static void main(String[] args) {
		// System.out.println(encodePassword("123","sha"));
		// System.out.println(encodePassword("123","md5"));
		System.out.println("123456".length());
		String jm =MD5("123", 32);
		System.out.println(Md5_6(jm));
	}

	// 加密后解密
	public static String JM(String inStr) {
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String k = new String(a);
		return k;
	}

	public static String MD5(String sourceStr, int bit) {
		String result = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(sourceStr.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			result = buf.toString();
			if (bit == 16) {
				result = buf.toString().substring(8, 24);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	private static final char code[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
			'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ',', '.', '/', ';', '\'', ':',
			'"', '[', ']', '{', '}', '\\', '|', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	/**
	 * 六位密码破解
	 */
	public static String Md5_6(String md5Password) {
		String testPassword;
		String result;
		for (int a = 0; a < code.length; a++) {
			testPassword = "";
			testPassword += code[a];
			for (int b = 0; b < code.length; b++) {
				testPassword = testPassword.substring(0, 1);
				testPassword += code[b];
				for (int c = 0; c < code.length; c++) {
					testPassword = testPassword.substring(0, 2);
					testPassword += code[c];
				for (int d = 0; d < code.length; d++) {
					testPassword = testPassword.substring(0, 3);
					testPassword += code[d];
					for (int e = 0; e < code.length; e++) {
						testPassword = testPassword.substring(0, 4);
						testPassword += code[e];
						for (int f = 0; f < code.length; f++) {
							testPassword = testPassword.substring(0, 5);
							testPassword += code[f];
							result = encodePassword(testPassword, "md5");
							if (md5Password.equals(result)) {
								return testPassword;
							}

						}
					}
				}
			}
		}
	}
		return null;
}
}

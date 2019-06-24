package com.core.bean;

import java.io.Serializable;
/**
 * 
 * @ClassName ResultBean
 * @Description TODO
 * @author SunBC
 * @date 2017年10月28日
 * @version V1.0
 */
public class ResultBean implements Serializable {
	public static final int RESULT_STATUS_SUCCED = 0;
	
	public static final int RESULT_STATUS_FAIL = 500;

	public static final int RESULT_STATUS_NOTLOGIN = 700;
	
	private static final long serialVersionUID = 1L;

	public ResultBean() {
		super();
	}
	
	public ResultBean(int status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public ResultBean(int status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	private int status;
	private String msg;
	private Object data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + status;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultBean other = (ResultBean) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResultBean [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}
	
}

/**  
 * @Title: ShowResultBean.java
 * @Package edu.zju.cst.vo
 * @author Zhao Qian
 */
package edu.zju.cst.vo;

import java.io.Serializable;

/**
 * 系统全局返回对象（前端）
 * @author Zhao Qian
 * @date 2018年11月22日
 * @version 1.0
 */
public class ShowResultBean<T> implements Serializable{
	
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;
	public static final int OK = 200;
	public static final int WANING = 300;
	public static final int ERROR = 500;

	public int stateCode;
	public String message;
	public T data;
	
	private ShowResultBean() {
		
	}
	private ShowResultBean(int stateCode, String message, T data) {
		super();
		this.stateCode = stateCode;
		this.message = message;
		this.data = data;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static <T> ShowResultBean<T> showResultOK(T data) {
		return new ShowResultBean<T>(OK, null, data);
	}

	public static <T> ShowResultBean<T> showResultError(String message) {
		return new ShowResultBean<T>(ERROR, message, null);
	}

}

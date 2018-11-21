/**  
 * @Title: PageBean.java
 * @Package edu.zju.cst.vo
 * @author Zhao Qian
 */
package edu.zju.cst.vo;

import java.io.Serializable;
import java.util.List;

/**
 *  分页对象
 * @author Zhao Qian
 * @date 2018年11月22日
 * @version 1.0
 */
public class PageBean<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private int stateCode = 200;
	private String message = "";
	private int limit;// 每页显示行数
	private long total;// 总页数
	private int pageNumber;// 当前页码
	private List<T> rows;// 当前页码数据

	public PageBean(int limit, long total, int pageNum, List<T> rows) {
		super();
		this.limit = limit;
		this.total = total;
		this.pageNumber = pageNum;
		this.rows = rows;
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

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}

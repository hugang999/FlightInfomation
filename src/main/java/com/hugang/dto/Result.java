package com.hugang.dto;

/**
 * 返回结果类
 * 
 * @author
 *
 * @param <T>
 */
public class Result {
	private boolean success;

	private Object data;

	private String message;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result() {

	}

	public Result(boolean success, Object data, String message) {
		super();
		this.success = success;
		this.data = data;
		this.message = message;
	}

	public static Result success(Object data) {
		return new Result(true, data, "调用成功");
	}

	public static Result failed(String message) {
		return new Result(false, null, message);
	}

}

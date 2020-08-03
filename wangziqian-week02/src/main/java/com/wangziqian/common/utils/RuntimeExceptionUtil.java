package com.wangziqian.common.utils;

public class RuntimeExceptionUtil extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RuntimeExceptionUtil() {
		super();
	}

	public RuntimeExceptionUtil(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RuntimeExceptionUtil(String message, Throwable cause) {
		super(message, cause);
	}

	public RuntimeExceptionUtil(String message) {
		super(message);
	}

	public RuntimeExceptionUtil(Throwable cause) {
		super(cause);
	}
	
}

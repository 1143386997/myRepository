package com.wangziqian.common.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	/**
	 *	1.断言为真 
	 */
	public static void isTrue(Boolean boolean1,String mes){
		if(Boolean.FALSE.equals(boolean1)){
			throw new RuntimeExceptionUtil(mes);
		}
	}
	/**
	 * 断言为假
	 */
	public static void isFalse(Boolean boolean1,String mes){
		if(Boolean.TRUE.equals(boolean1)){
			throw new RuntimeExceptionUtil(mes);
		}
	}
	/**
	 * 	3.断言对象不能为空
	 */
	public static void notNull(Object object,String mes){
		if(object==null){
			throw new RuntimeExceptionUtil(mes);
		}
	}
	/**
	 * 	4.断言对象必须为空
	 */
	public static void isNull(Object object,String mes){
		if(object!=null){
			throw new RuntimeExceptionUtil(mes);
		}
	}
	/**
	 *	5.断言集合不为空，对象不为空，以及必须包含一个元素 
	 */
	public static void notEmpty(Collection<?> collection,String mes){
		if(collection==null || collection.size()<=0){
			throw new RuntimeExceptionUtil(mes);
		}
	}
	/**
	 *	6.断言map集合不为空，必须包含一个元素 
	 */
	public static void notEmptyMap(Map<?,?> map,String mes){
		if(map==null || map.size()<=0){
			throw new RuntimeExceptionUtil(mes);
		}
	}
	/**
	 *	7.断言字符串必须有值，去掉字符串，判断长度是否大于0 
	 */
	public static void hasText(String str,String mes){
		if(str.trim().length()<=0 || str==null){
			throw new RuntimeExceptionUtil(mes);
		}
	}
	/**
	 * 8.断言值必须大于0 
	 */
	public static void greaterThanZero(int value,String mes){
		if(value<=0){
			throw new RuntimeExceptionUtil(mes);
		}
	}
}

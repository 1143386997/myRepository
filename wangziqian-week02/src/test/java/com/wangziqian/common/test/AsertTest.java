package com.wangziqian.common.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.wangziqian.common.utils.AssertUtil;

/**
 * 测试类
 */
public class AsertTest {
	/**
	 *	1.断言为真 
	 */
	@Test
	public void isTrue(){
		AssertUtil.isTrue(false,"这个为false");
	}
	 //断言为假
	@Test
	public void isFalse(){
		AssertUtil.isFalse(false,"这个为true");
	}
	//	3.断言对象不能为空
	@Test
	public void notNull(){
		String string = "你好";
		AssertUtil.notNull(string, "对象为空");
	}
	//	4.断言对象必须为空
	@Test
	public void isNull(){
		String string = null;
		AssertUtil.isNull(string, "字符串不为空");
	}
	//5.断言集合不为空，对象不为空，以及必须包含一个元素 
	@Test
	public void notEmpty(){
		ArrayList<String> arrayList = new ArrayList<String>();
		AssertUtil.notEmpty(arrayList,"集合为空");
	}
	//6.断言map集合不为空，必须包含一个元素 
	@Test
	public void notEmptyMap(){
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		AssertUtil.notEmptyMap(hashMap, "这个map容器为空");
	}
	//7.断言字符串必须有值，去掉字符串，判断长度是否大于0 
	@Test
	public void hasText(){
		String string = " ";
		AssertUtil.hasText(string, "这个字符串为空");
	}
	//8.断言值必须大于0 
	@Test
	public void greaterThanZero(){
		AssertUtil.greaterThanZero(5,"值小于0");
	}
}

package com.wangd.common;

import java.lang.reflect.Method;

public class HessianServiceImpl implements HessianService {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object getData(String className,String methodName,Object param){
		Object obj = null;
		try {
			Object object = SpringContextUtil.getBean(className);
			Class clazz = object.getClass();
			Method method = clazz.getMethod(methodName, Object.class);
			obj = method.invoke(object, param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}

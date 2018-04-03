package com.wangd.hessian_client;

import java.net.MalformedURLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianClientUtil {
	static Logger log = LoggerFactory.getLogger(HessianClientUtil.class);
	private static String hessianUrl= "http://127.0.0.1:8080/hessian-service/hessian/hessianService";
	
	public static <T> T getData(String className,String methodName,Object param) throws MalformedURLException{
		HessianProxyFactory factory = new HessianProxyFactory();
		HessianApi api = (HessianApi) factory.create(HessianApi.class, hessianUrl);
		return api.getData(className, methodName, param);
	}
}

package com.wangd.hessian_client;

public interface HessianApi {
	public <T> T getData(String className,String methodName,Object send);
}

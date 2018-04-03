package com.wangd.hessian_client;

import java.net.MalformedURLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			String str = HessianClientUtil.getData("testServiceImpl", "hello", "wangd");
			System.out.println(str);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    }
}

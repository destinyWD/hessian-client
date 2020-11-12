package com.wangd.service.impl;

import org.springframework.stereotype.Service;

import com.wangd.service.TestService;
@Service
public class TestServiceImpl implements TestService {

	public String hello(Object name) {
		String str = (String) name;
		return str;
	}



}

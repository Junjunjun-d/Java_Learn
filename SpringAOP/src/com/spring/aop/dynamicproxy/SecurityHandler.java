package com.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityHandler implements InvocationHandler {

	private Object tragetObject;

	public Object createProxyInstance(Object tragetObject) {
		this.tragetObject = tragetObject;

		return Proxy.newProxyInstance(tragetObject.getClass().getClassLoader(), tragetObject.getClass().getInterfaces(),
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		checkSecurity();
		// 调用目标方法
		Object rest = method.invoke(tragetObject, args);
		return rest;
	}

	private void checkSecurity() {
		System.out.println("------checkSecurity()-------");
	}

}

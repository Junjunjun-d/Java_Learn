package com.spring.aop.test1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityHandler {

	/*
	 * 定义Pointcut,名称为addMethod(),此方法没有返回值和参数，该方法就是一个标识（id），不进行调用
	 * 
	 * execution中第一个*表示返回值 add* 表示add开头的方法 (..) 匹配add方法里的参数
	 */
	@Pointcut("execution(* add*(..))")
	private void addAddMethod() {
	};

	/*
	 * 定义Advice，表示我们的Advice应用到哪些Pointcut订阅的JoinPoint上
	 */
	@Before("addAddMethod()")
	private void checkSecurity() {
		System.out.println("------checkSecurity()-------");
	}

}

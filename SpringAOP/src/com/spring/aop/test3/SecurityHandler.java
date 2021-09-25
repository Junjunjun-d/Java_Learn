package com.spring.aop.test3;

import org.aspectj.lang.JoinPoint;

public class SecurityHandler {
	private void checkSecurity(JoinPoint joinPoint) {
		for (int i = 0; i < joinPoint.getArgs().length; i++) {
			System.out.println(joinPoint.getArgs()[i]);
		}
		System.out.println(joinPoint.getSignature().getName());
		System.out.println("------checkSecurity()-------");
	}

}

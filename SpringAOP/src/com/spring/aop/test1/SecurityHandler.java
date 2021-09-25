package com.spring.aop.test1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityHandler {

	/*
	 * ����Pointcut,����ΪaddMethod(),�˷���û�з���ֵ�Ͳ������÷�������һ����ʶ��id���������е���
	 * 
	 * execution�е�һ��*��ʾ����ֵ add* ��ʾadd��ͷ�ķ��� (..) ƥ��add������Ĳ���
	 */
	@Pointcut("execution(* add*(..))")
	private void addAddMethod() {
	};

	/*
	 * ����Advice����ʾ���ǵ�AdviceӦ�õ���ЩPointcut���ĵ�JoinPoint��
	 */
	@Before("addAddMethod()")
	private void checkSecurity() {
		System.out.println("------checkSecurity()-------");
	}

}

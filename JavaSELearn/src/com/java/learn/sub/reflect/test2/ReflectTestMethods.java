package com.java.learn.sub.reflect.test2;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTestMethods {
	private static String className, m1Name, m2Name;

	static {// 静态代码块(加载的时候就会运行的代码块)读取car文件里的信息获取className,m1Name,m2Name
		InputStream is = null;
		try {
			is = ReflectTestMethods.class.getClassLoader().getResourceAsStream(
					"car.properties");
			Properties pro = new Properties();
			pro.load(is);

			className = pro.getProperty("className");
			m1Name = pro.getProperty("methodOneName");
			m2Name = pro.getProperty("metodTwoName");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void test() {
		try {
			Class class1 = Class.forName(className);

			Object object = class1.newInstance();
			Method m1 = class1.getDeclaredMethod(m1Name);
			Method m2 = class1.getDeclaredMethod(m2Name);

			m1.invoke(object);
			m2.invoke(object);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}

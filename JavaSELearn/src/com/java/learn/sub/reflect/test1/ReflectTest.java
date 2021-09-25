package com.java.learn.sub.reflect.test1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest {
	public static void test() {
		String classPath = "com.java.learn.sub.reflect.Student";
		try {
			Class cls = Class.forName(classPath);

			String name = cls.getName();
			System.out.println(name);

			Method[] methods = cls.getMethods();

			if (methods.length > 0) {
				for (Method method : methods) {
					// ���������η�
					int i = method.getModifiers();
					System.out.print(Modifier.toString(i) + " ");

					// ������
					String methodName = method.getName();
					System.out.println(methodName + " ");
				}

			}

			// ������η�
			int i2 = cls.getModifiers();
			System.out.println(Modifier.toString(i2));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

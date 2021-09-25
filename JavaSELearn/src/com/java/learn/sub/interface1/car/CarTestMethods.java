package com.java.learn.sub.interface1.car;


public class CarTestMethods {
	public static void test1() {
		IEngine iEngine1 = new HongQiEngine();
		IEngine iEngine2 = new QiRuiEngine();
		Car car = new Car();
		car.testEngine(iEngine1);
		System.out.println("-------------------------------");
		car.testEngine(iEngine2);
		System.out.println("================================");
		IDoor iDoor1 = new QiRuiDoor();
		IDoor iDoor2 = new HongQiDoor();
		car.testDoor(iDoor1);
		System.out.println("-------------------------------");
		car.testDoor(iDoor2);

	}
}

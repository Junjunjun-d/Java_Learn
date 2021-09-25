package com.java.learn.sub.interface1.car;

public class Car {
	public void testEngine(IEngine ie) {
		ie.start();
		ie.sqeedUp();
		ie.stop();
	}

	public void testDoor(IDoor id) {
		id.openDoor();
		id.closeDoor();
	}
}

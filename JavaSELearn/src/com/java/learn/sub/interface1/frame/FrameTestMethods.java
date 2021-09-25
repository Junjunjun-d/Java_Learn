package com.java.learn.sub.interface1.frame;

import java.awt.Color;

public class FrameTestMethods {
	public static void test1() {
		MyFrame mf = new MyFrame("´°¿ÚÒ»");
		mf.setSize(400, 500);
		mf.setLocation(400, 400);
		mf.setBackground(new Color(128, 128, 128));
		mf.addWindowListener(new MyWindowListener());
		mf.setVisible(true);

	}
}

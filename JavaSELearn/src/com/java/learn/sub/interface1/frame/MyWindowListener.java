package com.java.learn.sub.interface1.frame;

import java.awt.event.WindowEvent;

public class MyWindowListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}

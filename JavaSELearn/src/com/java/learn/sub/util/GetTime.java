package com.java.learn.sub.util;
import java.text.SimpleDateFormat;
import java.util.Date;


public /*abstract*/ class GetTime {
	public void getTime() {
		//格式时间: 月份的M要大写,分钟的要小写
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		long time01 = System.currentTimeMillis();//只能获取毫秒数
		System.out.println("当前时间的毫秒数: " + time01);
		
		String time02 = sdf.format(time01);
		System.out.println("当前时间: " + time02);
		
		Date time03 = new Date(); //获取系统时间
		System.out.println("当前时间: " + time03);
		
		String time04 = sdf.format(time03);
		System.out.println("当前时间: " + time04);
		
		//code();
	}
	
	//public abstract void code();
}

/*class SubGetTime extends GetTime{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("y");
		}
	}
}
*/
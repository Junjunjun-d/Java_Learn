package com.java.learn.sub.util;
import java.text.SimpleDateFormat;
import java.util.Date;


public /*abstract*/ class GetTime {
	public void getTime() {
		//��ʽʱ��: �·ݵ�MҪ��д,���ӵ�ҪСд
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		long time01 = System.currentTimeMillis();//ֻ�ܻ�ȡ������
		System.out.println("��ǰʱ��ĺ�����: " + time01);
		
		String time02 = sdf.format(time01);
		System.out.println("��ǰʱ��: " + time02);
		
		Date time03 = new Date(); //��ȡϵͳʱ��
		System.out.println("��ǰʱ��: " + time03);
		
		String time04 = sdf.format(time03);
		System.out.println("��ǰʱ��: " + time04);
		
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
package com.java.learn.sub.exercise;

public class TaxiFare {
	/**
	 * ���㳵��:ĳ�г����⳵�շѱ�׼Ϊ:3��������10Ԫ,3�����Ժ�����0.5�������1Ԫ;
	 * ÿ�ȴ�2.5���Ӽ���1Ԫ;����15�������ԭ�۵�50%Ϊ��ʻ��.
	 * Ҫ�󣺸�������������(��λ:����)�͵ȴ�ʱ��(��λ:��),���㳵��
	 */
	public static float taxiMoney(float km, int s) {
		float money = 0f;
		int timeMoney = s / 150;
		if (km <= 3.0f) {
			money = 10.0f;// �ȴ�ʱ��û150����1Ԫ,����ʱ����,
		} else if (km > 3.0f && km <= 15.0f) {
			money = 10 + (int) ((km - 3) / 0.5f);
		} else {
			money = (float) (1.5 * (10 + (int) ((km - 3) / 0.5f)));
		}

		return money + timeMoney;
	}
}

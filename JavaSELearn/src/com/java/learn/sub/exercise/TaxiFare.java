package com.java.learn.sub.exercise;

public class TaxiFare {
	/**
	 * 计算车费:某市出租租车收费标准为:3公里以内10元,3公里以后美加0.5公里加收1元;
	 * 每等待2.5分钟加收1元;超过15公里加收原价的50%为空驶费.
	 * 要求：给出任意的里程数(单位:公里)和等待时间(单位:秒),计算车费
	 */
	public static float taxiMoney(float km, int s) {
		float money = 0f;
		int timeMoney = s / 150;
		if (km <= 3.0f) {
			money = 10.0f;// 等待时间没150秒收1元,不足时不收,
		} else if (km > 3.0f && km <= 15.0f) {
			money = 10 + (int) ((km - 3) / 0.5f);
		} else {
			money = (float) (1.5 * (10 + (int) ((km - 3) / 0.5f)));
		}

		return money + timeMoney;
	}
}

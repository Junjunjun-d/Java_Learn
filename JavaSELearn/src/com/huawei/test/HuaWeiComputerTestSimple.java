package com.huawei.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class HuaWeiComputerTestSimple {

	/**
	 *
	 * @param ��Ϊ��������ϰ ��        ���������޳��������㲻��ԭ��
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// inversionInt();// 3 �����������
		// stringReverse();// 4 �ַ�����ת
		// printDrinkSodaResult(); // 5 ��ˮƿ
		// printRabbitAmount();// 6 ͳ��ÿ�������ӵ�����
		// printOutInt();// 7 iNOC��Ʒ��-������ǵı���
		// printPerfectNumber();// 8 ��ȫ��
		// printApple();// 9 ��ƻ��
		// printOneAmount();// 10 ��������������������1�ĸ���
		// printReset();// 11 �����ļ��ָ�
		// printResultBuyChicken();// 12 ��Ǯ��ټ�
		// dateTransformDays();// 13 �������ڵ�����ת��
		// argumentParsing();// 14 ��������
		// commonSubstringEvaluation();// 15 �����Ӵ�����
		// nicochusTheoremTest();// 16��Ƴ�˹����
		// twoDimensionalArrayManipulation();//17��λ�������
		// calculateCapital();// 18ͳ�ƴ�д��ĸ�ĸ���
		// longestPalindromeSubstring();// 19 ������Ӵ�
		// getMaxContinuousBit();//20 ���������bit��
		// getPasswordSecurityLevel();// 21 ����ǿ�ȵȼ�
		// printResultGird(); //22 �߷��񷽰���
		// getArithmeticSequenceSum();// 23 �Ȳ�����
		// stringReverse2(); //24 �ַ�����
		// printLeastCommonMultiple();//25 ����С������

	}

	/*
	 * 25 ����С��������������A��������B ����С��������ָ �ܱ�A��B��������С��������ֵ�����һ���㷨��������A��B����С��������
	 * ������������������еĽϴ�ֵ��ȥ��Сֵ��Ȼ���ڼ���������������֮��ѡȡ������Сֵ��������� ֱ�������ͱ�������ȣ��ó������������Լ����
	 */
	// �õ����Լ��
	public static int getGreatestCommonDivisor(int num1, int num2) {
		int num = 0;
		int temp = 0;
		if (num1 == num2) {
			num = num1;
		} else if (num1 > num2) {
			temp = num1 - num2;
			num = getGreatestCommonDivisor(temp, num2);

		} else {
			temp = num2 - num1;
			num = getGreatestCommonDivisor(num1, temp);
		}
		return num;
	}

	// ��ӡ��С������
	public static void printLeastCommonMultiple() {
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			num = num1 * num2 / getGreatestCommonDivisor(num1, num2);
			System.out.println(num);
		}

	}

	/*
	 * 24 �ַ�����:��һ���ַ���str�����ݵߵ��������������str�ĳ��Ȳ�����100���ַ���
	 */
	public static void stringReverse2() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			StringBuffer sb = new StringBuffer();
			sb.append(string);
			System.out.println(sb.reverse());
		}
		
		
	}

	/*
	 * 23 �Ȳ�����: ����:�Ȳ����� 2��5��8��11��14��������
	 * 
	 * ����:������N >0
	 * 
	 * ���:��Ȳ�����ǰN���
	 * 
	 * ����Ϊ�������룬��ʹ��while(cin>>)����ʽ��ȡ����
	 */
	public static void getArithmeticSequenceSum() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int inputInt = scanner.nextInt();
			int resultSum = 0;
			for (int i = 1; i <= inputInt; i++) {
				resultSum += 3 * i - 1;
			}
			System.out.println(resultSum);
		}
	}

	/*
	 * 22 �߷��񷽰����� �����n*m�����̸��ӣ�nΪ����ĸ�������mΪ����ĸ����������Ÿ��Ա�Ե�ߴ����Ͻ��ߵ����½ǣ�
	 * �ܹ��ж������߷���Ҫ�����߻�ͷ· ������ֻ�����Һ������ߣ���������������ߡ�
	 * 
	 * ���⺬�ж����������롣 2 2 6 1 2 3
	 */
	public static void printResultGird() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[] strs = scanner.nextLine().split(" ");
			int inputN = Integer.parseInt(strs[0]);
			int inputM = Integer.parseInt(strs[1]);
			System.out.println(diGuiSum(inputN, inputM));
		}

	}

	public static int diGuiSum(int n, int m) {
		int result = 0;
		if (m == 0 || n == 0) {
			result = 1;
		} else {
			result = diGuiSum(n - 1, m) + diGuiSum(n, m - 1);
		}

		return result;
	}

	/*
	 * 21 ����ǿ�ȵȼ��� ���밴���¹�����мƷ֣������ݲ�ͬ�ĵ÷�Ϊ������а�ȫ�ȼ����֡�
	 * 
	 * һ�����볤��:
	 * 
	 * 5 ��: С�ڵ���4 ���ַ�
	 * 
	 * 10 ��: 5 ��7 �ַ�
	 * 
	 * 25 ��: ���ڵ���8 ���ַ�
	 * 
	 * ������ĸ:
	 * 
	 * 0 ��: û����ĸ
	 * 
	 * 10 ��: ȫ����С����д��ĸ
	 * 
	 * 20 ��: ��Сд�����ĸ
	 * 
	 * ��������:
	 * 
	 * 0 ��: û������
	 * 
	 * 10 ��: 1 ������
	 * 
	 * 20 ��: ����1 ������
	 * 
	 * �ġ�����:
	 * 
	 * 0 ��: û�з���
	 * 
	 * 10 ��: 1 ������
	 * 
	 * 25 ��: ����1 ������
	 * 
	 * �塢����:
	 * 
	 * 2 ��: ��ĸ������
	 * 
	 * 3 ��: ��ĸ�����ֺͷ���
	 * 
	 * 5 ��: ��Сд��ĸ�����ֺͷ���
	 * 
	 * �������ֱ�׼:
	 * 
	 * >= 90: �ǳ���ȫ
	 * 
	 * >= 80: ��ȫ��Secure��
	 * 
	 * >= 70: �ǳ�ǿ
	 * 
	 * >= 60: ǿ��Strong��
	 * 
	 * >= 50: һ�㣨Average��
	 * 
	 * >= 25: ����Weak��
	 * 
	 * >= 0: �ǳ���
	 * 
	 * 
	 * ��Ӧ���Ϊ��
	 * 
	 * VERY_SECURE
	 * 
	 * SECURE,
	 * 
	 * VERY_STRONG,
	 * 
	 * STRONG,
	 * 
	 * AVERAGE,
	 * 
	 * WEAK,
	 * 
	 * VERY_WEAK,
	 * 
	 * 
	 * ���������������ַ��������а�ȫ������
	 * 
	 * ע��
	 * 
	 * ��ĸ��a-z, A-Z
	 * 
	 * ���֣�0-9
	 * 
	 * ���Ű������£� (ASCII��������UltraEdit�Ĳ˵�view->ASCII Table�鿴)
	 * 
	 * !"#$%&'()*+,-./ (ASCII�룺x21~0x2F)
	 * 
	 * :;<=>?@ (ASCII<=><=><=><=><=>�룺x3A~0x40)
	 * 
	 * [\]^_` (ASCII�룺x5B~0x60)
	 * 
	 * {|}~ (ASCII�룺x7B~0x7E)
	 */
	public static void getPasswordSecurityLevel() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String[] inputPwd = sr.nextLine().split("");
			int score = 0;
			int inputLength = inputPwd.length;
			String outputResult = "";

			// 1 ���볤��:
			if (inputLength <= 4) {
				score += 5;
			} else if (inputLength >= 5 && inputLength <= 7) {
				score += 10;
			} else {
				score += 25;
			}

			int numberCount = 0;// �������ֵĸ���
			int lowerCount = 0;// ����Сд��ĸ�ĸ���
			int upperCount = 0;// ������д��ĸ�ĸ���
			int symbolCount = 0;// ����������ŵĸ���
			
			for(int i= 0; i<inputLength;i++){
				String tempString = inputPwd[i];
				if (tempString.matches("[0-9]")) {
					numberCount += 1;
				} else if (tempString.matches("[a-z]")) {
					lowerCount += 1;
				} else if (tempString.matches("[A-Z]")) {
					upperCount += 1;
				} else {
					symbolCount += 1;
				}
			}
			// �ж����ֵĸ���
			if (numberCount == 0) {
				score += 0;
			} else if (numberCount == 1) {
				score += 10;
			} else {
				score += 20;
			}
			
			// �ж���ĸ�ĸ���
			if (lowerCount == 0 && upperCount == 0) {
				score += 0;
			} else if (lowerCount != 0 && upperCount != 0) {
				score += 20;
			} else {
				score += 10;
			}
			
			// �ж��ַ��ĸ���
			if (symbolCount == 0) {
				score += 0;
			} else if (symbolCount == 1) {
				score += 10;
			} else {
				score += 25;
			}

			// ������
			if (numberCount != 0 && lowerCount != 0 && upperCount != 0
					&& symbolCount != 0) {
				score += 5;
			} else if (numberCount != 0 && (lowerCount != 0 || upperCount != 0)
					&& symbolCount != 0) {
				score += 3;
			} else if (numberCount != 0 && (lowerCount != 0 || upperCount != 0)
					&& symbolCount == 0) {
				score += 2;
			}

			 if (score >= 90) {
				outputResult = "VERY_SECURE";
			} else if (score >= 80) {
				outputResult = "SECURE";
			} else if (score >= 70) {
				outputResult = "VERY_STRONG";
			} else if (score >= 60) {
				outputResult = "STRONG";
			} else if (score >= 50) {
				outputResult = "AVERAGE";
			} else if (score >= 25) {
				outputResult = "WEAK";
			} else {
				outputResult = "VERY_WEAK";
			}

			System.out.println(outputResult);
		}

	}

	/*
	 * 20 ���������bit������һ��byte���ֶ�Ӧ�Ķ�����������1�����������������3�Ķ�����Ϊ00000011���������2��1
	 * ���⺬�ж����������롣
	 */
	public static void getMaxContinuousBit() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			int inputInt = sr.nextInt();
			String binary = Integer.toBinaryString(inputInt);
			String[] strs = binary.split("0");// ���ַ�������0ȥ��ֳ����飬ȡ������󳤶����
			int maxLength = 0;
			for (int i = 0; i < strs.length; i++) {
				if (strs[i].length() >= maxLength) {
					maxLength = strs[i].length();
				}
			}
			System.out.println(maxLength);
		}
	}

	/*
	 * 19 ������Ӵ�������һ��������Сд��ĸ���ַ�����������������Ӵ��ĳ��ȡ�
	 * ��ν���Ĵ���ָ���ҶԳƵ��ַ�������ν�Ӵ���ָһ���ַ���ɾ���䲿��ǰ׺�ͺ�׺��Ҳ���Բ�ɾ�����ַ��� ��ע�⣺�ǵü���while������������������
	 * ������ cdabbacc abba 4 �� ע�⣺oo�������
	 * qhbrivaighqmgafhthxicdiixpefhwwefdebwczswqqdjxulhuhceqrxechddtlbbltddhcexrqechuhluxjdqqwszcwenakceymkxfqpqxct
	 * bsousrwwhooxjtcqnvb 56 0
	 */
	public static void longestPalindromeSubstring() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			// �������ȷ�ת�ַ�����Ȼ��ӷ�ת���ַ�����ȡ�Ӵ��жϣ�ԭ�ַ����Ƿ�����Ӵ����������������Ӵ����ȣ�ֱ���ҵ���󳤶�
			String inputString = sr.nextLine();
			int lengthString = inputString.length();// ����Ϊ1��2ʱ��Ȼ���ǻ��ģ�����Ҫ�ӳ���Ϊ3��ʼ
			int tempL1 = 0;
			int resultL = 0;
			for (int i = 3; i <= lengthString; i++) {
				for (int j = 0; j <= lengthString - i; j++) {
					String strs = inputString.substring(j, j + i);
					String strsTemp1 = strs.substring(0, (i + 1) / 2);
					String strsTemp2 = strs.substring((i + 1) / 2,
							strs.length());
					StringBuffer sBuffer = new StringBuffer(strsTemp2);
					strsTemp2 = sBuffer.reverse() + "";
					if (strsTemp1.equals(strsTemp2)) {
						tempL1 = strs.length();
						if (tempL1 > resultL) {
							resultL = tempL1;
						}
					}
				}
			}
			System.out.println(resultL);
		}
	}
	
	/*
	 * 18 ͳ�ƴ�д��ĸ�ĸ������ҳ������ַ����д�д�ַ�(��'A'-'Z')�ĸ�����
	 */
	public static void calculateCapital() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String inputString = scanner.nextLine();
			// ʹ��������ʽ ��ȡֻ������д��ĸ���ַ���
			String capitalString = inputString.replaceAll("[^A-Z$]", "");
			System.out.println(capitalString.length());
		}

	}

	/**
	 * 17 ��λ��������� 
	 * ��һ��m*n��С�����ݱ�������ν�������5�ֲ����� 
	 * 1.����m��n����ʼ��m*n��С�ı��
	 * 2.����x1,y1,x2,y2,����������(x1,y1)��(x2,y2)��������
	 * 3.����x��x���Ϸ���һ��
	 * 4.����y��y��������һ��
	 * 5.����x,y����ѯ������(x,y)�ĵ�Ԫ���ֵ
	 * ���д�����ж϶Ա��ĸ��ֲ����Ƿ�Ϸ���
	 * ��ϸҪ��:
	 * 1.���ݱ�������Ϊ9��*9�У��Ա����в���ʱ�����������Ӧ�÷��ش���
	 * 2.���ڲ������������������������������9����Ӧ���ش����������ɹ��������ݱ�ָ�����ʼ����m*n��С�������������Ӧ������
	 * 3.�������������������m*n��С�ı���к�����ֻ����0~m-1���к�����ֻ����0~n-1��������ΧӦ�÷��ش��󡣱��⺬�ж����������룡
	 * ��������:
	 * �������ݰ�����˳�����룺
	 * 1 ��������ֵ
	 * 2 Ҫ������������Ԫ�������ֵ
	 * 3 ����Ҫ������е���ֵ
	 * 4 ����Ҫ������е���ֵ
	 * 5 ����Ҫ��ѯ�ĵ�Ԫ�������
	 * 
	 * �������:
	 * ���������˳�������
	 * 1 ��ʼ������Ƿ�ɹ������ɹ��򷵻�0�� ���򷵻�-1
	 * 2 ���������Ԫ���Ƿ�ɹ�
	 * 3 ����������Ƿ�ɹ�
	 * 4 ����������Ƿ�ɹ�
	 * 5 �����ѯ��Ԫ�������Ƿ�ɹ�
	 * ��������                                 ������
	 * 4 9                0
	 * 5 1 2 6            -1
	 * 0                  0
	 * 8                  -1
	 * 2 3                0
	 * 
	 * 
	 * 4 7                0
	 * 4 2 3 2            -1
	 * 3                  0
	 * 3                  0
	 * 4 7                -1
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void twoDimensionalArrayManipulation()
				throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String firString;
			while ((firString = br.readLine()) != null) {
			String[] strs = firString.split(" ");
				int firLine = Integer.parseInt(strs[0]);
				int firColumn = Integer.parseInt(strs[1]);
				// 1
				if (firLine >= 0 && firLine <= 9 && firColumn >= 0 && firColumn <= 9) {
					System.out.println("0");
				} else {
					System.out.println("-1");
				}

				// 2
				String[] secString = br.readLine().split(" ");

			int x1 = Integer.parseInt(secString[0]);
				int y1 = Integer.parseInt(secString[1]);
				int x2 = Integer.parseInt(secString[2]);
				int y2 = Integer.parseInt(secString[3]);
				if (x1 >= 0 && x1 < firLine && y1 >= 0 && y1 < firColumn
						&& x2 >= 0 && x2 < firLine && y2 >= 0
						&& y2 < firColumn) {
					System.out.println("0");
				} else {
					System.out.println("-1");
				}

				// 3
				String line = br.readLine();

				int l1 = Integer.parseInt(line);
				if (l1 >= 0 && l1 < firLine && (firLine + 1) <= 9) {
					System.out.println("0");
				} else {
					System.out.println("-1");
				}
				// 4
				String column = br.readLine();
				int c1 = Integer.parseInt(column);
				if (c1 >= 0 && c1 < firColumn && (firColumn + 1) <= 9) {
					System.out.println("0");
				} else {
					System.out.println("-1");
				}

				// 5
				String thiString = br.readLine();

				int fLine = Integer.parseInt(thiString.split(" ")[0]);
				int fColumn = Integer.parseInt(thiString.split(" ")[1]);
				if (fLine >= 0 && fLine < firLine && fColumn >= 0
						&& fColumn < firColumn ) {
					System.out.println("0");
				} else {
					System.out.println("-1");
				}
			}
		br.close();
		}

	/**
	 * 16 ��Ƴ�˹����: ��֤��Ƴ�˹���������κ�һ������m������������д��m����������֮�͡�
	 * ���磺
	 * 1^3=1
	 * 2^3=3+5
	 * 3^3=7+9+11
	 * 4^3=13+15+17+19
	 * ����һ��������m��m��100������m������д��m����������֮�͵���ʽ����� ���⺬�ж�����������
	 */

	public static void nicochusTheoremTest() {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int m = scanner.nextInt();

			int tempInt = m * m - m + 1;
			String resultString = tempInt + "+";
			for (int i = 0; i < m - 1; i++) {
				tempInt += 2;
				resultString += tempInt + "+";
			}

			System.out.println(resultString.substring(0,
					resultString.length() - 1));

		}

	}

	/*
	 * 15 �����Ӵ����㣺��������ֻ����Сд��ĸ���ַ��������������ַ�������󹫹��Ӵ��ĳ��ȡ�
	 * ע���Ӵ��Ķ���ָһ���ַ���ɾ���䲿��ǰ׺�ͺ�׺��Ҳ���Բ�ɾ�����γɵ��ַ����� asdfas werasdfaswer
	 * bacefaebcdfabfaadebdaacabbdabcfffbdcebaabecefddfaceeebaeabebbad
	 * dedcecfbbbecaffedcedbadadbbfaafcafdd 4
	 */

	public static void commonSubstringEvaluation() {
		Scanner scanner = new Scanner(System.in);

		String tempString = "";
		String aString = scanner.nextLine();
		String bString = scanner.nextLine();

		int tempLength = 0;
		int aLength = aString.length();
		int bLength = bString.length();
		if (aLength > bLength) {
			tempLength = aLength;
			aLength = bLength;
			bLength = tempLength;

			tempString = aString;
			aString = bString;
			bString = tempString;
		}
		int length = 0;
		for (int i = 0; i < aLength; i++) {
			for (int j = i + 1; j <= aLength; j++) {
				tempString = aString.substring(i, j);
				if (bString.contains(tempString)) {
					tempLength = tempString.length();
					if (tempLength > length) {
						length = tempLength;
					}
				}
			}
		}

		System.out.println(length);

	}

	/**
	 * 14 �����������������������������
	 * xcopy /s c:\ d:\��
	 * �����������£�
	 * ����1��������xcopy
	 * ����2���ַ���/s
	 * ����3���ַ���c:\
	 * ����4: �ַ���d:\
	 * ���дһ��������������ʵ�ֽ������и�����������������
	 * ��������
	 * 1.�����ָ���Ϊ�ո�
	 * 2.������""���������Ĳ���������м��пո񣬲��ܽ���Ϊ�������������������������xcopy /s "C:\program files" "d:\" boolean;ʱ��
	 * ������Ȼ��4������3������Ӧ�����ַ���C:\program files��������C:\program��
	 * ע���������ʱ����Ҫ��""ȥ�������Ų�����Ƕ�������
	 * 3.����������
	 * 4.������������֤��������ֲ�����Ҫ�������
	 */
	public static void argumentParsing() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String[] string = scanner.nextLine().split(" ");// �����ո�������
			String tempString = "";
			boolean flag = false;
			ArrayList<String> result = new ArrayList();
			for (int i = 0; i < string.length; i++) {
				char charBeginString = string[i].charAt(0);
				char charEndString = string[i].charAt(string[i].length() - 1);
				int length = string[i].length() - 1;
				// ���������ÿ��Ԫ�أ�����ַ���Ԫ�صĵ�һ�������һ���ַ���",��ôֱ��ȥ����β���
				if (charBeginString == '"' && charEndString == '"') {

					// System.out.println(string[i].substring(1, length));
					result.add(string[i].substring(1, length));

				} else if (charBeginString == '"' && charEndString != '"') {
					// �����ʼ��"����β���ǣ���ôȥ���ݴ���һ����������flag
					tempString += string[i].substring(1) + " ";
					flag = true;

				} else if (charBeginString != '"' && charEndString == '"') {
					// �����ʼ����"����β�ǣ���ôȥβ���tempString������flagȥ��
					tempString += string[i].substring(0, length);
					// System.out.println(tempString);
					result.add(tempString);
					flag = false;

				} else {
					if (flag) {// �����������""���������������ϵ�Ԫ��ʱ
						tempString += string[i] + " ";
					} else {
						result.add(string[i]);
						// System.out.println(string[i]);
					}
				}
			}
			System.out.println(result.size());
			for (String string2 : result) {
				System.out.println(string2);

			}
		}
	}

	/*
	 * 13 �������ڵ�����ת��: ������������ڣ���������һ��ĵڼ��졣�� ���������ж��飬ע��ѭ������ 2012 12 31
	 */
	public static void dateTransformDays() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int days = 0;
			String[] strings = scanner.nextLine().split(" ");
			int dayTemp = Integer.parseInt(strings[2]);
					
			if(isLeapYear(strings[0])){
				days = getDaysFromMonth(strings[1]) + dayTemp + 1;
			} else {
				days = getDaysFromMonth(strings[1]) + dayTemp;
			}

			System.out.println(days);
		}

	}

	// �ж��Ƿ�������
	public static boolean isLeapYear(String year) {
		boolean flag = false;
		long y = Integer.parseInt(year);
		if ((y % 4 == 0 || y % 100 == 0) && (y % 400 != 0)) {
			flag = true;
		}
		return flag;
	}

	// ��ȡ���е�����
	public static int getDaysFromMonth(String month) {
		int m = Integer.parseInt(month);
		int days = 0;
		for (int i = 1; i < m; i++) {
			if(i == 2){
				days = days + 28;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				days = days + 30;
				
			} else {
				days = days + 31;
			}
		}
		
		return days;
	}

	/*
	 * 12 ��Ǯ��ټ�:��Ԫǰ�����ͣ��ҹ��Ŵ���ѧ�������ڡ��㾭��һ��������ˡ��ټ����⡱������һֵǮ�壬��ĸһֵǮ����������ֵǮһ��
	 * ��Ǯ��ټ����ʼ��̡���ĸ�����������Σ� x,y,z �ֱ��ʾ������ĸ����С����Ҫ����x+y+z = 100; 5x+3y+z/3 = 100
	 */
	public static void printResultBuyChicken() {
		int x, y, z;
		for (x = 0; x < 20; x++) {
			for (y = 0; y < 30; y++) {
				z = (100 - 3 * y - 5 * x) * 3;
				if ((x + y + z) == 100) {
					System.out.println(x + " " + y + " " + z);

				}
			}
		}

	}

	/**
	 11 �����ļ��ָ���
	              ��6�������������ִ�еĽ���ֱ��ǣ�
	               ��   ��	                                 ִ   ��
	     reset	             reset what
	     reset board	     board fault
	     board add	         where to add
	     board delete	     no board at all
	     reboot backplane	 impossible
	     backplane abort	 install first
	     he he	            unknown command
	              ע�⣺he he�������
	              Ϊ�˼����룬�����û����ԡ����Ψһƥ��ԭ��ƥ�䣺
	     1����ֻ����һ�ִ�����ֻƥ��һ���ؼ��ֵ������С��������룺r�����ݸù���ƥ������reset��ִ�н��Ϊ��reset what�����룺res�����ݸù���ƥ������reset��ִ�н��Ϊ��reset what��
	     2����ֻ����һ�ִ��������������������ؼ��֣���ƥ��ʧ�ܡ��������룺reb�������ҵ�����reboot backpalne�����Ǹ������������ؼ��ʣ�����ƥ��ʧ�ܣ�ִ�н��Ϊ��unknown command
	     3�����������ִ�������ƥ���һ�ؼ��֣������ƥ�䵫��Ψһ������ƥ��ڶ��ؼ��֣�����Բ�Ψһ��ƥ��ʧ�ܡ��������룺r b���ҵ�ƥ������reset board �� reboot backplane��ִ�н��Ϊ��unknown command��
	     4�����������ִ�������ƥ���һ�ؼ��֣������ƥ�䵫��Ψһ������ƥ��ڶ��ؼ��֣����Ψһ��ƥ��ɹ����������룺b a���޷�ȷ��������board add����backplane abort��ƥ��ʧ�ܡ�
	     5�����������ִ�����һ�ؼ���ƥ��ɹ�����ƥ��ڶ��ؼ��֣�����ƥ�䣬ʧ�ܡ��������룺bo a��ȷ��������board add��ƥ��ɹ���
	     6����ƥ��ʧ�ܣ���ӡ��unknown command��
	*/
	public static void printReset() {
		Scanner s = new Scanner(System.in);
		String s1 = "reset";
		String[] s2 = { "reset", "board" };
		String[] s3 = { "board", "add" };
		String[] s4 = { "board", "delete" };
		String[] s5 = { "reboot", "backplane" };
		String[] s6 = { "backplane", "abort" };
		String outString = "";

		while (s.hasNextLine()) {
			String[] inputString = s.nextLine().split(" ");
			if (inputString.length == 1) {
				if (s1.contains(inputString[0])) {
					outString = "reset what";
				} else {
					outString = "unknown command";
				}
			} else {
				String firstString = inputString[0];
				String secondString = inputString[1];
				int firstLength = firstString.length();
				int secondLength = secondString.length();
				int count = 0;
				if (firstLength <= s2[0].length()
						&& secondLength <= s2[1].length()) {
					if (s2[0].substring(0, firstLength).equals(firstString)
							&& s2[1].substring(0, secondLength).equals(
									secondString)) {
						outString = "board fault";
						count += 1;
					}
				}
				if (firstLength <= s3[0].length()
						&& secondLength <= s3[1].length()) {
					if (s3[0].substring(0, firstLength).equals(firstString)
							&& s3[1].substring(0, secondLength).equals(
									secondString)) {
						outString = "where to add";
						count += 1;
					}
				}

				if (firstLength <= s4[0].length()
						&& secondLength <= s4[1].length()) {
					if (s4[0].substring(0, firstLength).equals(firstString)
							&& s4[1].substring(0, secondLength).equals(
									secondString)) {
						outString = "no board at all";
						count += 1;
					}
				}

				if (firstLength <= s5[0].length()
						&& secondLength <= s5[1].length()) {
					if (s5[0].substring(0, firstLength).equals(firstString)
							&& s5[1].substring(0, secondLength).equals(
									secondString)) {
						outString = "impossible";
						count += 1;
					}
				}

				if (firstLength <= s6[0].length()
						&& secondLength <= s6[1].length()) {
					if (s6[0].substring(0, firstLength).equals(firstString)
							&& s6[1].substring(0, secondLength).equals(
									secondString)) {
						outString = "install first";
						count += 1;
					}
				}

				/*
				 * if(s2[0].contains(firstString)&&s2[1].contains(secondString)){
				 * //����ʹ��contains���������������ĸ��ʼƥ�� outString = "board fault"; count
				 * += 1; }
				 * if(s3[0].contains(firstString)&&s3[1].contains(secondString
				 * )){ outString = "where to add"; count += 1; }
				 * if(s4[0].contains
				 * (firstString)&&s4[1].contains(secondString)){ outString =
				 * "no board at all"; count += 1; }
				 * if(s5[0].contains(firstString
				 * )&&s5[1].contains(secondString)){ outString = "impossible";
				 * count += 1; }
				 * if(s6[0].contains(firstString)&&s6[1].contains(secondString
				 * )){ outString = "install first"; count += 1; }
				 */
				if (count != 1) {
					outString = "unknown command";
				}
			}
			System.out.println(outString);
		}
  }

	/*
	 * 10 ��������������������1�ĸ���:����һ�����������������ڶ������µ�1�ĸ�����
	 */
	public static void printOneAmount() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int count = 0;
			String binaryString = Integer.toBinaryString(scanner.nextInt());
			for (int i = 0; i < binaryString.length(); i++) {
				if (binaryString.charAt(i) == '1') {
					count++;
				}
			}
			System.out.println(count);
		}
	}


	/*
	 * 9 ��ƻ���� ��m��ͬ����ƻ������n��ͬ��������������е����ӿ��Ų��ţ��ʹ��ж����ֲ�ͬ�ķַ�������K��ʾ��5��1��1��1��5��1
	 * ��ͬһ�ַַ��� ���ݷ�Χ��0<=m<=10��1<=n<=10��
	 */
	public static int countApple(int m, int n) {
		// һ���� ���� û��ƻ�� ����һ�ַ���
		if (n == 1 || m == 0)
			return 1;
		// ���ӹ����������������Ӳ����κ����ã�������Ч������ m ��
		else if (n > m)
			return countApple(m, m);
		// ���һ�� ֻ�� b - 1������
		// ������� ÿ���������ȷ�һ��ƻ�����ȼ��� a - b��ƻ���ŵ� b ������
		else
			return countApple(m, n - 1) + countApple(m - n, n);
	}

	// ��ӡ���
	public static void printApple() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(countApple(a, b));
		}
	}

	/*
	 * 8 ��ȫ�����㣺��ȫ����Perfect number��,�ֳ����������걸������һЩ�������Ȼ��.
	 * �����е�������(���������������Լ��)�ĺ�(�����Ӻ���),ǡ�õ���������.
	 * ����:28,����Լ��1��2��4��7��14��28,��ȥ������28��,����5�������,1+2+4+7+14=28.
	 * ����n,�����n����(��n)��ȫ���ĸ���.���㷶Χ, 0 < n <= 500000
	 */
	public static int getPerfectNumber(int number) {
		int perfectNum = 0;
		if (number < 6) {
			perfectNum = 0;
		} else {
			for (int i = 6; i <= number; i++) {
				int sum = 0;
				// ͳ�������ĺͣ�������������1/2����
				for (int j = 1; j <= i / 2; j++) {
					if (i % j == 0) {
						sum += j;
					}
				}
				if (sum == i) {
					perfectNum++;
				}

			}
		}

		return perfectNum;
	}

	// ��ӡ���
	public static void printPerfectNumber() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			if (0 < number && number <= 500000) {
				System.out.println(getPerfectNumber(number));
			}
		}
	}


	/**
	 * 7 ������ǵı��� �� 
	 * 1 
	 * 1 1 1 
	 * 1 2 3 2 1 
	 * 1 3 6 7 6 3 1 
	 * 1 4 10 16 19 16 10 4 1
	 * ���������ε����󣬵�һ��ֻ��һ����1,����ÿ�е�ÿ����,��ǡ���Ǵ������������������λ,3����֮�� (���������ĳ��������Ϊ��������0)
	 * ���n�е�һ��ż�����ֵ�λ��.���û��ż��,�����-1.��������3,�����2������4�����3. ����n(n <= 1000000000)
	 * �����ж����������ݣ����뵽�ļ�ĩβ����ʹ��while(cin>>)�ȷ�ʽ���롣 
	 * ����:
	 * n =  1  2 3 4 5 6 7 8 9 10 11 12
	 * o = -1 -1 2 3 2 4 2 3 2 4  2  3
	 */
	public static int getOutInt(int inputNumber) {
		int outInt = 0;
		if (inputNumber == 1 || inputNumber == 2) {
			outInt = -1;
		} else if (inputNumber >= 3) {
			if (inputNumber % 2 == 1) {// nΪ������ż��λ�ڵ�2λ
				outInt = 2;
			} else if (inputNumber % 4 == 2) {// ��4ȡ��Ϊ2ʱ ż��λ�ڵ�4λ
				outInt = 4;
			} else {// ֱ���������߶�4ȡ��Ϊ0ʱ ż��λ�ڵ�3λ
				outInt = 3;
			}
		}
		return outInt;
	}

	// ��ӡ���
	public static void printOutInt() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			System.out.println(getOutInt(number));
		}
	}

	/*
	 * 6 ��һֻ���ӣ��ӳ������3������ÿ���¶���һֻ���ӣ�С���ӳ����������º�ÿ��������һֻ���ӣ� �������Ӷ���������ÿ���µ���������Ϊ���٣�
	 * ʱ���ᣨ�£�:1 2 3 4 5 6 7 ��������: 1 1 2 3 5 8 13
	 * ������һ��쳲���������,���Թ�ʽΪf(n)=f(n-1)+f(n-2); n<=2 ʱΪ1��
	 */
	// ��ȡ����
	private static int getRabbitAmount(int months) {
		int rabbitAmount = 0;
		if (months <= 2) {
			rabbitAmount = 1;
		} else {
			rabbitAmount = getRabbitAmount(months - 1)
					+ getRabbitAmount(months - 2);// �ݹ�
		}

		return rabbitAmount;
	}

	// ��ӡ���
	public static void printRabbitAmount() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			System.out.println(getRabbitAmount(number));
		}
	}

	/*
	 * 5 ��ˮƿ��������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ���
	 * ����5ƿ���������£�����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ���ȵ���ƿ���ģ�
	 * ��ʱ��ʣ2����ƿ�ӡ�Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ������Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣
	 * ���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ�
	 */
	// һ�����Ժȶ���ƿ��ˮ
	private static int getAllSodaBottle(int num) {
		int sum = 0;
		while (num >= 3) {
			sum += num / 3;
			num = num / 3 + num % 3;
		}
		if (num == 2) {
			sum++;
		}
		return sum;
	}

	// ��ӡ���
	public static void printDrinkSodaResult() {
		Scanner scanner = new Scanner(System.in);
		int count = 0;// ���ƴ���
		while (scanner.hasNextInt() && count < 10) {
			int number = scanner.nextInt();
			count++;
			if (number == 0) {
				break;
			} else {
				System.out.println(getAllSodaBottle(number));
			}
		}
	}

	/*
	 * 4 �ַ�����ת������һ��ֻ����Сд��ĸ���ַ�����Ȼ��������ַ�����ת����ַ��������ַ������Ȳ�����1000��
	 */
	public static void stringReverse() {
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			String str = s.nextLine();
			StringBuffer sBuffer = new StringBuffer(str);
			System.out.println(sBuffer.reverse());
		}

	}

	/*
	 * 3 ���ֵߵ�:����һ��������������������ַ�������ʽ�������.
	 * ���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001.
	 */
	public static void inversionInt() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			String num = scanner.nextInt() + "";// ������ת�����ַ���
			// StringBuffer sb = new StringBuffer(num);//
			// ʹ��stringbuffer�е�reverse()��ת����
			// System.out.println(sb.reverse());

			int length = num.length();
			String tempString = "";
			for (int i = length - 1; i >= 0; i--) {
				tempString += num.charAt(i) + "";
			}
			System.out.println(tempString);
		}
	}

}

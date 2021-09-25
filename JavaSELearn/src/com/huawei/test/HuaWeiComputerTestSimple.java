package com.huawei.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class HuaWeiComputerTestSimple {

	/**
	 *
	 * @param 华为机试题练习 简单        四则运算剔除不做（搞不懂原理）
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// inversionInt();// 3 整数逆行输出
		// stringReverse();// 4 字符串反转
		// printDrinkSodaResult(); // 5 汽水瓶
		// printRabbitAmount();// 6 统计每个月兔子的总数
		// printOutInt();// 7 iNOC产品部-杨辉三角的变形
		// printPerfectNumber();// 8 完全数
		// printApple();// 9 放苹果
		// printOneAmount();// 10 查找输入整数二进制中1的个数
		// printReset();// 11 配置文件恢复
		// printResultBuyChicken();// 12 百钱买百鸡
		// dateTransformDays();// 13 计算日期到天数转换
		// argumentParsing();// 14 参数解析
		// commonSubstringEvaluation();// 15 公共子串计算
		// nicochusTheoremTest();// 16尼科彻斯定理
		// twoDimensionalArrayManipulation();//17二位数组操作
		// calculateCapital();// 18统计大写字母的个数
		// longestPalindromeSubstring();// 19 最长回文子串
		// getMaxContinuousBit();//20 求最大连续bit数
		// getPasswordSecurityLevel();// 21 密码强度等级
		// printResultGird(); //22 走方格方案数
		// getArithmeticSequenceSum();// 23 等差数列
		// stringReverse2(); //24 字符逆序
		// printLeastCommonMultiple();//25 求最小公倍数

	}

	/*
	 * 25 求最小公倍数：正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
	 * 更相减损法是拿两个数中的较大值减去较小值，然后在减数、被减数、差之间选取两个较小值继续相减， 直到减数和被减数相等，得出的数就是最大公约数。
	 */
	// 得到最大公约数
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

	// 打印最小公倍数
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
	 * 24 字符逆序:将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
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
	 * 23 等差数列: 功能:等差数列 2，5，8，11，14。。。。
	 * 
	 * 输入:正整数N >0
	 * 
	 * 输出:求等差数列前N项和
	 * 
	 * 本题为多组输入，请使用while(cin>>)等形式读取数据
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
	 * 22 走方格方案数： 请计算n*m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，
	 * 总共有多少种走法，要求不能走回头路 ，即：只能往右和往下走，不能往左和往上走。
	 * 
	 * 本题含有多组样例输入。 2 2 6 1 2 3
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
	 * 21 密码强度等级： 密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
	 * 
	 * 一、密码长度:
	 * 
	 * 5 分: 小于等于4 个字符
	 * 
	 * 10 分: 5 到7 字符
	 * 
	 * 25 分: 大于等于8 个字符
	 * 
	 * 二、字母:
	 * 
	 * 0 分: 没有字母
	 * 
	 * 10 分: 全都是小（大）写字母
	 * 
	 * 20 分: 大小写混合字母
	 * 
	 * 三、数字:
	 * 
	 * 0 分: 没有数字
	 * 
	 * 10 分: 1 个数字
	 * 
	 * 20 分: 大于1 个数字
	 * 
	 * 四、符号:
	 * 
	 * 0 分: 没有符号
	 * 
	 * 10 分: 1 个符号
	 * 
	 * 25 分: 大于1 个符号
	 * 
	 * 五、奖励:
	 * 
	 * 2 分: 字母和数字
	 * 
	 * 3 分: 字母、数字和符号
	 * 
	 * 5 分: 大小写字母、数字和符号
	 * 
	 * 最后的评分标准:
	 * 
	 * >= 90: 非常安全
	 * 
	 * >= 80: 安全（Secure）
	 * 
	 * >= 70: 非常强
	 * 
	 * >= 60: 强（Strong）
	 * 
	 * >= 50: 一般（Average）
	 * 
	 * >= 25: 弱（Weak）
	 * 
	 * >= 0: 非常弱
	 * 
	 * 
	 * 对应输出为：
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
	 * 请根据输入的密码字符串，进行安全评定。
	 * 
	 * 注：
	 * 
	 * 字母：a-z, A-Z
	 * 
	 * 数字：0-9
	 * 
	 * 符号包含如下： (ASCII码表可以在UltraEdit的菜单view->ASCII Table查看)
	 * 
	 * !"#$%&'()*+,-./ (ASCII码：x21~0x2F)
	 * 
	 * :;<=>?@ (ASCII<=><=><=><=><=>码：x3A~0x40)
	 * 
	 * [\]^_` (ASCII码：x5B~0x60)
	 * 
	 * {|}~ (ASCII码：x7B~0x7E)
	 */
	public static void getPasswordSecurityLevel() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String[] inputPwd = sr.nextLine().split("");
			int score = 0;
			int inputLength = inputPwd.length;
			String outputResult = "";

			// 1 密码长度:
			if (inputLength <= 4) {
				score += 5;
			} else if (inputLength >= 5 && inputLength <= 7) {
				score += 10;
			} else {
				score += 25;
			}

			int numberCount = 0;// 包含数字的个数
			int lowerCount = 0;// 包含小写字母的个数
			int upperCount = 0;// 包含大写字母的个数
			int symbolCount = 0;// 包含特殊符号的个数
			
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
			// 判断数字的个数
			if (numberCount == 0) {
				score += 0;
			} else if (numberCount == 1) {
				score += 10;
			} else {
				score += 20;
			}
			
			// 判断字母的个数
			if (lowerCount == 0 && upperCount == 0) {
				score += 0;
			} else if (lowerCount != 0 && upperCount != 0) {
				score += 20;
			} else {
				score += 10;
			}
			
			// 判断字符的个数
			if (symbolCount == 0) {
				score += 0;
			} else if (symbolCount == 1) {
				score += 10;
			} else {
				score += 25;
			}

			// 奖励分
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
	 * 20 求最大连续bit数：求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
	 * 本题含有多组样例输入。
	 */
	public static void getMaxContinuousBit() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			int inputInt = sr.nextInt();
			String binary = Integer.toBinaryString(inputInt);
			String[] strs = binary.split("0");// 把字符串根据0去拆分成数组，取其中最大长度输出
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
	 * 19 最长回文子串：给定一个仅包含小写字母的字符串，求它的最长回文子串的长度。
	 * 所谓回文串，指左右对称的字符串。所谓子串，指一个字符串删掉其部分前缀和后缀（也可以不删）的字符串 （注意：记得加上while处理多个测试用例）。
	 * 样例： cdabbacc abba 4 。 注意：oo不算回文
	 * qhbrivaighqmgafhthxicdiixpefhwwefdebwczswqqdjxulhuhceqrxechddtlbbltddhcexrqechuhluxjdqqwszcwenakceymkxfqpqxct
	 * bsousrwwhooxjtcqnvb 56 0
	 */
	public static void longestPalindromeSubstring() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			// 还可以先反转字符串，然后从反转的字符串中取子串判断，原字符串是否包含子串，如果包含，输出子串长度，直到找到最大长度
			String inputString = sr.nextLine();
			int lengthString = inputString.length();// 长度为1和2时显然不是回文，所以要从长度为3开始
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
	 * 18 统计大写字母的个数：找出给定字符串中大写字符(即'A'-'Z')的个数。
	 */
	public static void calculateCapital() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String inputString = scanner.nextLine();
			// 使用正则表达式 获取只包含大写字母的字符串
			String capitalString = inputString.replaceAll("[^A-Z$]", "");
			System.out.println(capitalString.length());
		}

	}

	/**
	 * 17 二位数组操作： 
	 * 有一个m*n大小的数据表，你会依次进行以下5种操作： 
	 * 1.输入m和n，初始化m*n大小的表格。
	 * 2.输入x1,y1,x2,y2,交换坐标在(x1,y1)和(x2,y2)的两个数
	 * 3.输入x在x行上方加一行
	 * 4.输入y在y列左边添加一列
	 * 5.输入x,y，查询坐标在(x,y)的单元格的值
	 * 请编写程序，判断对表格的各种操作是否合法。
	 * 详细要求:
	 * 1.数据表的最大规格为9行*9列，对表格进行操作时遇到超出规格应该返回错误。
	 * 2.对于插入操作，如果插入后行数或列数超过9了则应返回错误。如果插入成功了则将数据表恢复至初始化的m*n大小，多出的数据则应舍弃。
	 * 3.所有输入坐标操作，对m*n大小的表格，行号坐标只允许0~m-1，列号坐标只允许0~n-1。超出范围应该返回错误。本题含有多组样例输入！
	 * 输入描述:
	 * 输入数据按下列顺序输入：
	 * 1 表格的行列值
	 * 2 要交换的两个单元格的行列值
	 * 3 输入要插入的行的数值
	 * 4 输入要插入的列的数值
	 * 5 输入要查询的单元格的坐标
	 * 
	 * 输出描述:
	 * 输出按下列顺序输出：
	 * 1 初始化表格是否成功，若成功则返回0， 否则返回-1
	 * 2 输出交换单元格是否成功
	 * 3 输出插入行是否成功
	 * 4 输出插入列是否成功
	 * 5 输出查询单元格数据是否成功
	 * 输入样例                                 输出结果
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
	 * 16 尼科彻斯定理: 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
	 * 例如：
	 * 1^3=1
	 * 2^3=3+5
	 * 3^3=7+9+11
	 * 4^3=13+15+17+19
	 * 输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。 本题含有多组输入数据
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
	 * 15 公共子串计算：给定两个只包含小写字母的字符串，计算两个字符串的最大公共子串的长度。
	 * 注：子串的定义指一个字符串删掉其部分前缀和后缀（也可以不删）后形成的字符串。 asdfas werasdfaswer
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
	 * 14 参数解析：在命令行输入如下命令：
	 * xcopy /s c:\ d:\，
	 * 各个参数如下：
	 * 参数1：命令字xcopy
	 * 参数2：字符串/s
	 * 参数3：字符串c:\
	 * 参数4: 字符串d:\
	 * 请编写一个参数解析程序，实现将命令行各个参数解析出来。
	 * 解析规则：
	 * 1.参数分隔符为空格
	 * 2.对于用""包含起来的参数，如果中间有空格，不能解析为多个参数。比如在命令行输入xcopy /s "C:\program files" "d:\" boolean;时，
	 * 参数仍然是4个，第3个参数应该是字符串C:\program files，而不是C:\program，
	 * 注意输出参数时，需要将""去掉，引号不存在嵌套情况。
	 * 3.参数不定长
	 * 4.输入由用例保证，不会出现不符合要求的输入
	 */
	public static void argumentParsing() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String[] string = scanner.nextLine().split(" ");// 根基空格拆分数组
			String tempString = "";
			boolean flag = false;
			ArrayList<String> result = new ArrayList();
			for (int i = 0; i < string.length; i++) {
				char charBeginString = string[i].charAt(0);
				char charEndString = string[i].charAt(string[i].length() - 1);
				int length = string[i].length() - 1;
				// 遍历数组的每个元素，如果字符串元素的第一个和最后一个字符是",那么直接去掉收尾输出
				if (charBeginString == '"' && charEndString == '"') {

					// System.out.println(string[i].substring(1, length));
					result.add(string[i].substring(1, length));

				} else if (charBeginString == '"' && charEndString != '"') {
					// 如果开始是"而结尾不是，那么去首暂存这一个，并设立flag
					tempString += string[i].substring(1) + " ";
					flag = true;

				} else if (charBeginString != '"' && charEndString == '"') {
					// 如果开始不是"而结尾是，那么去尾输出tempString，并把flag去掉
					tempString += string[i].substring(0, length);
					// System.out.println(tempString);
					result.add(tempString);
					flag = false;

				} else {
					if (flag) {// 这种情况就是""里面有三个即以上的元素时
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
	 * 13 计算日期到天数转换: 根据输入的日期，计算是这一年的第几天。。 测试用例有多组，注意循环输入 2012 12 31
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

	// 判断是否是闰年
	public static boolean isLeapYear(String year) {
		boolean flag = false;
		long y = Integer.parseInt(year);
		if ((y % 4 == 0 || y % 100 == 0) && (y % 400 != 0)) {
			flag = true;
		}
		return flag;
	}

	// 获取月中的天数
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
	 * 12 百钱买百鸡:公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
	 * 百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？ x,y,z 分别表示公鸡，母鸡，小鸡，要满足x+y+z = 100; 5x+3y+z/3 = 100
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
	 11 配置文件恢复：
	              有6条配置命令，它们执行的结果分别是：
	               命   令	                                 执   行
	     reset	             reset what
	     reset board	     board fault
	     board add	         where to add
	     board delete	     no board at all
	     reboot backplane	 impossible
	     backplane abort	 install first
	     he he	            unknown command
	              注意：he he不是命令。
	              为了简化输入，方便用户，以“最短唯一匹配原则”匹配：
	     1、若只输入一字串，则只匹配一个关键字的命令行。例如输入：r，根据该规则，匹配命令reset，执行结果为：reset what；输入：res，根据该规则，匹配命令reset，执行结果为：reset what；
	     2、若只输入一字串，但本条命令有两个关键字，则匹配失败。例如输入：reb，可以找到命令reboot backpalne，但是该命令有两个关键词，所有匹配失败，执行结果为：unknown command
	     3、若输入两字串，则先匹配第一关键字，如果有匹配但不唯一，继续匹配第二关键字，如果仍不唯一，匹配失败。例如输入：r b，找到匹配命令reset board 和 reboot backplane，执行结果为：unknown command。
	     4、若输入两字串，则先匹配第一关键字，如果有匹配但不唯一，继续匹配第二关键字，如果唯一，匹配成功。例如输入：b a，无法确定是命令board add还是backplane abort，匹配失败。
	     5、若输入两字串，第一关键字匹配成功，则匹配第二关键字，若无匹配，失败。例如输入：bo a，确定是命令board add，匹配成功。
	     6、若匹配失败，打印“unknown command”
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
				 * //不能使用contains（），必须从首字母开始匹配 outString = "board fault"; count
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
	 * 10 查找输入整数二进制中1的个数:输入一个正整数，计算它在二进制下的1的个数。
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
	 * 9 放苹果： 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1
	 * 是同一种分法。 数据范围：0<=m<=10，1<=n<=10。
	 */
	public static int countApple(int m, int n) {
		// 一个盘 或者 没有苹果 代表一种方案
		if (n == 1 || m == 0)
			return 1;
		// 盘子过多情况，多余的盘子不起任何作用，最大的有效盘子是 m 个
		else if (n > m)
			return countApple(m, m);
		// 情况一： 只用 b - 1个盘子
		// 情况二： 每个盘子里先放一个苹果，等价于 a - b个苹果放到 b 个盘子
		else
			return countApple(m, n - 1) + countApple(m - n, n);
	}

	// 打印结果
	public static void printApple() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(countApple(a, b));
		}
	}

	/*
	 * 8 完全数计算：完全数（Perfect number）,又称完美数或完备数，是一些特殊的自然数.
	 * 它所有的真因子(即除了自身以外的约数)的和(即因子函数),恰好等于它本身.
	 * 例如:28,它有约数1、2、4、7、14、28,除去它本身28外,其余5个数相加,1+2+4+7+14=28.
	 * 输入n,请输出n以内(含n)完全数的个数.计算范围, 0 < n <= 500000
	 */
	public static int getPerfectNumber(int number) {
		int perfectNum = 0;
		if (number < 6) {
			perfectNum = 0;
		} else {
			for (int i = 6; i <= number; i++) {
				int sum = 0;
				// 统计因数的和，计数到该数的1/2即可
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

	// 打印结果
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
	 * 7 杨辉三角的变形 ： 
	 * 1 
	 * 1 1 1 
	 * 1 2 3 2 1 
	 * 1 3 6 7 6 3 1 
	 * 1 4 10 16 19 16 10 4 1
	 * 以上三角形的数阵，第一行只有一个数1,以下每行的每个数,是恰好是从其上面的数往左数三位,3个数之和 (如果不存在某个数，认为该数就是0)
	 * 求第n行第一个偶数出现的位置.如果没有偶数,则输出-1.例如输入3,则输出2，输入4则输出3. 输入n(n <= 1000000000)
	 * 本题有多组输入数据，输入到文件末尾，请使用while(cin>>)等方式读入。 
	 * 分析:
	 * n =  1  2 3 4 5 6 7 8 9 10 11 12
	 * o = -1 -1 2 3 2 4 2 3 2 4  2  3
	 */
	public static int getOutInt(int inputNumber) {
		int outInt = 0;
		if (inputNumber == 1 || inputNumber == 2) {
			outInt = -1;
		} else if (inputNumber >= 3) {
			if (inputNumber % 2 == 1) {// n为奇数是偶数位在第2位
				outInt = 2;
			} else if (inputNumber % 4 == 2) {// 对4取余为2时 偶数位在第4位
				outInt = 4;
			} else {// 直接其他或者对4取余为0时 偶数位在第3位
				outInt = 3;
			}
		}
		return outInt;
	}

	// 打印结果
	public static void printOutInt() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			System.out.println(getOutInt(number));
		}
	}

	/*
	 * 6 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子， 假如兔子都不死，问每个月的兔子总数为多少？
	 * 时间轴（月）:1 2 3 4 5 6 7 兔子数量: 1 1 2 3 5 8 13
	 * 发现是一个斐波那契数列,所以公式为f(n)=f(n-1)+f(n-2); n<=2 时为1，
	 */
	// 获取数量
	private static int getRabbitAmount(int months) {
		int rabbitAmount = 0;
		if (months <= 2) {
			rabbitAmount = 1;
		} else {
			rabbitAmount = getRabbitAmount(months - 1)
					+ getRabbitAmount(months - 2);// 递归
		}

		return rabbitAmount;
	}

	// 打印结果
	public static void printRabbitAmount() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			System.out.println(getRabbitAmount(number));
		}
	}

	/*
	 * 5 汽水瓶：有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
	 * 答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，
	 * 这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
	 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
	 */
	// 一共可以喝多少瓶汽水
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

	// 打印结果
	public static void printDrinkSodaResult() {
		Scanner scanner = new Scanner(System.in);
		int count = 0;// 控制次数
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
	 * 4 字符串反转：接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
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
	 * 3 数字颠倒:输入一个整数，将这个整数以字符串的形式逆序输出.
	 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001.
	 */
	public static void inversionInt() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			String num = scanner.nextInt() + "";// 将整型转化成字符型
			// StringBuffer sb = new StringBuffer(num);//
			// 使用stringbuffer中的reverse()反转最简洁
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

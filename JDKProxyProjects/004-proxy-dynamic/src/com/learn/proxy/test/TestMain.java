package com.learn.proxy.test;

/**
 * @Author: DZF
 * @Date: 2021-08-08 20:35
 * @Description: com.learn.proxy.test
 * @Version: 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        //基本数据类型存在于栈里，那么return备份的就是数据。
        // 而finally改变的是栈里的数据，但是不会改变备份数据，所以返回值不变。
        System.out.println(test());
        System.out.println();

        //而引用数据类型，数据存在于堆中开辟的空间里，而栈中存储的是堆的所对应的空间地址，
        // 因此return备份的是栈中的空间地址，但是finally改变的是堆中的数据，
        // 所以当return返回地址时，查找到堆中的数据就是被改变了
        System.out.println(test2());
        System.out.println();
        System.out.println(test3());
    }

    public static int test() {

        int num = 10;
        try {
            return num;
        } finally {
            num++;
            System.out.println("finally被执行");
            System.out.println("现在的num值是：" + num);
            //return num;
        }
    }

    public static StringBuilder test2() {

        StringBuilder sb = new StringBuilder("Hello");

        try {

            sb.append(" World");

            return sb;

        } catch (Exception e) {
            return sb;
        } finally {
            sb.append(" Finally");
            System.out.println("现在的sb值是：" + sb);
            //return sb.toString();
        }
    }

    public static String test3() {

        StringBuilder sb = new StringBuilder("Hello");

        try {

            sb.append(" World");

            return sb.toString();

        } catch (Exception e) {
            return sb.toString();
        } finally {
            sb.append(" Finally");
            System.out.println("现在的sb值是：" + sb);
            //return sb.toString();
        }
    }
}

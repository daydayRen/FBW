package it.duandian.com;

import java.util.Scanner;

/**
 * 
 * 一 根据题目要求输入三个个位数 判断是否输入错误
 * 
 * 补充： 由题可知要求6权重最高 优先判断6
 * 
 * 二 首个特殊子最为特殊 特殊判断 三 判断是否包含单个特殊数字 四 判断倍数
 * 
 * @author oneday
 *
 */
public class FBW {
	public static void main(String[] args) {
		// 一实现
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		judge(a);
		int b = sc.nextInt();
		judge(b);
		int c = sc.nextInt();
		judge(c);
		sc.close();

		// 二特殊中的特殊判断
		for (int i = 1; i <= 100; i++) {
			StringBuffer sb = new StringBuffer();// 用于类似包含两个数字倍数的数字
			if (Integer.toString(i).indexOf(Integer.toString(a)) >= 0) {//判断是否包含第一个特殊数字
				System.out.println("Fizz");
//				if (Integer.toString(i).indexOf(Integer.toString(b)) > 0
//						|| Integer.toString(i).indexOf(Integer.toString(c)) > 0)
					//System.out.print("Fizz");

			} else {
				// 判断倍数
				if (i % a == 0 || i % b == 0 || i % c == 0) {
					if (i % a == 0) {
						sb.append("Fizz");
					}
					if (i % b == 0) {
						sb.append("Buzz");
					}
					if (i % c == 0) {
						sb.append("Whizz");
					}
					System.out.println(sb);

				}

				else {
					System.out.println(i);
				}
			}
			
		}
	}

	/**
	 * 判断数字的正确性
	 * 
	 * @param n
	 */
	public static void judge(int n) {
		if (n < 1 || n > 9)
			System.out.println("worng number!");
	}
}

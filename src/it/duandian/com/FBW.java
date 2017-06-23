package it.duandian.com;

import java.util.Scanner;

/**
 * 
 * @author oneday
 *
 */
public class FBW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		judge(a);
		int b = sc.nextInt();
		judge(b);
		int c = sc.nextInt();
		judge(c);
		sc.close();
	}

	/**
	 * 判断数字的正确性
	 * @param n
	 */
	public static void judge(int n) {
		if (n < 1 || n > 9)
			System.out.println("worng number!");
	}
}

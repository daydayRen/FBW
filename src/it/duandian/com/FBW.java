package it.duandian.com;

import java.util.Scanner;

/**
 * 
 * һ
 *  ������ĿҪ������������λ�� �ж��Ƿ�������� 
 *  
 *   ���䣺
 *     �����֪Ҫ��6Ȩ����� 
 *     �����ж�6  
 *     
 * �� 
 * 	�׸���������Ϊ���� �����ж� 
 * ��
 * 	 �ж��Ƿ���������������� 
 * �� 
 * 	�жϱ���
 * 
 * @author oneday
 *
 */
public class FBW {
	public static void main(String[] args) {
		// һʵ��
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		judge(a);
		int b = sc.nextInt();
		judge(b);
		int c = sc.nextInt();
		judge(c);
		sc.close();
		// �������е������ж�
		for (int i = 1; i <= 100; i++) {
			if (Integer.toString(i).indexOf(Integer.toString(a)) > 0) {
				System.out.print("Fizz");
			} else if (Integer.toString(i).indexOf(Integer.toString(b)) > 0) {
				System.out.print("Fizz");
			} else if (Integer.toString(i).indexOf(Integer.toString(c)) > 0) {
				System.out.print("Fizz");
			}

			else {
				System.out.print(i);
			}

			System.out.println();
		}
	}

	/**
	 * �ж����ֵ���ȷ��
	 * @param n
	 */
	public static void judge(int n) {
		if (n < 1 || n > 9)
			System.out.println("worng number!");
	}
}

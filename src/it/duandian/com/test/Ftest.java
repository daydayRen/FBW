package it.duandian.com.test;

import org.junit.Test;

import it.duandian.com.FBW;

public class Ftest {

	@Test
	public void test() {
		FBW fbm = new FBW();
		System.out.println("1");
		fbm.judge(0);
		System.out.println("2");
		fbm.judge(3);
		System.out.println("3");
		fbm.judge(10);
	}

	@Test
	public void SixTest() {
		// �������е������ж�
		for (int i = 1; i <= 100; i++) {
			StringBuffer sb = new StringBuffer();// �������ư����������ֱ���������
			if (Integer.toString(i).indexOf(Integer.toString(3)) >= 0) {// �ж��Ƿ������һ����������
				System.out.println("Fizz");

			} else {
				System.out.println(i);
			}
		}
	}

	@Test
	public void FiveTest() {
		// �жϱ���
		for (int i = 1; i <= 100; i++) {
			StringBuffer sb = new StringBuffer();// �������ư����������ֱ���������
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				if (i % 3 == 0) {
					sb.append("Fizz");
				}
				if (i % 5 == 0) {
					sb.append("Buzz");
				}
				if (i % 7 == 0) {
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

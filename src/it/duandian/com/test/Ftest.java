package it.duandian.com.test;

import org.junit.Test;

import it.duandian.com.FBW;

public class Ftest {

	@Test
	public void test() {
		FBW fbm=new FBW();
		System.out.println("1");
		fbm.judge(0);
		System.out.println("2");
		fbm.judge(3);
		System.out.println("3");
		fbm.judge(10);
	}

}

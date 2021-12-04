package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] sArray = numLine.split(" ");//numLine으로 입력받은 값을 공백을 기준으로 끊어서 배열에 저장
		
		for(int i=0;i<sArray.length;i++) {
			int num = Integer.parseInt(sArray[i]);//String sArray를 int num으로 사용
			sum=num+sum;
		}
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}

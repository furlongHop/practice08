package com.javaex.ex08;

import java.util.Scanner;

public class Friend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요.");
		
		String[] listArray = new String[3]; // 친구 3명 정보를 배열에 저장
		String[] sArray =new String[3]; // 해당 친구의 정보 3종류를 배열에 저장
		
		for(int i=0;i<listArray.length;i++) {
			listArray[i]=sc.nextLine();//i번 배열에 (i+1)번 친구 정보 입력
			sArray = listArray[i].split(" ");//i번 배열에 입력된 정보 3종류를 공백으로 분할해 배열에 입력
		}	
		
		for(int j=0;j<sArray.length;j++) {
			//sArray에 분할해 입력한 친구 정보 출력
			System.out.println("이름:"+sArray[0]+" 핸드폰:"+sArray[1]+" 학교:"+sArray[2]);
		}
		
		sc.close();
	}
	

	
}

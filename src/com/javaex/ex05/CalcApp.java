package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	//객체 생성
    	Add add=new Add();
    	Div div=new Div();
    	Mul mul=new Mul();
    	Sub sub=new Sub();
    	
    	Scanner sc=new Scanner(System.in);
   
    	//무한 루프
    	while(true) {
    		System.out.print(">> ");
    		String numLine=sc.nextLine();
    		
    		if(numLine.equals("/q")) {//루프 종료 키워드
    			System.out.println("종료합니다.");
    			break;
    		}else {
    			String[] sArray=numLine.split(" "); //numLine을 공백으로 쪼개 배열에 입력
    			
    			int a=Integer.parseInt(sArray[0]);//첫 번째 숫자 자료형 변경
    			int b=Integer.parseInt(sArray[2]);//두 번째 숫자 자료형 변경
    			
    			switch(sArray[1]) {
    			case "+" :
    				add.setValue(a, b); //값 받아서 객체 필드에 저장
    				System.out.println(">> "+add.calculate());//메소드 호출
    				break;	
    			case "-" :
    				sub.setValue(a, b); 
    				System.out.println(">> "+sub.calculate());
    				break;	
    			case "*" :
    				mul.setValue(a, b); 
    				System.out.println(">> "+mul.calculate());
    				break;
    			case "/" :
    				div.setValue(a, b); 
    				System.out.println(">> "+div.calculate());
    				break;
    			default :
    				System.out.println("알 수 없는 연산입니다.");
    				break;
    			}//switch~case
    			
    		}//else
    	}//while
    
    	
    	
    	
    	
    	sc.close();
    	
    }
}

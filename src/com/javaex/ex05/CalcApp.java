package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int result = 0;
    
    	while(true){
    		
    		System.out.print(">>");
    		String input = sc.nextLine();
    		
    		String[] sArray = input.split(" ");
    		if(sArray[0].equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		} else {
    		
    			switch(sArray[1]){
        		case "+" :
        			Add a = new Add();
        			a.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
        			result = a.calculate();
        			System.out.println(">>" + result);
        			break;
        		case "-" :
        			Sub m = new Sub();
        			m.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
        			result = m.calculate();
        			System.out.println(">>" + result);
        			break;
        		case "*" :
        			Mul mul = new Mul();
        			mul.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
        			result = mul.calculate();
        			System.out.println(">>" + result);
        			break;
        		case "/" :
        			Div d = new Div();
        			d.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
        			result = d.calculate();
        			System.out.println(">>" + result);
        			break;
        		default :
        			System.out.println("알 수 없는 연산자입니다.");
        			break;
        		
        		}
        		
        	}
        	
    	}
    		
    	
    	
    	sc.close();
    	
    	

    }
}

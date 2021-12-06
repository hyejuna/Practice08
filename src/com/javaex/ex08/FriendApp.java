package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		
		
		Friend[] fArray = new Friend[3];
		
		for(int i=0; i<fArray.length; i++) {
			fArray[i] = new Friend();
			fArray[i].input(sc.nextLine()); // sc.next()로 하면 정우성만 입력 됨. 왜지????
		}
		
		for(int i=0; i<fArray.length; i++) {
			fArray[i].showInfo();
		}
		

		
		sc.close();

	}

}

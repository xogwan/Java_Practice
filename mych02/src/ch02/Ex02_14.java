package ch02;

import java.util.Scanner;

public class Ex02_14 { // 화면으로부터 입력받기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
			String input = sc.nextLine();
			int num = Integer.parseInt(input);
			System.out.println(num);
			
	}

}

package ch04;

import java.util.Scanner;

public class Ex04_20_21_22_23_24 { // break문 / continue문 / break문과 continue문 예제 / 이름 붙은 반복문 / 이름 붙은 반복문 예제
	public static void main(String[] args) {
//		int sum = 0;
//		int i = 0;
//		
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			++i;
//			sum += i;
//		}
//		System.out.println("i : " + i);
//		System.out.println("sum : " + sum);
//		for(int i = 0 ; i<10 ; i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		int menu = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. square");
			System.out.println("2. square root");
			System.out.println("3. log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) :");
			
			String str = sc.nextLine();
			menu = Integer.parseInt(str);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1<=menu && menu <=3)){
				System.out.println("번호를 잘못 선택하셨습니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는" + menu + "입니다.");
			break;
		}
	}

}

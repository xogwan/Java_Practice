package ch04;

import java.util.Scanner;

public class Ex04_5_6_7_8 { // if-else if문 / if-else if문 예제 / 중첩 if문 / 중첩 if문 예제
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		score = sc.nextInt();
		
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}
}

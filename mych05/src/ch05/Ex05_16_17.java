package ch05;

public class Ex05_16_17 { // 커맨드 라인을 통해 입력받기 / 이클립스에서 커맨드라인 매개변수 입력하기
	public static void main(String[] args) {
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i = 0; i< args.length ; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
		}
	}

}

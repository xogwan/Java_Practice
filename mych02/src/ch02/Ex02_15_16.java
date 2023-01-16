package ch02;

public class Ex02_15_16 { // 정수형의 오버플로우 / 부호있는 정수의 오버플로우
	public static void main(String[] args) {
		short sMin = -32768, sMax = 32767;
		char cMin = 0, cMax = 65535;
		
		System.out.println("sMin : " + (short)(sMin-1));
		System.out.println("sMax : " + (short)(sMax+1));
		System.out.println("cMin : " + (int)--cMin);
		System.out.println("cMax : " + (int)++cMax);
	}

}

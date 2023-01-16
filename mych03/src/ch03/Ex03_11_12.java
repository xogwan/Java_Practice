package ch03;

public class Ex03_11_12 { // Math.round()로 반올림하기 / 나머지 연산자
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000) / 1000.0;
		System.out.println(shortPi);
		
		double d = 3.141592; // 3.141을 얻으려면
		d = (int)(d*1000);
		System.out.println(d);
		d = d/1000.0;
		System.out.println(d);
		
		// 나머지 연산자
		int x = 10 ;
		int y = 8;
		System.out.printf("%d을 %d로 나누면,\n", x,y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n", x/y, x%y);
	}

}

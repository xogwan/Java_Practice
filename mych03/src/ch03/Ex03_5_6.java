package ch03;

public class Ex03_5_6 { // 증감 연산자 ++과 -- / 부호 연산자
	public static void main(String[] args) {
		int i = 5 , j = 0;
		
		j= i++;
		System.out.println(j);
		System.out.println(i);
		
		i = 5;
		j=0;
		
		j=++i;
		System.out.println(j);
		System.out.println(i);
		
		// 부호 연산자
		int z = -10;
		z = +z;
		System.out.println(z);
		
		z = -10;
		z = -z;
		System.out.println(z);
		
	}

}

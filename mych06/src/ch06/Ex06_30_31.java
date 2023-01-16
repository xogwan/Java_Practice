package ch06;

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class Ex06_30_31 { // 오버로딩(OverLoading) / 오버로딩(OverLoading) 예제
	public static void main(String[] args) {
		MyMath3 myMath3 = new MyMath3();
		System.out.println(myMath3.add(3,3));
		System.out.println(myMath3.add(3,3L));
		System.out.println(myMath3.add(3L,3));
		System.out.println(myMath3.add(3L,3L));
		
		int[] a = {100, 200, 300};
		
		System.out.println(myMath3.add(a));
	}

}

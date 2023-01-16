package ch06;

class MyMath{
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	
	long substract(long a, long b) {
		long result = a-b;
		return result;
	}
	
	long multiply(long a, long b) {
		long result = a*b;
		return result;
	}
	
	double divide(long a, long b) {
		long result = a/b;
		return result;
	}
	
	long max(long a, long b) {
		
		return a>b ? a:b ;
//				if(a>b) {
//			return a;
//		}else {
//			return b;
//		}
	}
	
}
public class Ex06_17_18_19 { // 메소드의 호출 / 메소드의 실행 흐름 / 메소드의 실행 흐름 예제
	public static void main(String[] args) {
		MyMath math = new MyMath();
		long result1 = math.add(5L,3L);
		long result2 = math.substract(5L,3L);
		long result3 = math.multiply(5L,3L);
		double result4 = math.divide(5L,3L);
		long max = math.max(5L,3L);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(max);
	}

}

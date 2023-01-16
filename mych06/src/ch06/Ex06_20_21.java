package ch06;

class MathReturn{
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) {
			return;
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
}
public class Ex06_20_21 { // return문 / 반환값
	public static void main(String[] args) {
		MathReturn mathReturn = new MathReturn();
		mathReturn.printGugudan(12);
		
	}

}

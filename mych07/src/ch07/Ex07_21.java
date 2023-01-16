package ch07;

class MyParent{
	private 		int prv;		// 같은 클래스
						int dft;		// 같은 패키지
	protected 	int prt;		// 같은 패키지 + 자손(다른 패키지)
	public 			int pub;	// 접근제한 없음.
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
public class Ex07_21 { // 접근 제어자(access modifier)
	public static void main(String[] args) {
		MyParent myParent = new MyParent();
//		System.out.println(myParent.prv); // 오류
		System.out.println(myParent.dft);
		System.out.println(myParent.prt);
		System.out.println(myParent.pub);
		
	}

}

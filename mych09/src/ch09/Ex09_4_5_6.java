package ch09;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind:" +kind+", number:"+number; 
	}
}

public class Ex09_4_5_6 { // Object클래스의 메소드 - hashCode() / Object클래스의 메소드 - toString() / toString()의 오버라이딩
	public static void main(String[] args) {
		Card c1 = new Card();		
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

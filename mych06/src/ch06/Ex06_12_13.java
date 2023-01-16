package ch06;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class Ex06_12_13 { // 클래스 변수와 인스턴스 변수 / 클래스 변수와 인스턴스 변수 예제
	public static void main(String[] args) {
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number +"이며, 크기는 (" + Card.width +"," + Card.height + ")");
		System.out.println("c2는 " + c2.kind + "," + c2.number +"이며, 크기는 (" + Card.width +"," + Card.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number +"이며, 크기는 (" + Card.width +"," + Card.height + ")");
		System.out.println("c2는 " + c2.kind + "," + c2.number +"이며, 크기는 (" + Card.width +"," + Card.height + ")");
	}

}

package ch06;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	
}
public class Ex06_6_7 { // 객체의 생성과 사용 / 객체의 생성과 사용 예제
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		t2=t1;
		t2.channelDown();
		System.out.print(t2.channel);
		
	}

}

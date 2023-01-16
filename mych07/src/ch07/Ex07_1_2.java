package ch07;

class Tv{
	boolean power; // 전원상태(on/off)
	int channel; //채널
	
	void power() {
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv{ // SmartTv는 Tv에 캡션(자막)을 보여주는 기능
	boolean caption; // 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption){ // 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}
public class Ex07_1_2 { // 상속 / 상속 예제
	public static void main(String[] args) {
		SmartTv smt = new SmartTv();
		smt.channel = 10;
		smt.channelUp();
		System.out.println(smt.channel);
		smt.displayCaption("Hello, World");
		smt.caption = true;
		smt.displayCaption("Hello, World");
	}
}

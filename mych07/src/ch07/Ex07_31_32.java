package ch07;

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "위치부터 play합니다.");
		}
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
	}
public class Ex07_31_32 { // 추상 클래스(abstract class) / 추상 메소드(abstract method)
	public static void main(String[] args) {
//		Player p = new Player();
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
	}
}

package ch07;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour<0 || hour>24) {
			return;
		}
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
}
public class Ex07_22 { // 캡슐화와 접근 제어자
	public static void main(String[] args) {
		
		Time t = new Time();
//		t.hour = 100;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(25);
		System.out.println(t.getHour());
		
	}

}

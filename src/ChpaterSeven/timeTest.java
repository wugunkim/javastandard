package ChpaterSeven;

public class timeTest {
	public static void main(String[] args) {
		Time time = new Time();
		time.setHour(2);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		
	}
}
class Time {
	private int hour;
	private int minute;
	private int second;
	
	private boolean isNotValidHour(int hour) {
		 return hour < 0 || hour > 23;
	}
	public int getHour() { return hour;}
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}
	public int getMinute() {return minute;}
}

package labs.blz;

import java.time.LocalDateTime;

public class Today {

	private int hour;
	private int min;
	private int sec;
	
	public Today() {
		
		LocalDateTime today = LocalDateTime.now();
		
		this.hour = today.getHour();
		this.min = today.getMinute();
		this.sec = today.getSecond();
		
		
		
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
	
	
}

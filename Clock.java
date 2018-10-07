package ljl10165101150;

public class Clock {
	private String city;
	private int timeOffset;
	private int localTime;
	
	public Clock(String city){
		this.city = city;
	}
	
	public Clock(String city, int timeOffset){
		this.city = city;
		this.timeOffset = timeOffset;
	}
	
	public int getTimeOffset(){
		return this.timeOffset;
	}
	
	public void setLocalTime(int utcTime){
		this.localTime = (utcTime + this.timeOffset) % 24;
	}
	
	public int getLocalTime(){
		return this.localTime;
	}
	
	public void printLocalTime(){
		System.out.println(this.city + "'s time is " + this.localTime);
	}
}

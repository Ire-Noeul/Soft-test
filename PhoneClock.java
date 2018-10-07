package ljl10165101150;



public class PhoneClock extends Clock{
	private int utcTime;
	
	public PhoneClock(String city, int timeOffset, int localtime){
		super(city, timeOffset);
		this.utcTime = localtime - super.getTimeOffset();
	}
	
	public void setCityLocalTime(CityClock cityClock){
		cityClock.setLocalTime(this.utcTime);
	}
}

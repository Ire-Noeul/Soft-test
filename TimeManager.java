package ljl10165101150;
import java.util.HashMap;
import java.util.Map;


public class TimeManager {
	private Map<String, Clock> allClocks = new HashMap<String, Clock>();
	private int utcTime;
	
	public void setUtcTime(int utcTime){
		this.utcTime = utcTime;
	}
	
	public int getUtcTime(){
		return this.utcTime;
	}
	
	public void addClock(String city, Clock clock){
		this.allClocks.put(city, clock);
	}
	
	public void deleteClock(String city){
		this.allClocks.remove(city);
	}
	
	public void setClocks(){
		for(Clock clock : allClocks.values())
			clock.setLocalTime(this.utcTime);
	}
	
	public void printClocks(){
		for(Clock clock : allClocks.values())
			clock.printLocalTime();
	}
	
	public int countClocks(){
		int cnt = 0;
		for(Clock clock : allClocks.values())
			cnt++;
		return cnt;
	}
}

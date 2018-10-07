package ljl10165101150.test;

import static org.junit.Assert.*;
import ljl10165101150.CityClock;
import ljl10165101150.TimeManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeManagerTest {
	private int utcTime;
	private TimeManager timeManager;
	private CityClock londonClock;
	private CityClock beijingClock;
	private CityClock sydneyClock;
	private CityClock newYorkClock;
	private CityClock moscowClock;
	
	@Before
	public void initialize(){
		utcTime = 7;
		timeManager = new TimeManager();
		londonClock = new CityClock("London", 0);
		beijingClock = new CityClock("Beijing", 8);
		sydneyClock = new CityClock("Sydney", 10);
		newYorkClock = new CityClock("New York", -5);
		moscowClock = new CityClock("Moscow", 4);
	}

	@Test
	public void utctime_should_be_7() {
		timeManager.setUtcTime(utcTime);
		assertEquals(7, utcTime);
	}

	@Test
	public void all_cityclocks_should_be_added_into_timemanager(){
		timeManager.addClock("London", londonClock);
		timeManager.addClock("Beijing", beijingClock);
		timeManager.addClock("Sydney", sydneyClock);
		timeManager.addClock("New York", newYorkClock);
		timeManager.addClock("Moscow", moscowClock);
		
		assertEquals(5, timeManager.countClocks());
	}
	
	@Test
	public void london_clock_local_time_should_be_7_if_utctime_is_7(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("London", londonClock);
		timeManager.setClocks();
		assertEquals(7, londonClock.getLocalTime());
	}
	
	@Test
	public void beijing_clock_local_time_should_be_15_if_utctime_is_7(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("Beijing", beijingClock);
		timeManager.setClocks();
		assertEquals(15, beijingClock.getLocalTime());
	}
	
	@Test
	public void sydney_clock_local_time_should_be_17_if_utctime_is_7(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("Sydney", sydneyClock);
		timeManager.setClocks();
		assertEquals(17, sydneyClock.getLocalTime());
	}
	
	@Test
	public void newyork_clock_local_time_should_be_2_if_utctime_is_7(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("New York", newYorkClock);
		timeManager.setClocks();
		assertEquals(2, newYorkClock.getLocalTime());
	}
	
	@Test
	public void moscow_clock_local_time_should_be_11_if_utctime_is_7(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("Moscow", moscowClock);
		timeManager.setClocks();
		assertEquals(11, moscowClock.getLocalTime());
	}
	
	@Test
	public void the_number_of_clocks_should_be_4_after_delete_moscow(){
		timeManager.addClock("London", londonClock);
		timeManager.addClock("Beijing", beijingClock);
		timeManager.addClock("Sydney", sydneyClock);
		timeManager.addClock("New York", newYorkClock);
		timeManager.addClock("Moscow", moscowClock);
		
		timeManager.deleteClock("Moscow");
		assertEquals(4, timeManager.countClocks());
	}
	
	@After
	public void test_is_successful(){
		System.out.println("Test is successful!");
	}
}

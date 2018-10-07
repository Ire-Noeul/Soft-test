package ljl10165101150.test;

import static org.junit.Assert.*;
import ljl10165101150.CityClock;
import ljl10165101150.PhoneClock;
import ljl10165101150.TimeManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SystemRunnerTest {
	private int utcTime;
	private TimeManager timeManager;
	private CityClock londonClock;
	private CityClock beijingClock;
	private CityClock sydneyClock;
	private CityClock newYorkClock;
	private CityClock moscowClock;
	private PhoneClock phoneClock;
	
	@Before
	public void innitialize(){
		utcTime = 8;
		timeManager = new TimeManager();
		londonClock = new CityClock("London", 0);
		beijingClock = new CityClock("Beijing", 8);
		sydneyClock = new CityClock("Sydney", 10);
		newYorkClock = new CityClock("New York", -5);
		moscowClock = new CityClock("Moscow", 4);
		phoneClock = new PhoneClock("Beijing", 8, utcTime + 8);
	}

	@Test
	public void london_clock_local_time_should_be_8_if_utctime_is_8(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("London", londonClock);
		phoneClock.setCityLocalTime(londonClock);
		assertEquals(8, londonClock.getLocalTime());
	}
	
	@Test
	public void beijing_clock_local_time_should_be_16_if_utctime_is_8(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("Beijing", beijingClock);
		phoneClock.setCityLocalTime(beijingClock);
		assertEquals(16, beijingClock.getLocalTime());
	}
	
	@Test
	public void sydney_clock_local_time_should_be_18_if_utctime_is_8(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("Sydney", sydneyClock);
		phoneClock.setCityLocalTime(sydneyClock);
		assertEquals(18, sydneyClock.getLocalTime());
	}
	
	@Test
	public void newyork_clock_local_time_should_be_3_if_utctime_is_8(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("New York", newYorkClock);
		phoneClock.setCityLocalTime(newYorkClock);
		assertEquals(3, newYorkClock.getLocalTime());
	}
	
	@Test
	public void moscow_clock_local_time_should_be_12_if_utctime_is_8(){
		timeManager.setUtcTime(utcTime);
		timeManager.addClock("Moscow", moscowClock);
		phoneClock.setCityLocalTime(moscowClock);
		assertEquals(12, moscowClock.getLocalTime());
	}
	
	@After
	public void test_is_successful(){
		System.out.println("Test is successful!");
	}
}

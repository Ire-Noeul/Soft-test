package ljl10165101150.test;

import static org.junit.Assert.*;
import ljl10165101150.CityClock;
import ljl10165101150.PhoneClock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PhoneClockTest {
	private PhoneClock phoneClock;
	private int utcTime;
	private CityClock beijingClock;

	@Before
	public void initialize(){
		utcTime = 7;
		phoneClock = new PhoneClock("Beijing", 8, utcTime +8);
		beijingClock = new CityClock("Beijing", 8);
	}
	
	@Test
	public void beijing_time_should_be_15_if_utctime_is_7_after_phone_sets() {
		phoneClock.setLocalTime(utcTime);
		phoneClock.setCityLocalTime(beijingClock);
		assertEquals(15, beijingClock.getLocalTime());
	}

	@After
	public void test_is_successful(){
		System.out.println("Test is successful!");
	}
}

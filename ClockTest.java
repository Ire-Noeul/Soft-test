package ljl10165101150.test;

import static org.junit.Assert.*;
import ljl10165101150.Clock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClockTest {
	private Clock beijingClock;
	private int utcTime;
	
	@Before
	public void initialize(){
		utcTime = 6;
		beijingClock = new Clock("Beijing", 8);
	}

	@Test
	public void beijing_clock_time_offset_should_be_8() {
		assertEquals(8, beijingClock.getTimeOffset());
	}

	@Test
	public void beijing_clock_local_time_should_be_14_if_utctime_is_6(){
		beijingClock.setLocalTime(utcTime);
		assertEquals(14, beijingClock.getLocalTime());
	}
	
	@After
	public void test_is_successful(){
		System.out.println("Test is successful!");
	}
}

package ljl10165101150;
import java.util.Scanner;


public class SystemRunner {
	public static void main(String[] args)
	{
		int utcTime;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入标准时间：");
		utcTime = in.nextInt();
		
		TimeManager manager = new TimeManager();
		manager.setUtcTime(utcTime);
		
		manager.addClock("Beijing", new CityClock("Beijing", 8));
		manager.addClock("London", new CityClock("London", 0));
		manager.addClock("Moscow", new CityClock("Moscow", 4));
		manager.addClock("Sydney", new CityClock("Sydney", 10));
		manager.addClock("New York", new CityClock("New York", -5));
		manager.setClocks();
		
		PhoneClock phone = new PhoneClock("Beijing", 8, utcTime + 8);
		phone.setLocalTime(utcTime);
		
		manager.printClocks();
	}
}

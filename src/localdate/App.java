package localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class App {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		//LocalDateTime timedate = LocalDateTime.now();
		LocalTime time = LocalTime.now();
		
		System.out.println(date);
		//System.out.println(timedate);
		System.out.println(time);
		
		int year =  2020;
		int month = 02;
		int day = 15;
		
		
		LocalDate myDate = LocalDate.of(year, month, day);
		System.out.println(myDate);
		
		if(date.equals(myDate)) {
			System.out.println("Service is due");
		}
		
		

	}

}

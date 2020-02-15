package periodictimedelay;

import java.time.LocalTime;

public class ShowTime implements Runnable {
	public void run() {
		
		LocalTime time = LocalTime.now();
		System.out.println("Time is: " + time);
	}

}

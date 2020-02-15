package timedelay;

import java.time.LocalTime;

public class App {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(10000);
			LocalTime time = LocalTime.now();
			System.out.println(time);
			
			
		} catch (InterruptedException e) {
			System.out.println("Got an exception!");
			e.printStackTrace();
		}
		

	}

}

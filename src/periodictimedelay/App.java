package periodictimedelay;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		
		ScheduledExecutorService myService = Executors.newScheduledThreadPool(1);
		
		ShowTime myTask = new ShowTime();
		
		myService.scheduleAtFixedRate(myTask, 0, 5, TimeUnit.SECONDS);
		
		

	}

}

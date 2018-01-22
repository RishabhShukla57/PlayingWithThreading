package threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadPoolManagement();
	}
	
	static void threadPoolManagement(){
		ScheduledExecutorService scheduledExecutorService =Executors.newScheduledThreadPool(2);
		
		Runnable task1 = ()->{
			System.out.println("Thread 1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable task2 = ()->{
			System.out.println("Thread 2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable task3 = ()->{
			System.out.println("Thread 3");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);
		scheduledExecutorService.schedule(task2, 5, TimeUnit.SECONDS);
		scheduledExecutorService.schedule(task3, 5, TimeUnit.SECONDS);
		
		scheduledExecutorService.shutdown();
		
		
		
		
		
	}

}

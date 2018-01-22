package threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadPoolManagement();
	}
	
	
	
	//Print 1 to 100 
	static void threadPoolManagement(){
		ExecutorService threadExecutorService = Executors.newFixedThreadPool(2);
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
		
		
		threadExecutorService.submit(task1);
		threadExecutorService.submit(task2);
		threadExecutorService.submit(task3);
		
		threadExecutorService.shutdown();
		
		
	}

}

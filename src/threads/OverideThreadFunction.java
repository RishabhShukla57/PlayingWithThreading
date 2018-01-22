package threads;

public class OverideThreadFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new ExtendingRunnableInterface());
		ExtendingThreadFunctionality etf = new ExtendingThreadFunctionality();
		etf.start();
		etf.run();
		thread.start();
		
		thread.run();
		
		

	}

}
class ExtendingRunnableInterface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ExtendingRunnableInterface Run method");
		
		
	}
	
	public synchronized void start(){
		System.out.println("ExtendingRunnableInterface start method");
		
	}
	
	
}

class ExtendingThreadFunctionality extends Thread{

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		//super.start();
		System.out.println("ThreadFunctionality Start method");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("ThreadFunctionality Run method");
	}
	
	
	
}

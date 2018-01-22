package threads;

public class ThreadClassEntends extends Thread {

	volatile boolean running =true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i =0;
		while(running){
				System.out.println("Thread Extension "+i);
				i++;
		}
				
	}
	
	public void shutdownThread(){
		running = false;
	}
	

}

package threads;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=0;i<n;i++){
			System.out.println("Thread Implementation runnable interface :: "+n);
		}
		
	}

	
	
}

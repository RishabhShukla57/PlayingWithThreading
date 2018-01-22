package ProducerConsumer;

public class ThreadService {
	public static final int BLOCKING_QUEUE = 3;
	ProduceConsumer pc = new ProduceConsumer(BLOCKING_QUEUE);
	

	public static void main(String[] args) {
		ThreadService ts = new ThreadService();
		ts.tasks();

		// TODO Auto-generated method stub

	}
	
	
	
	 void  tasks(){
		
		
		Thread task1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread task2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		task1.start();
		task2.start();
		try{
			task1.join(1000);
			task2.join(1000);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Exception thrown");
		}
		
		
		
		
	}
	
	
	
	

}

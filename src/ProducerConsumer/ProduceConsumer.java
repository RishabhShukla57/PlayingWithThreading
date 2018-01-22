package ProducerConsumer;

import java.util.LinkedList;

public class ProduceConsumer {
	LinkedList<Integer> queue = new LinkedList<>();
	int bufferSize;
	
	public ProduceConsumer(int bufferSize) {
		// TODO Auto-generated constructor stub
		this.bufferSize = bufferSize;
	}
	
	void produce() throws InterruptedException{
		int value=0;
		while(true){
			synchronized(this){
				
				if(queue.size()==bufferSize)
					wait();
				
				queue.add(value++);
				System.out.println("Number being added  : "+value);
				notify();
				Thread.sleep(2000);
			}
		}
	}
	
	
	void consume() throws InterruptedException{
		while(true){
			synchronized(this){
		
				if(queue.size()==0)
					wait();
				
				
				int addedNum = queue.removeFirst();
				System.out.println("Number being removed : "+addedNum );
				notify();
				Thread.sleep(2000);
			}
		}
	}
	
	
	
}

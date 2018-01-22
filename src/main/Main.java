package main;

import java.util.Scanner;

import threads.RunnableThread;
import threads.ThreadClassEntends;

public class Main {
	public static void main(String [] args) {
		Thread th =  new Thread(new RunnableThread());
		ThreadClassEntends threadClassEntends =  new ThreadClassEntends();
		//th.start();
		threadClassEntends.start();
		System.out.println("Press to stop");
		Scanner sc= new Scanner(System.in);
		sc.nextLine();
		System.out.println("Press to stop now ");
		threadClassEntends.shutdownThread();
	}
	
}

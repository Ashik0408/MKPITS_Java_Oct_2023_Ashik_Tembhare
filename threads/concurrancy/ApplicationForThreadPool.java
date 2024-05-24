package com.mkpits.threads.concurrancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationForThreadPool {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		
		for (int i = 1; i <=3; i++) {
			Runnable workers=new MyWorkerThread("Task "+i);
			executorService.execute(workers);	
		}
		
		executorService.shutdown();
		
		while(!executorService.isTerminated()) {};
		
		System.out.println("Finished All Thread...");

	}

}

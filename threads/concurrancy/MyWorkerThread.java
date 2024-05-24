package com.mkpits.threads.concurrancy;

public class MyWorkerThread  extends Thread{
	String task;
	
	public MyWorkerThread(String s)
	{
		this.task=s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(Strart) task = "+task);
		processmassage();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}

	private void processmassage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

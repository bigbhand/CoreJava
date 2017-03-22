package com.bb.corejava.threads;

public class InterruptDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread started..");
		
		
		CustomThread c=new CustomThread();
		
		Thread t=new Thread(c);
		
		t.start();
		
		Thread.sleep(1000*5);
		Thread.currentThread().interrupt();
		System.out.println(Thread.currentThread().interrupted());
		//System.out.println(t.interrupted());
		
		System.out.println(t.getName()+" is "+t.getState());
		
		Thread.sleep(1000*5);
		//t.resume();
		//Thread.currentThread().notify();
		t.join();


		
		
		System.out.println("Main Thread ended..");
	}

}

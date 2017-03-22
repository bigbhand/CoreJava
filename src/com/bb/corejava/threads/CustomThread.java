package com.bb.corejava.threads;

public class CustomThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<2e3;i++)
		{
			Math.sin(i/10000000);
			if(i%100==0)
			{
				System.out.println(Thread.currentThread().getName()+" is "+Thread.currentThread().getState()+" "+i);
				try 
				{
					Thread.sleep(500*1);
				
				} 
				
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	}

}

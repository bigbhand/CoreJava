package com.bb.corejava.threads.racer;

public class Racer implements Runnable{

	boolean isRaceEnded=false;
	long initTime=System.nanoTime();
	long endTime=0;
	
	@Override
	public void run() {
		
		// synchronized block benefit (only one will race at a time) try this
		/*synchronized (this)
		{*/
			int distanceCovered = 1;
			
			while(distanceCovered<=1000 && !isRaceEnded)
			{
				endTime=System.nanoTime();
				if(distanceCovered%100==0 && !isRaceEnded)
				{
					System.out.println(Thread.currentThread().getName() + " reached: "+distanceCovered+"m in "+(endTime-initTime)/100000+" sec");
				}
				
				
				/*if(distanceCovered==800)
				{
					if(Thread.currentThread().getName().equals("Rabbit"))
					{
						try 
						{
							Thread.sleep(1000*10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}*/
				
				distanceCovered++;
			}
		/*}*/
		
		if(!isRaceEnded)
		{
			isRaceEnded = true;
			System.out.println("\nWINNER is  : "+Thread.currentThread().getName());
			System.out.println("TIME taken : "+(endTime-initTime)/100000+" sec");
			return;
		}
	}

}

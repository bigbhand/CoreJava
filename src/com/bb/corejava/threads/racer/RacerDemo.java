package com.bb.corejava.threads.racer;

public class RacerDemo {

	public static void main(String[] args) {
		
		Racer raccer=new Racer();
		Thread rabbit=new Thread(raccer, "Rabbit  ");
		Thread tortoise=new Thread(raccer, "Tortoise");
		Thread deer=new Thread(raccer, "Deer    ");
		Thread elephent=new Thread(raccer, "Elephent");
		Thread cheeta=new Thread(raccer, "Cheeta  ");
		
		rabbit.setPriority(10);
		cheeta.setPriority(8);
		deer.setPriority(7);
		elephent.setPriority(4);
		tortoise.setPriority(1);
		
		System.out.println(" ****** Race Started *******\n");
		
		rabbit.start();
		cheeta.start();
		deer.start();
		elephent.start();
		tortoise.start();
		

	}

}

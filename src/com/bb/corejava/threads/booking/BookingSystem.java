package com.bb.corejava.threads.booking;

public class BookingSystem {
	
	static int totalSeats=10;
	static int seatsAvailable=10;
	
	public synchronized void bookSeat(int noOfSeats) 
	{
		if(noOfSeats>seatsAvailable)
		{
			if(seatsAvailable==0)
				System.out.println("\nOOPS!! "+Thread.currentThread().getName()+" seats are full..");
			else
				System.out.println("\nSorry!! "+Thread.currentThread().getName()+" only "+seatsAvailable+" seats are available..");
		}
		else
		{
			System.out.println("\nPlease wait.. while locking your seats..");
			try 
			{
				Thread.currentThread().sleep(1000*3);
				Thread.interrupted();
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seatsAvailable=seatsAvailable-noOfSeats;
			System.out.println("Congratulations.. "+Thread.currentThread().getName()+" you have booked "+noOfSeats+" seats..");
		}
		
		
	}

}

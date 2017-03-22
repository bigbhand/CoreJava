package com.bb.corejava.threads.booking;

public class UserAction extends Thread{

	BookingSystem system;
	int noOfSeats;
	
	public UserAction(BookingSystem system, String name,int noOfSeats)
	{
		super();
		super.setName(name);
		this.system=system;
		this.noOfSeats=noOfSeats;
	}
	
	public void run() {

		system.bookSeat(noOfSeats);
		
	}

}

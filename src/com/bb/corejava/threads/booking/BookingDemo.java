package com.bb.corejava.threads.booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookingDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader reeader=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(reeader);
		
		BookingSystem bookingSystem = new BookingSystem();
		
		int doContinue=1;
		
		System.out.println("Hi User1, Available Seats : "+BookingSystem.seatsAvailable+"\nEnter no. Of Seats : ");
		int user1Seats=Integer.parseInt(br.readLine());
		System.out.println("Hi User2, Available Seats : "+bookingSystem.seatsAvailable+"\nEnter no. Of Seats : ");
		int user2Seats=Integer.parseInt(br.readLine());
		System.out.println("Hi User3, Available Seats : "+bookingSystem.seatsAvailable+"\nEnter no. Of Seats : ");
		int user3Seats=Integer.parseInt(br.readLine());
		
		
		UserAction user1 = new UserAction(bookingSystem,"USER-1",user1Seats);
		UserAction user2 = new UserAction(bookingSystem,"USER-2",user2Seats);
		UserAction user3 = new UserAction(bookingSystem,"USER-3",user3Seats);
		
		user1.start();
		user2.start();
		user3.start();
		

		
	}

}

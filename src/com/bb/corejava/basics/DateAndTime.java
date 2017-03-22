package com.bb.corejava.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {

	public static void main(String[] arg)
	{
		Date d = new Date();
		GregorianCalendar gCal=new GregorianCalendar();
		System.out.println(d.getTime());
		System.out.println(gCal.getTime());
		
		SimpleDateFormat formatter = new SimpleDateFormat("'date is' dd-MM-yyyy");

		System.out.println(formatter.format(d));
		
		Date d2=new Date();
		
		System.out.println(formatter.format(d2));
		
		Calendar  cal= Calendar.getInstance();
		
		System.out.println(formatter.format(cal.getTime()));
		
		cal.add(Calendar.DATE, 0);
		cal.add(GregorianCalendar.MONTH, 0);
		cal.add(GregorianCalendar.YEAR, 5);
		
		System.out.println(formatter.format(cal.getTime()));
		
		String dateStr=formatter.format(cal.getTime());
		try {
			formatter.parse(dateStr);
			System.out.println(formatter.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
}

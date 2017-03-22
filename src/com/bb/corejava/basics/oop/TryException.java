package com.bb.corejava.basics.oop;

import java.io.IOException;

public class TryException {

	public static void main(String[] arg) throws IOException, CustomException
	{
		try
		{
			try
			{
				double d1=4.232;
				double d2=2.3;
				double d3=d1-d2;
				Float f = new Float(d3);
				System.out.println( f);
			}
			catch(ArithmeticException e)
			{
				
				throw new CustomException("somthing ent wrong!!");
			}
			
			finally
			{
				System.out.println("In Finally");
			}
		}
		catch(CustomException n)
		{
			//System.out.println("Null handled");
		}
		System.out.println("After Catch");
	}
	
}

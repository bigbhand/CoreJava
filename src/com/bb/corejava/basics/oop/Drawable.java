package com.bb.corejava.basics.oop;

public interface Drawable extends Computable{

	void draw();
	void paint();
	int CONST=20;
	
	public class Hi implements Face{
		
		String say;

		@Override
		public void sayHi(String msg) {
			this.say=msg;
			System.out.println(say);
			
		}
		
	}
	
	public interface Face{
		
		void sayHi(String msg);
	}
	Hi hi=new Hi();
	Face face=new Hi();
}

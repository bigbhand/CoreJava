package com.bb.corejava.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		boolean flag=true;   // 1 bit
		byte b=127;         // 1 byte -128 to 127
		short s=32767;       // 2 byte -32768 to 32767
		int i=2124532;       // 4 byte
		long l=225512528789898L;    // 8 byte
		float f=1.0f;        // 4 byte
	    double d=18989898.1224;        // 8 byte
	    
	    char ch=127;         // 2 byte 0-65535
	    
	    System.out.println(d +" casted to -> "+ (char)d);
	    System.out.println(18989898 % (32767*2));
	}
}

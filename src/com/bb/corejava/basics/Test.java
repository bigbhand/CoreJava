package com.bb.corejava.basics;

public class Test {

		
	/*public static int y;
    public static void foo(int x) 
    {
        System.out.print("foo ");
        y = x;
    }
    public static int bar(int z) 
    {
        System.out.print("bar ");
        return y = z;
    }
    public static void main(String [] args ) 
    {
        int t = 0;
        assert t > 0 : bar(7);
        assert t > 1 : foo(8); 
         Line 18 
        System.out.println("done ");
    }*/

	/*   public static void stringReplace (String text) 
	    {
	        text = text.replace ('j' , 'c');  Line 5 
	    } 
	    public static void bufferReplace (StringBuffer text) 
	    { 
	        text = text.append ("c");   Line 9 
	    } 
	    public static void main (String args[]) 
	    { 
	        String textString = new String ("java"); 
	        StringBuffer textBuffer = new StringBuffer ("java");  Line 14 
	        stringReplace(textString); 
	        bufferReplace(textBuffer); 
	        System.out.println (textString + textBuffer); 
	    } 
		*/

	boolean [] b = new boolean[3];
    int count = 0;

    void set(boolean [] x, int i) 
    {
        x[i] = true;
        ++count;
    }

    public static void main(String [] args) 
    {
        Test ba = new Test();
        ba.set(ba.b, 0);
        ba.set(ba.b, 2);
        ba.test();
    }

    void test() 
    {
        if ( b[0] && b[1] | b[2] )
            count++;
        if ( b[1] && b[(++count - 2)] )
            count += 7;
        System.out.println("count = " + count);
    }

}

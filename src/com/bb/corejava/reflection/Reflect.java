package com.bb.corejava.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflect {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		//Class.forName("com.bb.corejava.reflection.CustomUtility");

		//CustomUtility util = new CustomUtility();
		
		// Print the constructors and the parameter types
		Constructor[] constructors = CustomUtility.class.getConstructors();
		
		System.out.println("The available constructors are : ");
		for(Constructor con : constructors)
		{
			System.out.println(con.getName()+" :- ");
			for(Class c : con.getParameterTypes())
			{
				System.out.print(c.getSimpleName()+" ");
			}
		}
		
		System.out.println("\n");
		
		//Create a new Instance using newInstance()
		CustomUtility cu1 = CustomUtility.class.getConstructor(null).newInstance(null);
		System.out.println(cu1.getUsername()+" "+cu1.getPassword());
		
		Class[] params = {String.class, String.class};
		CustomUtility cu2 = CustomUtility.class.getConstructor(params).newInstance(new String[]{"ganesh.ks","pwd@1234"});
		System.out.println(cu2.getUsername()+" "+cu2.getPassword());
		
		System.out.println("\n");
		
		/** Print Fields and types**/
		Field[] fields = CustomUtility.class.getFields();
		
		System.out.println("The public fields : ");
		for(Field f : fields)
		{
			System.out.println(f.getName());
		}
		
		Field[] declaredFields = CustomUtility.class.getDeclaredFields();
		
		System.out.println("\nThe declared fields : ");
		for(Field f : declaredFields)
		{
			System.out.println(f.getName()+" : "+f.getType());
		}
		
		Field pwdField = cu2.getClass().getField("password");
		System.out.println(pwdField.getName()+" = "+pwdField.get(cu2));
		
		
	}

}

package com.bb.corejava.basics.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int[] array={8,-2,10,20};
		
		System.out.println("before sort..");
		for(int ele:array)
		{
			System.out.print(ele+" ");
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("\n\nafter sort..");
		for(int ele:array)
		{
			System.out.print(ele+" ");
		}

	}

}

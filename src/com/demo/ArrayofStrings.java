//Implementation of integer and string inside array 

package com.demo;
public class ArrayofStrings {
	public static void main(String args[]){ 
		int[] num=new int[]{10,20}; 
		String[] name=new String[]{"Pavithra","Narayanee"};
		for(int i=0;i<2;i++)
		{
			System.out.println("Id= "+num[i]);
			System.out.println("Name= "+name[i]);
		}
	}
}

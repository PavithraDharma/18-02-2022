//To check whether the given input is digit alphabet or special character

package com.demo;
import java.util.Scanner; 
public class Digit{
	public static void main(String args[]){
		int choice;int count;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of values you want to check=");
		count=scanner.nextInt();
		for(int i=0;i<count;i++){
			System.out.println("Enter character=");
			if(scanner.hasNextInt())
			{
				int a=scanner.nextInt();
				choice=1;
			}
			else
			{
				char ch=scanner.next().charAt(0);
				if(ch>='a' && ch<='z')
				{
					choice=2;
				}
				else
				{
					choice=3;
				}
			}
			switch(choice)
			{
			case 1:
			{
				System.out.println("Its a digit");
				break;
			}	
			case 2:
			{
				System.out.println("Its an Alphabet");
				break;
			}
			case 3:
			{
				System.out.println("Its a special character");
				break;
			}
			default:
				System.out.println("Invalid");
			}
		}
		scanner.close();
	}
}


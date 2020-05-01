package com.BasicQueueImplemtation;

import java.util.Scanner;

public class Program {
	
	static Scanner sc= new Scanner(System.in);
	public static int menu()
	{
		System.out.println("");
		System.out.println("1. Enqueue");
		System.out.println("2. Dequeue");
		System.out.println("3. Display");
		System.out.println("Choose opertation");
		return sc.nextInt();
	}
	static Operations op = new Operations(new Queue(5));
	public static void main(String[] args) 
	{
		
		
		int choice =0;
		while((choice=menu())!=0)
		{
			switch (choice) 
			{
			case 1:
				System.out.println("enter value");
				op.Enque(sc.nextInt());
				break;
				
			case 2:
				op.Dequeue();
				break;
			case 3:
				op.Display();
				break;	
			default:
				break;
			}
		}
	}

}

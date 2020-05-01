package com.QueueImplementationUsingStack;

import java.util.Stack;

class Queue
{
	static Stack<Integer>s1= new Stack<>();
	static Stack<Integer>s2= new Stack<>();
	
	static void Enqueue(int x)
	{
		while(!s1.empty())
		{
			s2.push(s1.pop());
		}
		s1.push(x);
		while(!s2.empty())
			s1.push(s2.pop());
		
	}
	
	static int Dequeu()
	{
		// if first stack is empty  
        if (s1.isEmpty())  
        {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }  
  
        // Return top of s1  
        int x = s1.peek();  
        s1.pop();  
        return x; 
	}
}
public class Program {
	public static void main(String[] args) {
		Queue q= new Queue();
		q.Enqueue(4);
		q.Enqueue(5);
		q.Enqueue(6);
		System.out.println(q.s1);
		System.out.println(q.s2);
		
		System.out.println(q.Dequeu());
		
	}

}

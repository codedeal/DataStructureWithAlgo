package com.BasicQueueImplemtation;

public class Queue 
{
	public int front , rear,capaity;
	public  static int queue_arr[];
	
	public Queue(int capacity)
	{
		front =0;
		rear=0;
		this.capaity=capacity;
		queue_arr= new int[capacity];
		
	}
	

}

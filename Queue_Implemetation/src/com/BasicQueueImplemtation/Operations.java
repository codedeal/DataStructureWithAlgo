package com.BasicQueueImplemtation;

public class Operations 
{
	static Queue queue;
	public Operations(Queue queue)
	{
		this.queue = queue;
	}
	public  void Enque(int data)
	{
		if(isFull())
		{
			queue.queue_arr[queue.rear++]=data;
			
			return;
		}
		else
		System.out.println("Seems Queue is full");
	}
   
	public void Dequeue()
	{
		if(!isEmpty())
		{
			for(int i=0;i<queue.queue_arr.length-1;i++)
			{
				queue.queue_arr[i]=queue.queue_arr[i+1];
			}
			
			queue.rear--;
		}
	}
	
	public void Display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return;
		}
			
		for(int i=queue.front;i<queue.rear;i++)
		{
			System.out.print(queue.queue_arr[i]+" ");
			
		}
	}
	private boolean isEmpty() {
		
		return queue.front==queue.rear;
	}
	private  boolean isFull() 
	{
		//System.out.println(queue.rear+" "+queue.capaity);
		return queue.rear<=queue.capaity;
	}

}

package com.cb.stack;

public class Stack {
	int stck[] = new int[10];	
	int tos;
	
	Stack()
	{
		tos = -1;
	}
	
	public void push(int a)
	{
		if (tos == 9)
			System.out.println("Stack is full...");
		else
			stck[++tos] = a;		
	}

	public int pop()
	{
		int b = 0;
		if (tos < 0)
		{
			System.out.println("Stack is underflow...");
		return 0;
		}
		else
			b= stck[tos--];
		
		return b;
	}
}

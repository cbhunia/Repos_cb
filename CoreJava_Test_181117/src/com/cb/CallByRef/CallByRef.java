package com.cb.CallByRef;

public class CallByRef {
	int a,b;
	
	public CallByRef(int i, int j)
	{
		a = i;
		b = j;
	}
	
	
		public void method(CallByRef o)
	{
		o.a *=2;
		o.b /=2;		
		System.out.println("Inside function i= " + o.a + " j= "+o.b);
	}


}

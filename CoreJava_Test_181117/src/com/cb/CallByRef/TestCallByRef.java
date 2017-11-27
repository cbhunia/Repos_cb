package com.cb.CallByRef;

public class TestCallByRef {
	
	public static void main(String args[])
	{
		CallByRef cbr = new CallByRef(5,6);
		
			
		System.out.println("Before call - a=" + cbr.a +" b="+cbr.b);
		cbr.method(cbr);
		System.out.println("After call by Refence - a=" + cbr.a +" b="+cbr.b);
		
	}

}

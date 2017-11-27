package com.cb.intf;

public class DemoInterface {
	public static void main (String args[])
	{
		sampleInterface ci = new ClassInterface(); 
		ci.callBack();
		System.out.println(ci.constant_one);
	}

}

package com.cb.clss;

public class Box {
	
	double length;
	double height;
	double width;
	
	Box(double l, double h, double w)
	{
		length = l;
		height = h;
		width = w;
	}
	
	public double calcArea()
	{
		return  2*(length*height + length*width + width*height);
	}
	
	public double calcVol()
	{
		return length*width*height;
	}


}

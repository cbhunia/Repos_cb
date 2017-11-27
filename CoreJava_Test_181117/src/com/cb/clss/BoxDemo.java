package com.cb.clss;

public class BoxDemo {
	
public static void main(String args[])

{
	Box box1 = new Box(1.5,3.4,6.0);
	
	double vol;
	double area;
	
	vol = box1.calcVol();
	area = box1.calcArea();
	
	System.out.println("Volume of the box is " + vol + " Unit^3");
	System.out.println("Area of the box is " + area + " Unit^2");
}

}

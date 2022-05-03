package com.bridgelabz;

public class LengthCalculate {

	public static void main (String[] args) {
		//point 1
		double x1 = 4;
		double y1 = 3;


		// point 2
		double x2 = 8;
		double y2 = 10;

		// calculate length of line
		double length = Math.sqrt( ( ( x2 - x1 ) * (  x2 - x1 ) ) + ( y2 - y1 ) * ( y2 - y1 ) ) ;
		System.out.println("Lenth of Line is :" + length);

	}
}

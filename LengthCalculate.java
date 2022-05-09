package com.bridgelabz;

public class LengthCalculate {
	public static void main (String[] args) {

		int a1 = 4, b1 = 3;
		int a2 = 8, b2 = 10;

		int length = (int)Math.sqrt( ( ( a2 - a1 ) * (  a2 - a1 ) ) + ( b2 - b1 ) * ( b2 - b1 ) ) ;
		System.out.println("Lenth of Line is :" + length);

	}
}

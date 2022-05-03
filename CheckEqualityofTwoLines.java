package com.bridgelabz;

public class CheckEqualityofTwoLines {
	
	
	// Function to check if two lines are equal or not
	static void equal(float a1, float b1,
			float c1, float a2,
			float b2, float c2)
	{

		
		if (a1*b2 == a2*b1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}	
		public static void main(String args[]) {
			{
		    float a1 = -2, b1 = 4, c1 = 5;
		    float a2 = -6, b2 = 12, c2 = 6;
		 
		    // Function Call equal method
		    equal(a1, b1, c1, a2, b2, c2);
		}
	}
	
}

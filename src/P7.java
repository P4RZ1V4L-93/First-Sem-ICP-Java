/* Author's Name			: Rohit Patel
 * Author's Regd. No.		: 2141016159
 * Author's Semester		: 1st
 * Author's Branch-Section	: CSIT - 2141028
 * Subject					: Introduction to Computer Programming
 * Date						: 09.12.2021
 * Problem Description		: To exchange the values of two variables.
 */
public class P7 
{

	public static void main(String[] args) 
	{  // By using a third Variable
		byte a = 25;
		byte b = 38;
		byte c;
		System.out.println("Before Swapping a = " + a + " and b = " + b + "\n");
		
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping a = " + a +  ", b = " + b + ", c = " + c);
	}

}

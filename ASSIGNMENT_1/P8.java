/* Author's Name			: Rohit Patel
 * Author's Regd. No.		: 2141016159
 * Author's Semester		: 1st
 * Author's Branch-Section	: CSIT - 2141028
 * Subject					: Introduction to Computer Programming
 * Date						: 09.12.2021
 * Problem Description		: To exchange the values of two variables.
 */
public class P8 
{

	public static void main(String[] args) 
	{
		
		int x = 14;
		int y = 45;
		System.out.println("Before Swapping x = " + x + " and y = " + y );
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping x = " + x +  ", y = " + y);
	}

}

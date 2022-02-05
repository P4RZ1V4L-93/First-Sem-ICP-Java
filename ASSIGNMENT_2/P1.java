import java.util.Scanner;

/* Author's Name			: Rohit Patel
 * Author's Regd. No.		: 2141016159
 * Author's Semester		: 1st
 * Author's Branch-Section	: CSIT - 2141028
 * Subject					: Introduction to Computer Programming
 * Date						: 09.12.2021
 * Problem Description		: To exchange the values of two variables.
 */
public class P1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double C, F;
		System.out.println("Enter a degree in Celsius:");
		C = sc.nextDouble();
		
		F = (9.0/5) * C + 32;
		System.out.println(C + " Celsius is " + F + " Fahrenheit");
		sc.close();
	}

}

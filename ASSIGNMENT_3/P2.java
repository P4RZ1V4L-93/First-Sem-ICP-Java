import java.util.Scanner;
public class P2 
{

	public static void main(String[] args) 
	{
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks = sc.nextInt();
		if(marks >= 40)
		{
			System.out.println("Congratulations! You have passed the exam.");
		}
		else
		{
			System.out.println("Sorry! You have failed the exam.");
		}
		sc.close();
	}
}

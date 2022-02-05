import java.util.Scanner;
public class P12 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int eggs, gross, dozen, left;
		
		System.out.println("Enter the number of eggs you have: ");
		eggs = sc.nextInt();
		
		gross = eggs/144;
		dozen = (eggs%144)/12;
		left = ((eggs%144)%12);
		
		System.out.println("You have " + gross + "gross, " + dozen + "dozens and " + left + "eggs");
		sc.close();
	}

}

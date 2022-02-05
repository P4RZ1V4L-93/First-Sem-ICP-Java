import java.util.Scanner;
public class P8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int R, Ayu, Ajay;
		
		System.out.println("Enter the age of Rahul, Ayush, Ajay");
		R = sc.nextInt();
		Ayu = sc.nextInt();
		Ajay =sc.nextInt();
		
		if(R > Ayu)
		{
			if(R>Ajay)
			{
				System.out.println("Rahul is the Eldest");
			}
			else
			{
				System.out.println("Ajay is the Eldest");
			}
			
		}
		else
		{
			if(Ajay > Ayu)
			{
				System.out.println("Ajay is the Eldest");
			}
			else
			{
				System.out.println("Ayush is the Eldest");
			}
		}
		sc.close();
	}

}

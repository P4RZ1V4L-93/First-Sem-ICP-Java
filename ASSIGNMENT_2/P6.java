import java.util.Scanner;
public class P6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double W, H, BMI;
		
		System.out.println("Enter your weight in pounds : ");
		W = sc.nextDouble();
		
		System.out.println("Enter your Height in inches : ");
		H = sc.nextDouble();
		
		BMI = (W * 0.45359237)/(Math.pow(H * 0.0254, 2));
		
		System.out.println("BMI is " + BMI);
		sc.close();

	}

}

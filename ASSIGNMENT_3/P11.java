import java.util.Scanner;
public class P11 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mass in KG: ");
		double mass = sc.nextDouble();
		System.out.println("Enter your height in meters: ");
		double height = sc.nextDouble();
		double bmi = mass / (height * height);
		
		if(bmi<18.5)
		{
			System.out.println("Your BMI is " + bmi + " and you are underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("Your BMI is " + bmi + " and you are normal");
		}
		else if(bmi>=25 && bmi<=29.9)
		{
			System.out.println("Your BMI is " + bmi + " and you are overweight");
		}
		else if(bmi>=30)
		{
			System.out.println("Your BMI is " + bmi + " and you are obese");
		}
		sc.close();
	}

}

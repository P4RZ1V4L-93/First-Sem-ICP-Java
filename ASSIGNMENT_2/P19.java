
public class P19 
{

	public static void main(String[] args) 
	{
		double basic = Double.parseDouble(args[0]);
		double DA, HRA, gross;
		
		DA = 40 * basic /100;
		HRA = 20 * basic /100;
		
		gross = basic + DA + HRA;
		System.out.print(gross);
		

	}

}

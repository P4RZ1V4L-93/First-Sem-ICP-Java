
public class P22 
{

	public static void main(String[] args) 
	{
		double t, P, r, a;
		
		t = Double.parseDouble(args[0]);
		P = Double.parseDouble(args[1]);
		r = Double.parseDouble(args[2]);
		
		a = P * Math.exp(r * t);
		
		System.out.println(a);

	}

}

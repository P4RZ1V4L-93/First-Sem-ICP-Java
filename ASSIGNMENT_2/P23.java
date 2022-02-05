
public class P23 
{

	public static void main(String[] args) 
	{
		int a, b, c, max, min, mid ;
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		min = Math.min(Math.min(a, b), c);
		max = Math.max(Math.max(a, b), c);
		mid = a + b + c - max - min;
		System.out.println("The order is " + min + " " + mid + " "+ max);

	}

}

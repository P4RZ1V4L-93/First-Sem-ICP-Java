
public class P20 
{

	public static void main(String[] args) 
	{
		byte m = Byte.parseByte(args[0]);
		byte d = Byte.parseByte(args[1]);
		
		boolean a = (m>3 && m<6) || (m == 3 && d>20 && d<31) || (m == 6 && d<20 && d>0);
		
		System.out.println(a);

	}

}

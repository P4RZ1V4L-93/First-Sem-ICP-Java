import java.util.Scanner;
public class P10
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer for today\'s day of the week (like 0 for Sunday and 6 for Saturday): ");
		byte day=sc.nextByte();
		System.out.println("Enter the number of days elapsed since today: ");
		byte daysElapsed=sc.nextByte();
		String dayOfWeek;
		byte days;
		
		switch(day)
		{
			case 1:
				dayOfWeek = "Sunday";
				break;
			case 2:
				dayOfWeek = "Monday";
				break;
			case 3:
				dayOfWeek = "Tuesday";
				break;
			case 4:
				dayOfWeek =	"Wednesday";
				break;
			case 5:
				dayOfWeek = "Thursday";
				break;
			case 6:
				dayOfWeek =	"Friday";
				break;
			case 7:
				dayOfWeek =	"Saturday";
				break;
			default:
				dayOfWeek = "Invalid day";
		}

		String today = dayOfWeek;
		days = (byte) ((day + daysElapsed)%7);
		switch(days)
		{
			case 1:
				dayOfWeek = "Sunday";
				break;
			case 2:
				dayOfWeek = "Monday";
				break;
			case 3:
				dayOfWeek = "Tuesday";
				break;
			case 4:
				dayOfWeek =	"Wednesday";
				break;
			case 5:
				dayOfWeek = "Thursday";
				break;
			case 6:
				dayOfWeek =	"Friday";
				break;
			case 7:
				dayOfWeek =	"Saturday";
				break;
			default:
				dayOfWeek = "Invalid day";
		}
		String after = dayOfWeek;

		System.out.println("Today is " + today + " and after " + daysElapsed + " days it will be " + after);
		
		sc.close();
	}

}

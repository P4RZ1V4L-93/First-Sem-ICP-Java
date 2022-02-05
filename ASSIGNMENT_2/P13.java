import java.util.Scanner;
public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minutes, year, days;
		
		System.out.println("Enter the number of minutes : ");
		minutes = sc.nextInt();
		
		year = minutes/60/24/365;
		days = (minutes%(60*24*365))/60/24;
		
		System.out.println(minutes + " minutes is approx. " + year + " year and " + days + " days");
		sc.close();
	}

}

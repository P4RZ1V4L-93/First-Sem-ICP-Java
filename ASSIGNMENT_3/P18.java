import java.util.Scanner;

public class P18
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        char Gender, Married; 
        String First, Last;
        String Title = "";
        byte Age;

        System.out.print("What is your Gender (M or F): ");
        Gender = sc.next().charAt(0);
        System.out.print("First name: ");
        First = sc.next();
        System.out.print("Last name: ");
        Last = sc.next();
        System.out.print("Age: ");
        Age = sc.nextByte();
        
            
        if(Gender == 'F')
            if(Age>20)
            {
                System.out.print("Are you Married (Y or N): ");
                Married = sc.next().charAt(0);
                
                if(Married == 'Y')
                    Title = "Mrs.";
                else
                    Title = "Ms.";
            }
        else
            if(Age>20)
            {
                Title = "Mr.";
            }

        System.out.println("Then I shall call you "+Title+" "+First+" "+Last);
        sc.close();
    }
}
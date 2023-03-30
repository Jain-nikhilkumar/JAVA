import java.util.Scanner;

public class Simmple_Interest {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter age: ");
        int age = sc.nextInt();
        System.out.print("\nEnter geder(m/f): ");
        char gender =  sc.next().charAt(0);
        System.out.print("\nEnter amount: ");
        int amount = sc.nextInt();
        System.out.print("\nEnter total year taken: ");
        int year = sc.nextInt();
        int si;
        if (gender == 'm')
        {
            if (age >= 60)
            {
                si = 3;
            }
            else
            {
                si = 4;
            }
        }
        else
        {
            if (age >= 60)
            {
                si = 1;
            }
            else
            {
                si = 2;
            }
            
        }
        float total_si = year*amount*si/100;
        float total = amount + total_si;
        System.out.println("Simple intrest "+total_si);      
        System.out.println("Total amount with simple intrest "+total);      
        sc.close();
    }
    
}


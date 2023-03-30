import java.util.Scanner;

public class odd_even {
    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            if(a%2==0)
            {
                System.out.println("EVEN NO");
            }else{
                System.out.println("ODD No");
                    }
        }
        
    }
}

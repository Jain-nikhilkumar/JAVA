import java.util.Scanner;

public class conditional_stat {
    
    public static void main( String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age=sc.nextInt();
            if(age>=18)
            {
                System.out.println("ADULT");
            }
            else{
                System.out.println("NOt ADULT");
                
            }
        }
    }
}


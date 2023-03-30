import java.util.Scanner;



public class greater_smaller {
    
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            int b= sc.nextInt();

            if( a == b)
            {
            System.out.println("BOTH ARE EQUAL");
            }
            else if(a > b){
                System.out.println("A IS GREATER ");
            }
            else{
                System.out.println("B is GREATER");
            }
        }
    }
}

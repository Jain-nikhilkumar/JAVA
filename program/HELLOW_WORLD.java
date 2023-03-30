import java.util.Scanner;

class HELLOW_WORLD
{
    public static void main(String[] args) {
        System.out.println("HELLO JAVA");
        System.out.print("HELLO JAVA WITH NEW LINE\n");
        System.out.print("HELLO JAVA WITH OTHRER METHOD\n ");
        System.out.print("*\n");
        System.out.print("**\n");
        System.out.print("***\n");
        System.out.print("****\n");
        int a=10;
        int b=30;
        System.out.println(a+b);
        try (Scanner sc = new Scanner(System.in)) {
            String NAME=sc.nextLine();
            System.out.print(NAME);

            int d=sc.nextInt();
            int e=sc.nextInt();

            int sum=d + e;
            System.out.println(sum);
        }

    }
}
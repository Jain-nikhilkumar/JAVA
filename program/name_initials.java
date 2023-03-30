import java.util.*;
class name_initials{
    public static void main(String args[])
	{
      
                Scanner sc=new Scanner(System.in);	
                System.out.print("Enter full Name:");
                String name=sc.nextLine();
                String[] str=name.split(" ");
                String name_1= str[2] + " " + str[0].charAt(0) + ". " + str[1].charAt(0) + ".";
                System.out.println("Full Name:\n"+name);
                System.out.println("\nName with Inital:\n"+name_1);
                System.out.println("\n\n");
            }
        }

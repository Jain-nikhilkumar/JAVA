import java.util.Scanner;
public class String_methods {
	public static void main(String args[])
	{
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a string");
		String str1=input.next();
		System.out.println("Enter a string");
		String str2=input.next();
		System.out.println("1.toLowerCase : "+str1.toLowerCase());
		System.out.println("2.Concat : "+str1.concat(str2)); 
		System.out.println("3.compareTo : "+str1.compareTo(str2));
		System.out.println("4.equals : "+str1.equals(str2));
		System.out.println("5.toUpperCase : "+str1.toUpperCase());	
		System.out.println("6.endsWith : "+str1.endsWith("vi"));	
		System.out.println("7.length : "+str2.length());	
		System.out.println("8.trim : "+str2.trim());	
		System.out.println("9.toLowerCase:"+str2.toLowerCase());
		System.out.println("10.isEmpty():"+str2.isEmpty());
		System.out.println("11.getByte():"+str1.getBytes());
		System.out.println("12.Replace():"+str1.replace("V","n"));
		System.out.println("13.startswith():"+str2.startsWith("N"));
        System.out.println("14.join():"+str2.join("-","Nikhil","arun","jain"));
        System.out.println("15.substring():"+str2.substring(2,5));		
		}
    }

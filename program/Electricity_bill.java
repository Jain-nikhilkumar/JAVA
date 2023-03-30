

import java.util.Scanner;


public class Electricity_bill {
    
    public static void main(String[] args)
      	{
                	Scanner sc= new Scanner(System.in);
                	System.out.println("Enter unit:");
                	int a= sc.nextInt();
                	double n=0;
                	
                	if(a<=100)
                	{
                          	n=(a*3.2);
                	}
                	else if(a> 100 && a<=200)
                	{
                          	n=320+(a-100)*6.50;
                	}
                	else if (a>200 && a<=300)
                	{
                          	n=320+652+(a-200)*9.80;
                	}
                	else {
                          	n=320+650+980+(a-300)*13.25;
                	}     	
                	System.out.println("Total electricity bill:"+n);
      	}
}


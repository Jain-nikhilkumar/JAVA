import java.util.Scanner;

public class arra3 {
    public static void main(String[] args) {
            
    Scanner sc=new Scanner(System.in);
    System.out.println("size");
    int a=sc.nextInt();
    int []arr=new int [a];
    for(int i=0;i<a;i++)
    {  
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<a;i++)
    {  
        System.out.println("ARRAY elemnts are:"+arr[i]);
    }
    int max=0;
    for(int i=0;i<a;i++)
    {  
        if(arr[i]>max)
        {
            max=arr[i];
        }
        
    }
    System.out.println("max :"+max);

    int min=1;
    for(int i=0;i<a;i++)
    {  
        if(arr[i]<min)
        {
            min=arr[i];
        }
     
    }
    System.out.println("min :"+min);
    }
}

import java.util.Scanner;

class prime{    
  public static void main(String args[]){    
   int i,n,flag=1;
   Scanner sc=new Scanner(System.in);  
   System.out.println("ENTER RANGE TO FIND :");
   int r=sc.nextInt();
   for( n=1;n<=r;n++)
   {
   if(n==0||n==1)  
    continue;  
    flag=1;
    for(i=2;i<=n/2;i++){      
     if(n%i==0){      
      flag=0;    
      break;      
     }      
    }      
    if(flag==1)  { System.out.print(" ["+ n +"]"); }  
   }//end of else  
 }    
}  
 
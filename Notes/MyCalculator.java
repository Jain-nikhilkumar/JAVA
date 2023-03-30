import java.util.*;
public class MyCalculator {
   
    int power(int n, int p) throws Exception
    { power(5,3);
        if(n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }
        else if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }
        else{
            return (int)Math.pow(n, p);
        }
       
    }
  
    public static void main(String args[])
    {
        System.out.println("NN");
    }

}
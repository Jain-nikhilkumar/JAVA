import java.util.Scanner;



public class order {

    private int orderid;
    private String orderedpizza;
    private static float totprice;
    private String status;

    order()
    {
        status="DEleverd";
    }
    order(int orderId, String orderedPizza,float totalPrice,String Status)
    {
        orderid=orderId;
        orderedpizza=orderedPizza;  
        totprice=totalPrice;
        status=Status;

    }

    void setdata(int orderId1, String orderedPizza1,float totalPrice1,String Status1)
    {
        this.orderid=orderId1;
        this.orderedpizza=orderedPizza1;
        this.totprice=totalPrice1;
        this.status=Status1;
    
    }

    int getid()
    {
        return orderid;
        
       
    }
    String getpizza()
    {
        return orderedpizza;
    }
    float gettot()
    {
        return totprice;
        
    }
    String getst()
    {
        return status;
    }
    public static void main(String args[])
    {
        System.out.println("INSide parent");
    }
}
class tester {

    public static void main(String args[])
    {  
        order o1=new order();
        o1.setdata(111, "vegies", 100, "deleverd");
        System.out.println (o1.getid());
        System.out.println( o1.getpizza());
        System.out.println(o1.getst());
        System.out.println(o1.gettot());


        
        }
    }



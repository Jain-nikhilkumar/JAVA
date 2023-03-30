/*<Applet code="Exp2_prg2" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;

public class Exp2_prg2 extends Applet
{
List products;

public void init()
{
products= new List(5);
products.add("SOLAPUR");
products.add("DHULE");
products.add("MUMBAI");
products.add("DELHI");
products.add("KOLKATA");
products.add("AGMEDABAD");
products.add("PUNE");
products.add("JAIPUR");
products.add("NAGPUR");
products.add("AURANGABAD");

add(products);
}
}
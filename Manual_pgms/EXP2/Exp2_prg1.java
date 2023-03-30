/*<Applet code="Exp2_prg1" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;

public class Exp2_prg1 extends Applet
{
List products;

public void init()
{
products= new List(4);
products.add("Summer");
products.add("Winter");
products.add("Rainy");
add(products);
}
}
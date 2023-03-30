/*<Applet code="Exp2_prg3" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;


public class Exp2_prg3 extends Applet
{
Label Lan;
Checkbox c1,c2,c3,c4,c5,c6,c7;

public void init()
{
Lan=new Label("The News Papers");
c1=new Checkbox(" Hindustan Times");
c2=new Checkbox(" The Indian Express");
c3=new Checkbox("The Times of India");
c4=new Checkbox(" Lokmat");
c5=new Checkbox("Divya Marathi");
c6=new Checkbox(" Sakal");
c7=new Checkbox(" Kesari");
add(Lan);
add(c1);
add(c2);
add(c3);
add(c4);
add(c5);
add(c6);
add(c7);
}
}
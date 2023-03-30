/*<Applet code="Exp1_prg5" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;


public class Exp1_prg5 extends Applet
{
Label l1,l2,l3;
Button b1,b2,b3;
public void init()
{
setLayout(null);
l1=new Label("OK button");
l1.setBounds(10,60,100,20);
l1.setBackground(Color.yellow);
l2=new Label("CANCEL button");
l2.setBounds(10,100,100,20);
l2.setBackground(Color.green);
l3=new Label("RESET button");
l3.setBounds(10,140,100,20);
l3.setBackground(Color.pink);

b1=new Button("ok");
b1.setBounds(150,60,100,20);
b2=new Button("Cancel");
b2.setBounds(150,100,100,20);
b3=new Button("Reset");
b3.setBounds(150,140,100,20);
add(l1);
add(l2);
add(l3);
add(b1);
add(b2);
add(b3);
}
}


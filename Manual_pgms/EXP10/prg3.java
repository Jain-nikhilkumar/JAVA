/*<Applet code="prg3" width="300" height="300">
</Applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prg3 extends Applet implements ActionListener
{
TextField t1,t2,t3;
Button b1;
Label l;

public void init()
{
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(50);
b1=new Button("mul");
l=new Label ("Ans :");

add(t1);
add(t2);
add(b1);
add(l);
add(t3);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
t3.setText(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())+" ");
}
}
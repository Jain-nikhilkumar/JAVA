
import java.awt.*;
import java.awt.event.*;

class Exp3_prg4 extends Frame
{
Button b1,b2,b3,b4,b5,b6;
Panel p;
Exp3_prg4(String title)
{
super(title);
setSize(500,500);
b1= new Button("East");
b2= new Button("West");
b3= new Button("South");
b4= new Button("North");
b5= new Button("Center");

p=new Panel();
add(b2,BorderLayout.WEST);
add(b3,BorderLayout.SOUTH);
add(b4,BorderLayout.NORTH);
add(b5,BorderLayout.CENTER);
add(b1,BorderLayout.EAST);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void WindowClosing(WindowEvent e)
{
System.exit(0); 
}
});
}

public static void main(String args[])
{
Exp3_prg4 f=new Exp3_prg4("practicle manual exaple");
}
}

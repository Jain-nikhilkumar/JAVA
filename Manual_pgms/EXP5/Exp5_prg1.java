
import java.awt.*;
import java.awt.event.*;
class Exp5_prg1 extends Frame
{
MenuBar mbr;
Menu clr;
MenuItem b,w,y,r,c;
Exp5_prg1(String title)
{
super(title);
setSize(500,500);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});

mbr=new MenuBar();
clr=new Menu("color");
b=new MenuItem("Black");
MenuShortcut s =new MenuShortcut('W');
w=new MenuItem("White",s);
y=new MenuItem("Yellow");
r=new MenuItem("Red");
c=new MenuItem("Cyan");
clr.add(b);
clr.addSeparator();
clr.add(w);
clr.addSeparator();
clr.add(y);
clr.addSeparator();
clr.add(r);
clr.addSeparator();
clr.add(c);
mbr.add(clr);
setMenuBar(mbr);
b.setEnabled(false);
}
public static void main (String arg[])
{
Exp5_prg1 obj=new Exp5_prg1("Menu concept");
}
}














































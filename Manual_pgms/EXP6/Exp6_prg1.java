import java.awt.* ; 
import javax.swing. * ;
import java.awt.event.*;

class Exp6_prg1 extends JFrame implements ItemListener 
{
JComboBox cb;
JLabel b1;
Container c;
String city []={"Solapur", "Pune", "Banglore", "Mumbai" };

Exp6_prg1()
{
setSize (500,500); 
setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ; 
c=getContentPane ();
c.setLayout (new FlowLayout());
cb=new JComboBox (city);
cb.addItemListener(this);
b1= new JLabel("");
c.add(cb);
c.add(b1); 
setVisible(true);
}
public void itemStateChanged (ItemEvent e) 
{
b1.setText("You are in "+cb.getSelectedItem());
}
public static void main(String args[])
{
Exp6_prg1 obj=new Exp6_prg1();
}
} 

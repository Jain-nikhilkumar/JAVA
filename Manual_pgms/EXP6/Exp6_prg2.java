import java.awt. * ;
import javax.swing. * ;
import java.awt.event.*; 
class Exp6_prg2 extends JFrame
{
JComboBox cb;
Container c; 
String city []= {"Maharashtra", "Karnataka", "Utta rpradesh", "Hyderabad"}; 
Exp6_prg2() 
{
setSize (500,500);
setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
c=getContentPane (); 
c.setLayout(new FlowLayout());
cb=new JComboBox (city);
c.add(cb);
setVisible(true);
}
public static void main(String ar [])
{
Exp6_prg2 obj=new Exp6_prg2();
}

}

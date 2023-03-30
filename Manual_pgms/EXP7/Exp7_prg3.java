
import java.awt. * ;
import javax.swing. * ;
import javax.swing.tree. *;

class Exp7_prg3 extends JFrame
{
Container c;
JTree t;
JScrollPane js;
DefaultMutableTreeNode root =new DefaultMutableTreeNode ("India");
DefaultMutableTreeNode m= new DefaultMutableTreeNode ("Maharashtra");
DefaultMutableTreeNode g=new DefaultMutableTreeNode ( "Gujrat");
DefaultMutableTreeNode mm= new DefaultMutableTreeNode ( "Mumbai");
DefaultMutableTreeNode mp=new DefaultMutableTreeNode ("Pune " );
DefaultMutableTreeNode mn=new DefaultMutableTreeNode ("Nashik");
DefaultMutableTreeNode mng=new DefaultMutableTreeNode ("Nagpur");
Exp7_prg3()
{
setSize (500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
c=getContentPane();
t=new JTree (root);
root.add (m);
root.add(g);
m. add (mm);
m. add (mp);
m. add (mn);
m. add (mng);
js= new JScrollPane (t);
c.add(js);
setVisible(true); 
}
public static void main(String args[])
{
Exp7_prg3 obj=new Exp7_prg3();

}

}

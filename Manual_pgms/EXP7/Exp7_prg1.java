/*<Applet code="Exp7_prg1" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;
import javax.swing. * ; 
import javax.swing.tree. * ;

public class Exp7_prg1 extends JApplet
{
Container c;
JTree t1;
JScrollPane js;
public void init()
{
c=getContentPane(); 
c.setLayout (new FlowLayout ());
DefaultMutableTreeNode r=new
DefaultMutableTreeNode ( "Root");
DefaultMutableTreeNode r1=new DefaultMutableTreeNode ("underRoot");
DefaultMutableTreeNode r2=new DefaultMutableTreeNode("under roots under");
r.add(r1);
r1.add(r2);
t1=new JTree(r);
js= new JScrollPane(t1);
c.add(js);
}

}


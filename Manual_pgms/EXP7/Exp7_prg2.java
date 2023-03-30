
/*<Applet code= "Exp7_prg2" width=500 height=500> 
</Applet>*/

import java.awt. *;
import java.applet. *;
import javax.swing. *;
import javax.swing.tree.*;

public class Exp7_prg2 extends JApplet
{
Container c;
JTree t1;
JScrollPane js;
public void init()
{ 
c=getContentPane ();
c.setLayout (new FlowLayout());
DefaultMutableTreeNode r=new DefaultMutableTreeNode ( "This PC");
DefaultMutableTreeNode r1=new DefaultMutableTreeNode("3D Objects");
DefaultMutableTreeNode r2=new DefaultMutableTreeNode ( "obj1");
DefaultMutableTreeNode Dsk=new DefaultMutableTreeNode( "Desktop");
DefaultMutableTreeNode Dsk1= new DefaultMutableTreeNode ("RAW");
DefaultMutableTreeNode Dsk2=new DefaultMutableTreeNode ("TP");
DefaultMutableTreeNode Doc=new DefaultMutableTreeNode ( "Documents");
DefaultMutableTreeNode Doc1 = new DefaultMutableTreeNode ( "msword");
DefaultMutableTreeNode Doc2= new DefaultMutableTreeNode ( "Wondershare");
DefaultMutableTreeNode Down=new DefaultMutableTreeNode ("Downlodes");
DefaultMutableTreeNode Down1 = new DefaultMutableTreeNode ( "MYASUS");
DefaultMutableTreeNode Down2 = new DefaultMutableTreeNode ("Telegram Desktop");
DefaultMutableTreeNode m= new DefaultMutableTreeNode ("Music");
DefaultMutableTreeNode m1=new DefaultMutableTreeNode ( "Lifeline");
DefaultMutableTreeNode m2= new DefaultMutableTreeNode ( "Playlists");
DefaultMutableTreeNode p=new DefaultMutableTreeNode( "Pictures");
DefaultMutableTreeNode p1=new DefaultMutableTreeNode("Camera Roll");
DefaultMutableTreeNode p2=new DefaultMutableTreeNode ("Screenshots");
r.add(r1);
r.add(Dsk);
r.add(Doc);
r.add(Down);
r.add(m);
r.add(p);

p.add(p1);
p.add(p2);
m.add(m1);
m.add(m2);
Down.add(Down1); 
Down.add(Down2);
Doc.add(Doc1);
Doc.add(Doc2);
Dsk.add(Dsk1); 
Dsk.add(Dsk2);
r1.add(r2);
t1= new JTree(r);
js=new JScrollPane(t1);
c.add(js);
}

}

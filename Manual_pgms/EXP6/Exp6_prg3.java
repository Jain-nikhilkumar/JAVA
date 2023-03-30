/*<Applet code="Exp6_prg3"width=500 height=500>
</Applet>*/

import java.awt. * ;
import java.applet. *;
import javax.swing. *;

public class Exp6_prg3 extends JApplet
{
JScrollPane s;
JLabel b1;
Container c;
public void init()
{
c=getContentPane();
b1=new JLabel();
s=new JScrollPane(b1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
c.add(s);
}

}

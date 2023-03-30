/*<Applet code="Exp3_prg3" width=500 height=200>
</Applet>*/
import java.awt.*;
import java.applet.*;

public class Exp3_prg3 extends Applet
{
Button b[]=new Button[5];
public void init()
{
setLayout(new GridLayout(3,2,20,10));
for(int i=0;i<5;i++)
{
b[i]=new Button("Button"+i);
add(b[i]);

}
}
}


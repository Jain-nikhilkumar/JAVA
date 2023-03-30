/*<Applet code="Exp3_prg2" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;

public class Exp3_prg2 extends Applet
{
Button b[]=new Button[10];
public void init()
{
setLayout(new GridLayout(2,5));
for(int i=0;i<10;i++)
{
b[i]=new Button("Button"+i);
add(b[i]);

}
}
}


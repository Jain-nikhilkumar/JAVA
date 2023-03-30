/*<Applet code="Exp3_prg1" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;

public class Exp3_prg1 extends Applet
{
Button b[]=new Button[25];
public void init()
{
setLayout(new GridLayout(5,5));
for(int i=0;i<25;i++)
{
b[i]=new Button("Button"+i);
add(b[i]);

}
}
}




/*<Applet code="Exp1_prg4" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;


public class Exp1_prg4 extends Applet
{
Label Lan;
Checkbox Marathi,Hindi,English,Sanskrit;

public void init()
{
Lan=new Label("Languages");
Marathi=new Checkbox(" Marathi");
Hindi=new Checkbox(" Hindi");
English=new Checkbox(" English");
Sanskrit=new Checkbox(" Sanskrit");
add(Lan);
add(Marathi);
add(Hindi);
add(English);
add(Sanskrit);
}
}

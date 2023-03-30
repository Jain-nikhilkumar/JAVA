/*<Applet code="Exp8_prg1" width=300 height=300>
</Applet>*/
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.table.*;

public class Exp8_prg1 extends Applet
{
Container c;
JTable t;
String[] colnames={"std Name", "Percentage","Grade"};
Object rowData [][] ={{"Shreyas",new Float(80.05f),"A"},{"Yashraj",new Float(80.05f),"A"},{"Atharv",new Float (80.05f),"A"},{"Harsh",new Float(80.05f),"A"}};

public void init()
{
c=getcontentPane();
t=new Exp8_prg1(rowData,colnames);
t.SetColumnSelectionAllowed(true);
JScrollPane sp=new JScrollPane(t);
c.add(sp);
} 
} 
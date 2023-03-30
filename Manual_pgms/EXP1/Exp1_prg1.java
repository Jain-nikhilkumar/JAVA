/*<Applet code="Exp1_prg1" width=500 height=500>
</Applet>*/
import java.awt.*;
import java.applet.*;


public class Exp1_prg1 extends Applet
{
Label Name,Hobby,Gender,Age;
Checkbox read,surf,dance,singing,tp;
Checkbox Male,Female;
CheckboxGroup nikk;
public void init()
{

Hobby=new Label("HOBBIEES");
Gender=new Label("GENDER");
read=new Checkbox("READING");
singing=new Checkbox("SINGING");
tp=new Checkbox("TP");
dance=new Checkbox("DANCING");
surf=new Checkbox("SURFING");
Name=new Label("its nikk");
nikk=new CheckboxGroup();
Male=new Checkbox("Male",nikk,false);
Female=new Checkbox("Female",nikk,true);
add(Hobby);
add(read);
add(surf);
add(singing);
add(Gender);
add(Male);
add(Female);
add(Name);
}
}
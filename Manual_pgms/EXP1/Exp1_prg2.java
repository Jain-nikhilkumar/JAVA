/*<Applet code="Exp1_prg2" width=800 height=800>
</Applet>*/
import java.awt.*;
import java.applet.*;

public class Exp1_prg2 extends Applet
{
Label l1,l2,l3,l4,l5,l6,l7;
Button b1;
Checkbox Male,Female;
CheckboxGroup nikk;
public void init()
{
setLayout(null);
l1=new Label("Full Name:");
l1.setBounds(10,60,100,20);
TextField t1=new TextField(20);
t1.setBounds(150,60,300,20);
l2=new Label("Address:");
l2.setBounds(10,110,100,20);
TextArea t2=new TextArea(8,40);
t2.setBounds(150,110,300,100);
l3=new Label("Contact No:");
l3.setBounds(10,250,100,20);
TextField t3=new TextField(20);
t3.setBounds(150,250,300,20);
l4=new Label("STUDENT_INFO:");
l4.setBounds(10,10,100,15);
l5=new Label("_____________________________________________________________________________");
l5.setBounds(0,300,500,20);
l6=new Label("Select Gender");
l6.setBounds(10,320,100,50);
nikk=new CheckboxGroup();
Male=new Checkbox("Male",nikk,false);
Male.setBounds(10,360,50,50);
Female=new Checkbox("Female",nikk,true);
Female.setBounds(10,390,50,50);
l7=new Label("_____________________________________________________________________________");
l7.setBounds(0,430,500,50);
b1=new Button("Submit");
b1.setBounds(20,480,100,50);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(t1);
add(t2);
add(t3);
add(Male);
add(Female);
add(b1);
}
}
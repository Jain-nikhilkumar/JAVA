/*<Applet code="Exp10_prg2" width=300 height=300>
</Applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Exp10_prg2 extends Applet implements KeyListener
{
String str="";
public void init()
{
requestFocus();
addKeyListener(this);
}
public void paint(Graphics g)
{
g.drawString(str,100,100);
}
public void keyTyped(KeyEvent e)
{}
public void keyReleased(KeyEvent e)
{}
public void keyPressed(KeyEvent e)
{
int c=e.getKeyCode();
switch(c)
{
case KeyEvent.VK_F1:str="F1";
			break;
case KeyEvent.VK_F2:str="F2";
			break;
case KeyEvent.VK_F3:str="F3";
			break;
case KeyEvent.VK_F4:str="F4";
			break;
case KeyEvent.VK_F5:str="F5";
			break;
case KeyEvent.VK_F6:str="F6";
			break;
case KeyEvent.VK_F7:str="F7";
			break;
case KeyEvent.VK_F8:str="F8";
			break;
case KeyEvent.VK_F9:str="F9";
			break;
case KeyEvent.VK_F10:str="F10";
			break;
case KeyEvent.VK_F11:str="F11";
			break;
case KeyEvent.VK_F12:str="F12";
			break;
case KeyEvent.VK_UP:str="Up arrow key";
			break;
case KeyEvent.VK_DOWN:str="Down arrow key";
			break;
case KeyEvent.VK_LEFT:str="Left arrow key";
			break;
case KeyEvent.VK_RIGHT:str="Right arrow key";
			break;
default: str=" other that functional and arrow key is pressed";
}
repaint();
}
}
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class registration extends JFrame implements ActionListener {

  JFrame p = new JFrame("REGISTRATION");

  registration() {
    super("registration");
    p.getContentPane().setBackground(Color.CYAN);

    JComboBox cb;
    
    String option[]={"MALE","FEMALE"};
    cb=new JComboBox(option);
    cb.setBounds(10,30,100,200);

    JLabel name = new JLabel("NAME:");
    JTextField namet = new JTextField(3);
    namet.setBounds(150,50,50,50);
    JButton reg=new JButton("REGISTER");
    p.add(reg);
    reg.addActionListener(this);
    reg.setBounds(200,300,1 50,50 );
    p.add(cb);
  
    p.add(namet);
    p.add(name);
   
    p.setVisible(true);
   
    p.setSize(600,600);
    

  } 

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

  }
  public static void main(String[] args) {
    registration r=new registration();
  }
}

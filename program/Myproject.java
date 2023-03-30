import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

//This Class for Login Page
public class Myproject extends JFrame implements ActionListener {

  Container cc;
  GridBagLayout g;
  GridBagConstraints c;
  Container co;
  JButton b1, b2;
  JLabel l1, l2;
  JTextField t;
  JPasswordField pt;
  Myproject p;
  newmain n;

  Myproject() {
    g = new GridBagLayout();
    setLayout(g); 
    co = getContentPane();
    Color cc = new Color(100,-- 150, 250);
    co.setBackground(cc);
    Font f = new Font("Calibri", Font.PLAIN, 30);
    l1 = new JLabel("User Name ");
    l1.setFont(f);
    l2 = new JLabel("Password ");
    l2.setFont(f);
    t = new JTextField(10);
    t.setFont(f);
    pt = new JPasswordField(10);
    pt.setFont(f);
    pt.setEchoChar('#');
    b1 = new JButton("LOGIN");
    b1.setFont(f);
    b2 = new JButton("REGISTER");
    b2.setFont(f);
    c = new GridBagConstraints();
    setVisible(true);
    setSize(1366, 768);
    c.gridx = 1;
    c.gridy = 0;
    g.setConstraints(l1, c);
    c.gridx = 1;
    c.gridy = 1;
    g.setConstraints(l2, c);
    c.gridx = 2;
    c.gridy = 1;
    c.insets = new Insets(40, 40, 40, 40);
    g.setConstraints(pt, c);
    c.gridx = 2;
    c.gridy = 20;
    c.insets = new Insets(40, 40, 40, 40);
    g.setConstraints(b1, c);
    c.gridx = 20;
    c.gridy = 20;
    c.insets = new Insets(20, 20, 20, 20);
    g.setConstraints(b2, c);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(l1);
    add(t);
    add(l2);
    add(pt);
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b2) {
      win w = new win();
      setVisible(false);
    }
    if (e.getSource() == b1) {
      String a = t.getText();
      String b = pt.getText();
      try {
        Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/",
          "root",
          "Nikhil2411"
        );
        System.out.println("Connected");
        Statement st = con.createStatement();
        ResultSet re = st.executeQuery("Select * from Details");
        System.out.println("ydgfsytfyiwsiuhf");
        while (re.next()) {
          System.out.println("------------");
          if (re.getString(1).equals(a) && re.getString(2).equals(b)) {
            System.out.println("===========");
            newmain n = new newmain();
            break;
          } else {
            JOptionPane.showMessageDialog(
              p,
              "You are Entered Wrong Password OR UserName "
            );
          }
        }
        st.close();
        con.close();
      } catch (Exception ee) {
        System.out.println("Error Occured");
      }
    }
  }

  public static void main(String args[]) {
    Myproject p = new Myproject();
  }
}

// this class for Register new User
class win extends JFrame implements ActionListener {

  GridBagLayout g;
  GridBagConstraints c;
  Container co;
  JButton b1, b2;
  JLabel l1, l2;
  JTextField t;
  JPasswordField pt;

  win() {
    g = new GridBagLayout();
    setLayout(g);
    Font f = new Font("Calibri", Font.PLAIN, 30);
    l1 = new JLabel("User Name ");
    l1.setFont(f);
    l2 = new JLabel("Password ");
    l2.setFont(f);
    t = new JTextField(10);
    t.setFont(f);
    pt = new JPasswordField(10);
    pt.setFont(f);
    pt.setEchoChar('#');
    b1 = new JButton("Register");
    b1.setFont(f);
    c = new GridBagConstraints();
    setVisible(true);
    setSize(700, 500);
    c.gridx = 1;
    c.gridy = 0;
    g.setConstraints(l1, c);
    c.gridx = 1;
    c.gridy = 1;
    g.setConstraints(l2, c);
    c.gridx = 2;
    c.gridy = 1;
    c.insets = new Insets(40, 40, 40, 40);
    g.setConstraints(pt, c);
    c.gridx = 2;
    c.gridy = 20;
    c.insets = new Insets(40, 40, 40, 40);
    g.setConstraints(b1, c);
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          dispose();
        }
      }
    );
    add(l1);
    add(t);
    add(l2);
    add(pt);
    add(b1);
    b1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    String us = t.getText();
    String pass = pt.getText();
    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/",
        "root",
        "Nikhil2411"
      );
      System.out.println("Connected");
      PreparedStatement ps = con.prepareStatement(
        "insert into Details values(?,?)"
      );
      ps.setString(1, us);
      ps.setString(2, pass);
      int i = ps.executeUpdate();
      con.close();
    } catch (Exception ex) {
      System.out.println("Error");
    }
    Myproject p = new Myproject();
    dispose();
  }
}

//Get Details From User
class newmain extends JFrame implements ActionListener {

  TextField Name, mobile, pin, city, state, Address;
  MenuBar mb;
  Menu m;
  MenuItem mi1, mi2;
  Label l, l1, l2, l3, l4, l5, l6, l7;
  Container c;
  Button b;
  newmain n;

  newmain() {
    Color co = new Color(100, 150, 250);
    setLayout(null);
    c = getContentPane();
    setTitle("MenuBar Demo");
    setSize(1366, 760);
    setVisible(true);
    c.setBackground(co);
    mb = new MenuBar();
    m = new Menu("Electicity Bill");
    mi1 = new MenuItem("Genrate Bill");
    mi2 = new MenuItem("Display Bill");
    m.add(mi1);
    //m.add(mi2);
    mb.add(m);
    setMenuBar(mb);
    Font f = new Font("Calibri", Font.PLAIN, 30);
    Font fa = new Font("Calibri", Font.PLAIN, 20);
    l = new Label("Welcome to the Electricity Bill Genration");
    l.setBounds(350, 15, 800, 40);
    l.setFont(f);
    l1 = new Label("Name");
    l1.setBounds(80, 90, 60, 30);
    l1.setFont(fa);
    Name = new TextField(10);
    Name.setBounds(155, 90, 200, 30);
    Name.setFont(fa);
    l2 = new Label("Address");
    l2.setBounds(700, 90, 100, 30);
    l2.setFont(fa);
    Address = new TextField(10);
    Address.setBounds(800, 90, 400, 30);
    Address.setFont(fa);
    l3 = new Label("Mobile No");
    l3.setBounds(80, 250, 100, 30);
    l3.setFont(fa);
    mobile = new TextField(10);
    mobile.setBounds(200, 250, 200, 30);
    mobile.setFont(fa);
    l4 = new Label("State");
    l4.setBounds(700, 250, 60, 30);
    l4.setFont(fa);
    state = new TextField(10);
    state.setBounds(760, 250, 200, 30);
    state.setFont(fa);
    l5 = new Label("City");
    l5.setBounds(80, 400, 50, 30);
    l5.setFont(fa);
    city = new TextField();
    city.setBounds(130, 400, 200, 30);
    city.setFont(fa);
    l6 = new Label("Pin");
    l6.setBounds(700, 400, 40, 30);
    l6.setFont(fa);
    pin = new TextField();
    pin.setBounds(750, 400, 200, 30);
    pin.setFont(fa);
    b = new Button("Submit");
    b.setBounds(460, 600, 200, 30);
    b.setFont(fa);
    b.addActionListener(this);
    mi1.addActionListener(this);
    add(l);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    add(l6);
    add(Name);
    add(Address);
    add(mobile);
    add(state);
    add(city);
    add(pin);
    add(b);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == mi1) {
      calcu cu = new calcu();
      dispose();
    }
    if (e.getSource() == b) {
      String a = mobile.getText();
      if (a.equals("")) {
        JOptionPane.showMessageDialog(n, "Must Be Enter Mobile Number");
      }
      if (a.length() < 10) {
        JOptionPane.showMessageDialog(n, "Mobile Number Must be 10 Digits");
      }
      if (a.length() == 10) {
        try {
          Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/",
            "root",
            "Nikhil2411"
          );
          System.out.println("Connected");
          PreparedStatement ps = con.prepareStatement(
            "insert into Personal values(?,?,?,?,?,?)"
          );
          ps.setString(1, Name.getText());
          ps.setString(2, Address.getText());
          ps.setString(3, mobile.getText());
          ps.setString(4, pin.getText());
          ps.setString(5, city.getText());
          ps.setString(6, state.getText());
          int i = ps.executeUpdate();
          con.close();
        } catch (Exception ew) {
          System.out.println("Error");
        }
        calcu cu = new calcu();
        dispose();
      }
    }
  }
}

//This class is used for Selecting user no & Enter unit,price.
class calcu extends JFrame implements ActionListener, ItemListener {

  TextField mobile, unit, price;
  Label l1, l2, l3, l4, l5, l6, l7, l8;
  JTextField Name, Address, pin, city, state;
  String i, nm, ada, pn, ct, sta;
  String s1, s2, s3, s4, s5, s6, s7;
  Button b;
  String a;
  Container c;
  Choice jb;
  String va;
  calcu cu;

  calcu() {
    c = getContentPane();
    Font fa = new Font("Calibri", Font.PLAIN, 20);
    Color col = new Color(152, 177, 76);
    l1 = new Label("Select Mobile Number");
    l1.setBounds(80, 90, 200, 30);
    l1.setFont(fa);
    l1.setBackground(col);
    b = new Button("Submit");
    b.setFont(fa);
    b.setBounds(460, 600, 200, 30);
    jb = new Choice();
    jb.setBounds(300, 90, 200, 30);
    jb.setFont(fa);
    String aa = jb.getSelectedItem();
    //jb.setSelectedItem(false);
    l2 = new Label("Name");
    l2.setBounds(700, 90, 60, 30);
    l2.setFont(fa);
    l2.setBackground(col);
    Name = new JTextField(10);
    Name.setBounds(780, 90, 400, 30);
    Name.setFont(fa);
    l3 = new Label("Address");
    l3.setBounds(80, 220, 100, 30);
    l3.setFont(fa);
    l3.setBackground(col);
    Address = new JTextField(10);
    Address.setBounds(180, 220, 300, 30);
    Address.setFont(fa);
    l4 = new Label("Pin");
    l4.setBounds(700, 220, 30, 30);
    l4.setFont(fa);
    l4.setBackground(col);
    pin = new JTextField(10);
    pin.setBounds(770, 220, 100, 30);
    pin.setFont(fa);
    l5 = new Label("City");
    l5.setBounds(80, 340, 40, 30);
    l5.setFont(fa);
    l5.setBackground(col);
    city = new JTextField(10);
    city.setBounds(180, 340, 300, 30);
    city.setFont(fa);
    l6 = new Label("State");
    l6.setBounds(700, 340, 70, 30);
    l6.setFont(fa);
    l6.setBackground(col);
    state = new JTextField(10);
    state.setBounds(770, 340, 300, 30);
    state.setFont(fa);
    l7 = new Label("Number of Units");
    l7.setBounds(80, 440, 150, 30);
    l7.setFont(fa);
    l7.setBackground(col);
    unit = new TextField(10);
    unit.setBounds(230, 440, 150, 30);
    unit.setFont(fa);
    //l8=new Label("Price Per Units");
    //l8.setBounds(700,440,150,30);
    //l8.setFont(fa);
    //l8.setBackground(col);
    //price=new TextField(10);
    //price.setBounds(850,440,150,30);
    //price.setFont(fa);
    setLayout(null);
    setVisible(true);
    setSize(1366, 760);
    setTitle("Amit Shimpi");
    jb.add("");
    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/",
        "root",
        "Nikhil2411"
      );
      System.out.println("Connected");
      Statement st = con.createStatement();
      ResultSet res = st.executeQuery("Select * from Personal");
      while (res.next()) {
        i = res.getString(3);
        jb.addItem(i);
      }
      st.close();
      con.close();
    } catch (Exception ex) {
      System.out.println("Error");
    }
    add(l1);
    add(jb);
    add(l2);
    add(Name);
    add(l3);
    add(Address);
    add(l4);
    add(pin);
    add(l5);
    add(city);
    add(l6);
    add(state);
    add(l7);
    add(unit);
    //add(l8);
    //add(price);
    add(b);
    c.setBackground(col);
    b.addActionListener(this);
    jb.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent e) {
    a = jb.getSelectedItem();
    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/",
        "root",
        "Nikhil2411"
      );
      System.out.println("Connected");
      Statement st = con.createStatement();
      ResultSet res = st.executeQuery("Select * from Personal");
      while (res.next()) {
        String va = res.getString(3);
        if (a.equals(va)) {
          Name.setText(res.getString(1));
          Address.setText(res.getString(2));
          pin.setText(res.getString(4));
          city.setText(res.getString(5));
          state.setText(res.getString(6));
        }
      }
      st.close();
      con.close();
    } catch (Exception ex) {
      System.out.println("Error");
    }
    s1 = Name.getText();
    s2 = Address.getText();
    s3 = pin.getText();
    s4 = city.getText();
    s5 = state.getText();
    Name.setEditable(false);
    Address.setEditable(false);
    pin.setEditable(false);
    city.setEditable(false);
    state.setEditable(false);
  }

  public void actionPerformed(ActionEvent e) {
    //this class is used to display bill;
    class Display extends JFrame {

      TextField Na, mob, pi, ci, st, Add, Show;
      int amit;
      Label l, l1, l2, l3, l4, l5, l6, l7, l8;
      int mul;
      Container c;
      Button b;

      Display() {
        try {
          Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/",
            "root",
            "Nikhil2411"
          );
          System.out.println("Connected");
          Statement st = con.createStatement();
          ResultSet res = st.executeQuery("Select * from bill");
          while (res.next()) {
            amit = res.getInt(1);
          }
          st.close();
          con.close();
        } catch (Exception ex) {
          System.out.println("Error");
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color co = new Color(98, 160, 176);
        setLayout(null);
        c = getContentPane();
        setTitle("ASD");
        setSize(1366, 760);
        setVisible(true);
        c.setBackground(co);
        Font fa = new Font("Calibri", Font.PLAIN, 20);
        Font f = new Font("Calibri", Font.BOLD, 20);
        l = new Label("Your Bill Details");
        l.setBounds(460, 20, 150, 30);
        l.setFont(f);
        l1 = new Label("Name");
        l1.setBounds(80, 90, 60, 30);
        l1.setFont(fa);
        Na = new TextField(10);
        Na.setBounds(155, 90, 200, 30);
        Na.setFont(fa);
        Na.setText(s1);
        Na.setEditable(false);
        l2 = new Label("Address");
        l2.setBounds(700, 90, 100, 30);
        l2.setFont(fa);
        Add = new TextField(10);
        Add.setBounds(800, 90, 400, 30);
        Add.setFont(fa);
        Add.setText(s2);
        Add.setEditable(false);
        l3 = new Label("Mobile No");
        l3.setBounds(80, 250, 100, 30);
        l3.setFont(fa);
        mob = new TextField(10);
        mob.setBounds(200, 250, 200, 30);
        mob.setFont(fa);
        mob.setText(i);
        mob.setEditable(false);
        l4 = new Label("State");
        l4.setBounds(700, 250, 60, 30);
        l4.setFont(fa);
        st = new TextField(10);
        st.setBounds(760, 250, 200, 30);
        st.setFont(fa);
        st.setText(s5);
        st.setEditable(false);
        l5 = new Label("City");
        l5.setBounds(80, 400, 50, 30);
        l5.setFont(fa);
        ci = new TextField();
        ci.setBounds(130, 400, 200, 30);
        ci.setFont(fa);
        ci.setText(s4);
        ci.setEditable(false);
        l6 = new Label("Pin");
        l6.setBounds(700, 400, 40, 30);
        l6.setFont(fa);
        pi = new TextField();
        pi.setBounds(750, 400, 200, 30);
        pi.setFont(fa);
        pi.setText(s3);
        pi.setEditable(false);
        l8 = new Label("Your Total Bill is");
        l8.setBounds(290, 550, 150, 30);
        l8.setFont(fa);
        mul = Integer.parseInt(unit.getText()) * amit;
        Show = new TextField(10);
        Show.setBounds(460, 550, 200, 30);
        Show.setFont(fa);
        Show.setText("" + mul);
        Show.setEditable(false);
        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l8);
        add(Na);
        add(Add);
        add(mob);
        add(st);
        add(ci);
        add(pi);
        add(Show);
      }
    }
    Display d = new Display();
  }
}

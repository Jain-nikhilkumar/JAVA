//package asn1;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

class Phone_B implements ActionListener {

  JPanel top_Panel, bottom_Panel;
  JScrollPane scroll_Pane;
  JFrame frame;

  JMenuBar menu_Bar = new JMenuBar();
  JMenu menu = new JMenu();
  JMenuItem menu_Item;



  Phone_B() {
    frame = new JFrame("Phone Book");
	
    frame.setSize(800, 550);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

    addWidgets();
    frame.setVisible(true);
  }

  public void addWidgets() {
	
    JPanel top_Panel = new JPanel();
    JPanel bottom_Panel = new JPanel();

	

    //Add Buttons To Bottom Panel

    JButton AddNew = new JButton("Add New Contact");
	AddNew.setFont(new Font("Times New Roman", Font.BOLD, 15));
    AddNew.setPreferredSize(new Dimension(150, 40));
    Color cc = new Color(222, 224, 255);
    bottom_Panel.setBackground(cc);
    JButton DeleteContact = new JButton("Delete Contact");
	DeleteContact.setFont(new Font("Times New Roman", Font.BOLD, 15));
    DeleteContact.setPreferredSize(new Dimension(150, 40));
    JButton SearchContacts = new JButton("Search Contacts");
	SearchContacts.setFont(new Font("Times New Roman", Font.BOLD, 15));
    SearchContacts.setPreferredSize(new Dimension(150, 40));
    JButton ViewContactList = new JButton("View All Contacts");
    ViewContactList.setPreferredSize(new Dimension(150, 40));
	ViewContactList.setFont(new Font("Times New Roman", Font.BOLD, 14));
    AddNew.addActionListener(this);
    DeleteContact.addActionListener(this);
    SearchContacts.addActionListener(this);

    ViewContactList.addActionListener(this);

    bottom_Panel.add(AddNew);
    bottom_Panel.add(DeleteContact);
    bottom_Panel.add(SearchContacts);
    bottom_Panel.add(ViewContactList);
    JButton nn = new JButton("░C░░O░░N░░T░░A░░C░░T░ ░B░░O░░O░░K░");
    nn.setFont(new Font("Times New Roman", Font.BOLD, 25));
    nn.setBackground(cc);
    nn.setPreferredSize(new Dimension(800, 500));
    
    bottom_Panel.add(nn);

    frame.getContentPane().add(top_Panel, BorderLayout.CENTER);
    frame.getContentPane().add(bottom_Panel, BorderLayout.CENTER);
	
	
  }

  public static void main(String args[]) {
    Phone_B add = new Phone_B();
  }

  OperationHandler oh = new OperationHandler();

  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand() == "Add New Contact") {
      oh.AddNew();
    } else if (ae.getActionCommand() == "Search Contacts") {
      oh.SearchContacts();
    } else if (ae.getActionCommand() == "Delete Contact") {
      oh.DeleteContact();
    } else if (ae.getActionCommand() == "View All Contacts") {
      oh.ViewAllContacts();
    } else if (ae.getActionCommand() == "About") {
    
    } else if (ae.getActionCommand() == "Help Contents") {
    }
  }
}

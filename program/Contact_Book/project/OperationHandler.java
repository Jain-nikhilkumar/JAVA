//package asn1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

class OperationHandler
  implements ListSelectionListener, ActionListener, Runnable {

  JFrame newFrame;
  JTextField txtFirstName;
  JTextField txtLastName;

  JTextField txtPhoneNo1;
  JTextField txtPhoneNo2;

  JButton BttnSaveAdded;

  Vector v = new Vector(10, 3);
  int i = 0, k = 0;

  Toolkit kit = Toolkit.getDefaultToolkit();
  Dimension screen_Size = kit.getScreenSize();


  //Image img = kit.getImage("k1.jpg");

  FileInputStream fis;
  ObjectInputStream ois;

  JList list;
  DefaultListModel listModel;
  ListSelectionModel listSelectionModel;

  JRadioButton byfname, bylname;

  Thread t;

  JTable searchTable;

  JTextField txtSearch;

  String columnNames[] = {
    "First Name",
    "Last Name",
    "Phone No 1.",
    "Phone No 2.",
  };

  Object data[][] = new Object[5][10];

  OperationHandler() {
    try {
      fis = new FileInputStream("dt.dat");
      ois = new ObjectInputStream(fis);
      v = (Vector) ois.readObject();
      ois.close();
    } catch (Exception e) {}
  }

  public void run() {
    try {
      FileOutputStream fos = new FileOutputStream(
        "E:\\NIKHIL\\JAVA\\program\\Contact_Book\\project\\dt.dat"
      );
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(v);
      oos.flush();
      oos.close();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(
        newFrame,
        "Error Opening Data File: Could Not Save Contents.",
        "Error Opening Data File",
        JOptionPane.INFORMATION_MESSAGE
      );
    }
  }

  public void AddNew() {
    newFrame = new JFrame("Add New");
    newFrame.setSize(500, 500);
    newFrame.setResizable(false);
   

    JLabel lblFirstName = new JLabel("First Name: ");
    lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 14));
    JLabel lblLastName = new JLabel("Last Name: ");
    lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 14));
    JLabel lblPhoneNo1 = new JLabel("Phone No 1: ");
    lblPhoneNo1.setFont(new Font("Times New Roman", Font.BOLD, 14));  
    JLabel lblPhoneNo2 = new JLabel("Phone No 2: ");
    lblPhoneNo2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    

    txtFirstName = new JTextField(10);
    txtLastName = new JTextField(10);
    txtPhoneNo1 = new JTextField(10);
    txtPhoneNo2 = new JTextField(10);

    JButton BttnAdd = new JButton("Add New!");
    BttnSaveAdded = new JButton("Save Added!");

    BttnAdd.addActionListener(this);
    BttnSaveAdded.addActionListener(this);
    BttnSaveAdded.setEnabled(false);

    JPanel centerPane = new JPanel();
    JPanel bottomPane = new JPanel();

    centerPane.add(lblFirstName);
    centerPane.add(txtFirstName);
    centerPane.add(lblLastName);
    centerPane.add(txtLastName);
    centerPane.add(lblPhoneNo1);
    centerPane.add(txtPhoneNo1);
    centerPane.add(lblPhoneNo2);
    centerPane.add(txtPhoneNo2);

    bottomPane.add(BttnAdd);
    bottomPane.add(BttnSaveAdded);

    centerPane.setLayout(new GridLayout(0, 2));

    newFrame.getContentPane().add(centerPane, BorderLayout.CENTER);

    newFrame.getContentPane().add(bottomPane, BorderLayout.SOUTH);
   newFrame.setSize(500, 500);
    newFrame.show();
  }

  public void SearchContacts() {
    newFrame = new JFrame("Search Contacts");
    newFrame.setSize(500, 500);
    

 

    JPanel topPane = new JPanel();
    
    JLabel label1 = new JLabel("Search Contacts by Last Name:");

    label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    
    topPane.add(label1);
    JPanel centerPane = new JPanel();
    JLabel label2 = new JLabel("Search String:");
    label2.setFont(new Font("Times New Roman", Font.BOLD, 14));
    
    txtSearch = new JTextField(20);
    JButton bttnSearch = new JButton("Search!");
    bttnSearch.addActionListener(this);
    JButton bttnCancel = new JButton("Cancel");
    bttnCancel.addActionListener(this);
    centerPane.add(label2);
    centerPane.add(txtSearch);
    centerPane.add(bttnSearch);
    centerPane.add(bttnCancel);
    searchTable = new JTable(data, columnNames);
    JScrollPane scroll_Pane = new JScrollPane(searchTable);
    searchTable.setPreferredScrollableViewportSize(new Dimension(500, 90));
    newFrame.getContentPane().add(scroll_Pane, BorderLayout.SOUTH);
    newFrame.getContentPane().add(topPane, BorderLayout.NORTH);
    newFrame.getContentPane().add(centerPane, BorderLayout.CENTER);
    newFrame.show();
  }

  public void DeleteContact() {
    String fname, lname;
    newFrame = new JFrame("Delete Contact");
    newFrame.setSize(500, 500);
    JPanel centerPane = new JPanel();
    listModel = new DefaultListModel();
    Contact contact = new Contact();
    for (int l = 0; l < v.size(); l++) {
      contact = (Contact) v.elementAt(l);
      fname = contact.getFName();
      lname = contact.getLName();
      listModel.addElement(fname + " " + lname);
    }

    list = new JList(listModel);

    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    listSelectionModel = list.getSelectionModel();
    listSelectionModel.addListSelectionListener(this);

    JScrollPane listScrollPane = new JScrollPane(list);

    JPanel topPane = new JPanel();
    JLabel label = new JLabel("Current Contacts:");
    label.setFont(new Font("Times New Roman", Font.BOLD, 14));
    
    topPane.add(label);

    JPanel bottomPane = new JPanel();

    JButton bttnDelete = new JButton("Delete Selected");
    bottomPane.add(bttnDelete);
    bttnDelete.addActionListener(this);

    JButton bttnCancel = new JButton("Cancel");
    bottomPane.add(bttnCancel);
    bttnCancel.addActionListener(this);

    newFrame.getContentPane().add(topPane, BorderLayout.NORTH);
    newFrame.getContentPane().add(listScrollPane, BorderLayout.CENTER);
    newFrame.getContentPane().add(bottomPane, BorderLayout.SOUTH);

    newFrame.show();
  }

  public void ViewAllContacts() {
    newFrame = new JFrame("All Contacts In The AddressBook");
    newFrame.setSize(500,500);
  

    Contact con = new Contact();

    String columnNames[] = {
      "First Name",
      "Last Name",
      "Phone No 1.",
      "Phone No 2.",
    };

    Object data[][] = new Object[v.size()][4];

    for (int j = 0; j < v.size(); j++) {
      con = (Contact) v.elementAt(k);

      data[j][0] = con.getFName();
      data[j][1] = con.getLName();
      data[j][2] = con.getPhoneNo1();
      data[j][3] = con.getPhoneNo2();
      k++;
    }
    k = 0;

    JTable abtable = new JTable(data, columnNames);
    JScrollPane scroll_Pane = new JScrollPane(abtable);
    abtable.setPreferredScrollableViewportSize(new Dimension(500, 500));

    JPanel pane = new JPanel();
    JLabel label = new JLabel("Contacts Currently In The Address Book");
    label.setFont(new Font("Times New Roman", Font.BOLD, 14));
    
    pane.add(label);

    newFrame.getContentPane().add(pane, BorderLayout.SOUTH);
    newFrame.getContentPane().add(scroll_Pane, BorderLayout.CENTER);
   
    newFrame.show();
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand() == "Add New!") {
      if (
        txtFirstName.getText().equals("") &&
        txtLastName.getText().equals("") &&
        txtPhoneNo1.getText().equals("") &&
        txtPhoneNo2.getText().equals("")
      ) {
        JOptionPane.showMessageDialog(
          newFrame,
          "Entries Empty! Fill in the required entries to save Contact.",
          "Entries Empty",
          JOptionPane.INFORMATION_MESSAGE
        );
      } else {
        Contact contact = new Contact();
        contact.setDetails(
          txtFirstName.getText(),
          txtLastName.getText(),
          txtPhoneNo1.getText(),
          txtPhoneNo2.getText()
        );
        v.addElement(contact);
        txtFirstName.setText("");
        txtLastName.setText("");

        txtPhoneNo1.setText("");
        txtPhoneNo2.setText("");

        if (BttnSaveAdded.isEnabled() == false) BttnSaveAdded.setEnabled(true);
      }
    } else if (ae.getActionCommand() == "Save Added!") {
      saveVector();
      newFrame.setVisible(false);
    } else if (ae.getActionCommand() == "Ok") {
      newFrame.setVisible(false);
    } else if (ae.getActionCommand() == "Delete Selected") {
      int index;
      try {
        index = list.getSelectedIndex();

        if (index == -1) {
          JOptionPane.showMessageDialog(
            newFrame,
            "Select a Contact first to delete it.",
            "Select a Contact First",
            JOptionPane.INFORMATION_MESSAGE
          );
        } else {
          int n = JOptionPane.showConfirmDialog(
            newFrame,
            "Are you sure you want to delete the selected Contact?",
            "Are you sure?",
            JOptionPane.YES_NO_OPTION
          );

          if (n == JOptionPane.YES_OPTION) {
            listModel.remove(index);
            v.removeElementAt(index);
            saveVector();
            newFrame.show();
          } else if (n == JOptionPane.NO_OPTION) {}
        }
      } catch (Exception e) {}
    } else if (ae.getActionCommand() == "Cancel") {
      newFrame.setVisible(false);
    } else if (ae.getActionCommand() == "Search!") {
      String SearchStr;
      SearchStr = txtSearch.getText();
      boolean flag = false;
      Contact con = new Contact();
      int c = 0;

      for (int t = 0; t < 5; t++) {
        data[t][0] = "";
        data[t][1] = "";
        data[t][2] = "";
        data[t][3] = "";
      }

      for (int t = 0; t < v.size(); t++) {
        con = (Contact) v.elementAt(t);
        System.out.print("\n 1 inside search");
        if (
          SearchStr.equalsIgnoreCase(con.getFName()) ||
          SearchStr.equalsIgnoreCase(con.getLName()) ||
          SearchStr.equalsIgnoreCase(con.getFName() + " " + con.getLName())
        ) {
          System.out.print("\n 2 inside search if");
          flag = true;
          System.out.print("\n 3 inside if");
          data[c][0] = con.getFName();
          data[c][1] = con.getLName();
          data[c][2] = con.getPhoneNo1();
          data[c][3] = con.getPhoneNo2();

          searchTable = new JTable(data, columnNames);
          newFrame.setSize(700, 221);
          

          if (c < 5) c++;
          System.out.print("\n 4 inside search if end" + flag);
        }
      }

      if (flag) {
        JOptionPane.showMessageDialog(
          newFrame,
          "Contact Found!",
          "Search Result!",
          JOptionPane.INFORMATION_MESSAGE
        );
      } else {
        JOptionPane.showMessageDialog(
          newFrame,
          "No Such Contact Found!",
          "Search Result!",
          JOptionPane.INFORMATION_MESSAGE
        );
      }

      System.out.print("\n 5 search end" + flag);
    } else if (ae.getActionCommand() == "Sort Contacts") {
      if (byfname.isSelected()) {
        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        Contact temp = new Contact();
        int l, m;

        for (l = 0; l < v.size() - 1; l++) {
          for (m = l + 1; m < v.size(); m++) {
            contact1 = (Contact) v.elementAt(l);
            contact2 = (Contact) v.elementAt(m);

            //swaping
            if (contact1.getFName().compareTo(contact2.getFName()) > 0) {
              temp = (Contact) v.elementAt(m); //temp to m
              v.setElementAt(v.elementAt(l), m); //L to m
              v.setElementAt(temp, l); //temp to L
            }
          }
        }

        saveVector();
      } else {
        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        Contact temp = new Contact();
        int l, m;

        for (l = 0; l < v.size() - 1; l++) {
          for (m = l + 1; m < v.size(); m++) {
            contact1 = (Contact) v.elementAt(l);
            contact2 = (Contact) v.elementAt(m);

            //swaping
            if (contact1.getLName().compareTo(contact2.getLName()) > 0) {
              temp = (Contact) v.elementAt(m); //m to temp
              v.setElementAt(v.elementAt(l), m); //L to m
              v.setElementAt(temp, l); //trmp to L
            }
          }
        }

        saveVector();
      }

      newFrame.setVisible(false);
    }
  }

  public void saveVector() {
    t = new Thread(this, "Save Vector Thread");
    t.start();
  }

  public void valueChanged(ListSelectionEvent lse) {}
}

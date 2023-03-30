//package asn1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Contact implements Serializable {

  private String FName;
  private String LName;
  private String PhoneNo1;
  private String PhoneNo2;

  public void setDetails(
    String fname,
    String lname,
    String phone1,
    String phone2
  ) {
    FName = fname;
    LName = lname;
    PhoneNo1 = phone1;
    PhoneNo2 = phone2;
  }

  public String getFName() {
    return FName;
  }

  public String getLName() {
    return LName;
  }

  public String getPhoneNo1() {
    return PhoneNo1;
  }

  public String getPhoneNo2() {
    return PhoneNo2;
  }
}

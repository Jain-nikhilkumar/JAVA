import java.util.*;
import java.util.regex.*;

class InvalidAddressException extends Exception {

  InvalidAddressException(String str) {
    super(str);
  }
}

class Student1 {

  static String a_name, s_name, c_name, hno, pno, c_no;

  static void Input() throws InvalidAddressException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter house number");
    hno = sc.nextLine();
    if (Pattern.matches(".*[0-9]", hno)) {
      System.out.println("Enter area Name");
      a_name = sc.nextLine();
      if (Pattern.matches(".*[A-Za-z]", a_name)) {
        System.out.println("Enter Street Name");
        s_name = sc.nextLine();
        if (Pattern.matches(".*[A-Za-z]", s_name)) {
          System.out.println("Enter City Name");
          c_name = sc.nextLine();
          if (Pattern.matches(".*[A-Za-z]", c_name)) {
            System.out.println("Enter Pincode number");

            pno = sc.nextLine();
            if (Pattern.matches(".*[0-9]{6}", pno)) System.out.println(
              "Your address is " +
              hno +
              " " +
              a_name +
              " " +
              s_name +
              " " +
              c_name +
              "-" +
              pno
            ); else throw new InvalidAddressException(
              "Invalid Pin Number-&gt;Pin number must contain atleast 6 digits"
            );
          } else throw new InvalidAddressException("Invalid CityName");
        } else throw new InvalidAddressException("Invalid StreetName");
      } else throw new InvalidAddressException("Invalid AreaName");
    } else throw new InvalidAddressException("Invalid houes number");
    System.out.println("Enter Contact Number");
    c_no = sc.nextLine();
    if (Pattern.matches(".*[0-9]{10}", c_no)) 
    System.out.println(
      "Contact No=" + c_no
    ); else throw new InvalidAddressException("Invalid ContactNumber");
  }

  public static void main(String args[]) {
    try {
      Input();
    } catch (InvalidAddressException e) {
      System.out.println(e);
    } finally {
      System.out.println("WELCOME TO INCREDIBLEINDIA");
    }
  }
}

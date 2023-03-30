import java.util.Scanner;

class InvalidPinCodeException extends Exception {

  public InvalidPinCodeException(String message) {
    super(message);
  }
}

interface Colorable {
  void setColor(String color);
  float calculateArea(int r);
}

class Address {

  private String houseNumber;
  private String areaName;
  private String streetName;
  private String cityName;
  private String pincode;
  private String contactNumber;

  public Address() {
    this.pincode = "111111";
  }

  public void readAddress() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter House Number: ");
    this.houseNumber = scanner.nextLine();
    System.out.print("Enter Area Name: ");
    this.areaName = scanner.nextLine();
    System.out.print("Enter Street Name: ");
    this.streetName = scanner.nextLine();
    System.out.print("Enter City Name: ");
    this.cityName = scanner.nextLine();
    boolean isValid = false;

    try {
      System.out.print("Enter Pincode: ");
      this.pincode = scanner.nextLine();
      validatePincode(this.pincode);
      isValid = true;
    } catch (InvalidPinCodeException e) {
      this.pincode = "111111";
      System.out.println(e.getMessage());
    }

    System.out.print("Enter Contact Number: ");
    this.contactNumber = scanner.nextLine();
  }

  public void displayAddress() {
    System.out.println("House Number: " + this.houseNumber);
    System.out.println("Area Name: " + this.areaName);
    System.out.println("Street Name: " + this.streetName);
    System.out.println("City Name: " + this.cityName);
    System.out.println("Pincode: " + this.pincode);
    System.out.println("Contact Number: " + this.contactNumber);
  }

  private void validatePincode(String pincode) throws InvalidPinCodeException {
    if (pincode.length() != 6) {
      throw new InvalidPinCodeException(
        "Invalid pincode. Pincode must be 6 digits long."
      );
    }
    if (pincode.charAt(0) == '0') {
      throw new InvalidPinCodeException(
        "Invalid pincode. Pincode cannot start with 0."
      );
    }
  }
}

public class pract3 {

  public static void main(String[] args) {
    Address address = new Address();
    address.readAddress();
    address.displayAddress();
    shapes a = new shapes();
    a.setshapname("rectagle");
    a.Prntsha();

    Circle circle = new Circle();
    circle.setColor("Red");
    circle.setshapname("Circle");
    circle.prtareacir();
    circle.Prntsha();
  }
}

class shapes {

  String shapeName;

  void setshapname(String s) {
    shapeName = s;
  }

  void Prntsha() {
    System.out.println("SHAPE NAME IS:" + shapeName);
  }
}

class Circle extends shapes implements Colorable {

  private String color;

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public float calculateArea(int r) {
    return (float) (Math.PI * r * r);
  }

  void prtareacir() {
    System.out.println("Color: " + color);
    System.out.println("Area: " + calculateArea(5));
  }

     
  
}

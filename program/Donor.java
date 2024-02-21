import java.util.Scanner;

public class Donor {

  static String name;
  static int age;
  static float height;
  static float weight;
  static char gender;
  static String bloodgroup;

  void updateWeight(float weight) {
    this.weight = weight;
  }

  void updateAge(int age) {
    this.age = age;
  }

  void updateHeight(float height) {
    this.height = height;
  }

  void DispalyDonor(
    String name,
    int age,
    float height,
    float weight,
    char gender,
    String bloodgroup
  ) {
    System.out.println("Donor name is " + name);
    System.out.println("Age is " + age);
    System.out.println("Height is " + height);
    System.out.println("Weight is " + weight);
    System.out.println("Gender is " + gender);
    System.out.println("Blood group is " + bloodgroup);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name: ");
    name = scanner.next();
    System.out.println("Enter age: ");
    age = scanner.nextInt();
    System.out.println("Enter height: ");
    height = scanner.nextFloat();
    System.out.println("Enter weight: ");
    weight = scanner.nextFloat();
    System.out.println("Enter gender: ");
    gender = scanner.next().charAt(0);
    System.out.println("Enter bloodgroup: ");
    bloodgroup = scanner.next();

    Donor d = new Donor();

    
    int choice = 0;
    do {
      System.out.println(
        "Enter Your Choice\n\n1.Display Donor Details\n3.Update Height\n4.Update weight\n"
      );
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          d.DispalyDonor(name, age, height, weight, gender, bloodgroup);

          break;
        case 2:
          System.out.println("Enter new height");
          float tempheight = scanner.nextFloat();
          d.updateHeight(tempheight);
          break;
        case 3:
          System.out.println("Enter new weight");
          float tempweight = scanner.nextFloat();
          d.updateWeight(tempweight);
          break;
        case 4:
          System.out.println("Enter new age");
          int tempage = scanner.nextInt();
          d.updateAge(tempage);
          break;
          case 5:

        default:
          System.out.println("errorr");
          break;
      }
    } while (choice ==5);
  }
}

import java.util.Scanner;

public class Teacher {

  String teachername;
  String teacheraddress;
  String teachercontact;
  int feedback;

  public static void main(String args[]) {
    System.out.println("IN MAIIN of parent");
  }

  Teacher() {
    this.teachername = "NIHARIKA";
    this.teacheraddress = "soalpur";
    this.teachercontact = "t4uiyuui";
    this.feedback=5;

    //System.out.println("TEACHER NAME IS :"+teachername);
  }

  Teacher(String teachername1, String teacheraddress1) {
    this();
    this.teacheraddress = teacheraddress1;
  
  }

  Teacher(String teachername1, String teacheraddress1, String teachercontact1) {
   this(teachername1,teacheraddress1);
    this.teachercontact = teachercontact1;
    
  }

  Teacher(String teachername1,String teacheraddress1, String teachercontact1 ,int feedback1) {
    this(teachername1,teacheraddress1,teachercontact1);
    this.feedback = feedback1;
    
  }

  void disp()
  {
    System.out.println("Name: " +  teachername);
            System.out.println("Address: " + teacheraddress );
            System.out.println("Contact " + teachercontact);
            System.out.println("Feedback: " + feedback);
  }

  //    void getTeacherDetail()
  //    {
  //

  //    }
  //    void printteacherdetails()
  //    {
  //     System.out.println("TEACHER NAME IS :"+teachername);
  //     System.out.println("TEACHER Address is :"+teacheraddress);
  //     System.out.println("TEACHER Contact IS :"+teachercontact);
  //     System.out.println("Feedback given IS :"+feedback);
}

// class Tester extends Teacher {

 
//   public static void main(String argd[])
//   {
//     Teacher t1 = new Teacher();
//     t1.disp();
//     Teacher t2=new Teacher( "ABCD", "XYZW");
//     t2.disp();
//     Teacher  t3=new Teacher("ABCD", "XYZW", "1234567890");
//     t3.disp();
//     Teacher t4=new Teacher("ABCD", "XYZW", "1234567890L", 5);
//     t4.disp();
//   }

// }


class EmgineeringTeacher extends Teacher
{
String Specialization;
String Subject; 
String deptname;



    void getTeacherDetail()
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("ENETR TEACHER specialization :");
     Specialization=sc.next();
     System.out.println("GET TEACHER subjext :");
     Subject=sc.next();
     System.out.println("GET TEACHER dept :");
     deptname=sc.next();
     
     
   }
   void printteacherdetails()
      {
        Teacher t6=new Teacher();
        System.out.println("TEACHER NAME IS :"+t6.teachername);
        System.out.println("TEACHER Address is :"+t6.teacheraddress);
        System.out.println("TEACHER Contact IS :"+t6.teachercontact);
        System.out.println("Feedback given IS :"+t6.feedback);
    
       System.out.println("TEACHER specialtization IS :"+Specialization);
       System.out.println("TEACHER subject is :"+Subject);
       System.out.println("TEACHER dept IS :"+deptname);
       
 }
 public static void main(String args[])
 {
  
EmgineeringTeacher et=new EmgineeringTeacher();

et.getTeacherDetail();

et.printteacherdetails();


}
 
}

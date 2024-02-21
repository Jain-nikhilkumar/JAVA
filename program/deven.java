import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {

  String name;

  Student(String s) {
    name = s;
  }

  @Override
  public int compareTo(Student s) {
    return this.name.compareTo(s.name);
  }

  public String toString() {
    return name;
  }
}

public class deven {

  public static void main(String[] args) {
    String arr[] = {"ab","cd","ef","gh","ij","kl","mn","op","qr","st","uv","wx","yz","gh","df","ad","hy","we","gy","er" };
    List<Student> listArr = new ArrayList<Student>();
    for (String s:arr) {
      listArr.add(new Student(s));
    }
    collection.sort(  listArr);

    Set<Student> uniqe = new TreeSet<Student>(listArr);
    System.out.println(uniqe);
  }
}

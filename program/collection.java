import java.util.*;

class Student implements Comparable<Student> {

  String name;

  Student(String s) {
    name = s;
  }

  @Override
  public int compareTo(Student s) {
    return this.name.compareTo(s.name);
  }

  @Override
  public String toString() {
    return name + " ";
  }
}

public class collection {

  public static void main(String[] args) {
    String names[] = {
      "ab",
      "cd",
      "ef",
      "gh",
      "ij",
      "kl",
      "mn",
      "op",
      "qr",
      "st",
      "uv",
      "wx",
      "yz",
      "gh",
      "df",
      "ad",
      "hy",
      "we",
      "gy",
      "er",
    };
    List<Student> listArr = new ArrayList<Student>();
    for (String s : names) {
      listArr.add(new Student(s));
    }
    Collections.sort(listArr);
    Set<Student> unique = new TreeSet<Student>(listArr);
    System.out.println("Sorted: " + listArr);
    System.out.println("Unique" + unique);
  }

public static void sort(List<student> listarr) {
}
}

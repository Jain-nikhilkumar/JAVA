class thredmultiple extends Thread {

  int n;

  thredmultiple(int n) {
    this.n = n;
  }

  public void run() {
    for (int i = n; i < 21; i++) {
      System.out.printf("%d X %d = %d", n, i, n * i);
    }
  }
}

class thredeprime extends Thread {

  int a, b;

  thredeprime(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void run() {
    for (int i = a; i <= b; i++) {
      int c = 0;
      for (int j = 3; j <= i / 2; j++) {
        if (i % j == 0) {
          c++;
          break;
        }
      }

      if (c == 0) {
        System.out.println(i + " ");
      }
    }
  }
}

public class thredsdemo {

  public static void main(String[] args) {
    thredmultiple t1 = new thredmultiple(10);
    thredeprime t2 = new thredeprime(2, 50);
    t1.start();
    try {
      t1.join();
    } catch (Exception e) {
      // TODO: handle exception
      System.err.println(e);
    }

    System.out.println("2nd ");
    t2.start();
  }
}

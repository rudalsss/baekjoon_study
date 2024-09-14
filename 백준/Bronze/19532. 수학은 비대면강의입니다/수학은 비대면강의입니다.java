import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();

    /*
    by = c - ax
    y = c/b - a/bx

    ey = f - dx
    y = f/e - d/ex

    c/b - a/bx = f/e - d/ex
    (d/e - a/b) x = f/e - c/b
    x = (f/e - c/b) / (d/e - a/b)
    
    double x = ((double)f / e - (double)c / b) / ((double)d / e - (double)a / b);

    double y = (double)c / b - (double)a / b * x;

    System.out.println((int)x+" "+(int)y);
    */

    for(int x=-999; x<=999; x++){
      for(int y=-999; y<=999; y++){
        if(a*x + b*y == c && d*x + e*y == f){
          System.out.println(x+" "+y);
          return;
        }
      }
    }


  }
}
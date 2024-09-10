import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int n = sc.nextInt();

    for(int i=n; i<=100; i++){
      int val1 = a*i + b ; //f(i)
      int val2 = c*i ; //c*g(i)
      if(val1 > val2){ //만족하지 못함
        System.out.println(0);
        break;
      }
      if(i==100) System.out.println(1); //모두 만족
    }
    
  }
}
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<=n; i++){
      int j = i;
      int sum = i;
      while(j>0){
        sum += (j%10);
        j /= 10;
      }
      if(sum==n){
        System.out.println(i);
        break;
      }

      if(i==n){
        System.out.println(0);
        break;
      }
    }
    
    
  }
}
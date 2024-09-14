import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int minCnt = Integer.MAX_VALUE; //최소총합

    // 3 ≤ N ≤ 5000 -> 3kg 최소0~최대1666개, 5kg 최소0~최대1000

    for(int i=0; i<=1666; i++){  //3kg짜리 개수
      for(int j=0; j<=1000; j++){  //5kg짜리 개수
        if(3*i+5*j == n){
          minCnt = Math.min(i+j, minCnt);
        }
      }
    }

    if (minCnt == Integer.MAX_VALUE) System.out.println(-1); //조건만족X
    else  System.out.println(minCnt);


  }
}
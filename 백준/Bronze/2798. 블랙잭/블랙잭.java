import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] nums = new int[n];
    for(int i=0; i<n; i++) nums[i] = sc.nextInt();

    int minDiff = Integer.MAX_VALUE;
    int minSum = 0;
    
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        for(int k=j+1; k<n; k++){
          int sum = nums[i] + nums[j] + nums[k]; //3개 조합의 합, 한번 반복마다 갱신
          if(sum <= m) { //m보다 작거나 같을때만 갱신
            int diff = m - sum;
            if( diff < minDiff ) {
              minDiff = diff;
              minSum = sum;
            }
          }
        }
      }
    }

    System.out.println(minSum);
}
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수행횟수
        
        long sum = 0;
        for(int i=1; i<=n-2; i++){
            sum += (long)i*(i+1)/2;
        }
        
        /*
            5 + 4 + 3 + 2 + 1 = 15
            4 + 3 + 2 + 1 = 10
            3 + 2 + 1 = 6
            2 + 1 = 3
            1 = 1
            의 총합
         */

        System.out.println(sum);
        System.out.println(3);  // 시간복잡도 n^3
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수행횟수
        long result = (long) n*(n-1)/2; 
        /*
            1 -> 2 ~ 7(6)
            2 -> 3 ~ 7(5)
            3 -> 4~7(4)
            ...
            6 -> 7~7(1)
            => 6*7/2
         */

        System.out.println(result);
        System.out.println(2);  // 시간복잡도 n^2
    }
}
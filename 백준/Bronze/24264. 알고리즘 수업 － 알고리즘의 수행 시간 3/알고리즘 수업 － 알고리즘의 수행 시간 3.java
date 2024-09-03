import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수행횟수
        long result = (long) n*n;  //수행 횟수는 n*n이므로 long

        System.out.println(result);
        System.out.println(2);  // 시간복잡도 n^2
    }
}

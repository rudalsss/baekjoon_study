import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(n*n);  // 반복문 수행횟수
        System.out.println(2);  // 시간복잡도 n^2
        sc.close();
    }
}
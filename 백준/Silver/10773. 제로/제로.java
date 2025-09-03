import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<k; i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;
        for(int n : stack){
            sum += n;
        }

        System.out.println(sum);
    }
}
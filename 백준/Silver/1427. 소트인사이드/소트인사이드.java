import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = br.readLine();
            int size = input.length();
            int n = Integer.parseInt(input);

            int[] arr = new int[size];
            int idx = 0;

            while(n>0){
                arr[idx++] = n % 10;
                n /= 10;
            }

            Arrays.sort(arr);
            Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(arr2, Collections.reverseOrder());

            for(int i=0; i<size; i++){
                System.out.print(arr2[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
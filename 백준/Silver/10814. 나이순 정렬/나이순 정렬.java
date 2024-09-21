import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());

            String[] names = new String[n];
            Integer[] olds = new Integer[n];
            Integer[] orders = new Integer[n];

            for(int i=0; i<n; i++){
                String[] inputs = br.readLine().split(" ");
                olds[i] = Integer.parseInt(inputs[0]);
                names[i] = inputs[1];
                orders[i] = i;
            }

            // 인덱스 정보 배열을 정렬
            Arrays.sort( orders, (a,b) -> {
                // 나이 순으로 정렬
                if ( olds[a] !=  olds[b] ) return Integer.compare( olds[a], olds[b] );
                // 나이가 같으면 -> 가입순서대로 정렬
                return a.compareTo(b);
            });

            //출력
            for(int i=0; i<n; i++){
                int idx = orders[i];
                System.out.println(olds[idx]+" "+names[idx]);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
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

            String[] inputs = new String[n];

            for(int i=0; i<n; i++){
                inputs[i] = br.readLine();
            }

            // 인덱스 정보 배열을 정렬
            Arrays.sort( inputs, (a,b) -> {
                // 길이가 같지 않다면 -> 길이 순서대로 정렬
                // 비교하는 값은 int, 정렬되는 것은 String(a,b)
                if ( a.length() !=  b.length() ) return Integer.compare( a.length(), b.length() );
                // 길이가 같다면 사전순으로 출력
                return a.compareTo(b);
            });

            // 배열을 Set으로 변환하여 중복 제거
            Set<String> uniqueInputs = new LinkedHashSet<>(Arrays.asList(inputs));

            //출력
            for(String set : uniqueInputs){
                System.out.println(set);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
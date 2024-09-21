import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());

            int[] x_values = new int[n];
            int[] y_values = new int[n];
            Integer[] index_values = new Integer[n]; //좌표순서, 순서정의를 위한 객체타입

            for(int i=0; i<n; i++){
                String line = br.readLine(); //한줄 읽기
                String[] nums = line.split(" "); //공백으로 분리
                x_values[i] = Integer.parseInt(nums[0]);
                y_values[i] = Integer.parseInt(nums[1]);
                index_values[i] = i;
            }

            // 인덱스 정보 배열을 정렬
            Arrays.sort( index_values, (a,b) -> {
                // x값이 같지 않으면 x값으로 오름차순 정렬
                if ( y_values[a] !=  y_values[b] ) return Integer.compare(y_values[a], y_values[b]);
                // x값이 같다면 y값으로 오름차순 정렬
                return Integer.compare(x_values[a], x_values[b]);
            });

            //출력
            for(int i=0; i<n; i++){
                int index = index_values[i];
                System.out.print(x_values[index]+" "+y_values[index]);
                System.out.println();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
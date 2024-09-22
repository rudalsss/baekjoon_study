import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 첫번째 입력값 배열
            int n = Integer.parseInt(br.readLine());
            String[] inputs = br.readLine().split(" ");
            int[] nums = new int[n];
            for(int i=0; i<n; i++){
                nums[i] = Integer.parseInt(inputs[i]);
            }

            // 두번째 입력값으로 map생성
            Map<Integer, Integer> map = new HashMap<>();
            int m = Integer.parseInt(br.readLine());
            inputs = br.readLine().split(" ");
            for(int i=0; i<m; i++){
                int num = Integer.parseInt(inputs[i]);
                map.put( num, 0);
            }

            for(int i=0; i<n; i++){
                int num = nums[i];
                if( map.containsKey(num) ){
                    map.put(num, 1);    //키(값)이 존재한다면 1로 업데이트
                }
            }

            // 순서대로 결과 출력
            for (int i = 0; i < m; i++) {
                System.out.print(map.get(Integer.parseInt(inputs[i])) + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n]; // 원본 배열
            //Integer[] sorted_nums = new Integer[n]; // 정렬 배열
            HashMap<Integer, Integer> map = new HashMap<>(); // 결과 맵
            
            String[] input = br.readLine().split(" ");
            for(int i=0; i<n; i++){
                int num = Integer.parseInt(input[i]);
                nums[i] = num;
                //sorted_nums[i] = num;
            }

//            Arrays.sort(sorted_nums);
//            Set<Integer> sorted_nums_set = new LinkedHashSet<>(Arrays.asList(sorted_nums)); //중복제거
//            sorted_nums = sorted_nums_set.stream().toArray(Integer[]::new); //재할당

            // 중복 제거 및 정렬
            Set<Integer> sorted_nums_set = new TreeSet<>();
            for (int num : nums) {
                sorted_nums_set.add(num);
            }

            int cnt = 0;
            for(Integer num : sorted_nums_set){
                map.put(num, cnt);
                cnt++;
            }

            /*for(int i=0; i<n; i++){
                System.out.print(map.get(nums[i]) + " ");
            }
            */
            // 결과 출력 최적화를 위해 StringBuilder 사용
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(map.get(nums[i])).append(" ");
            }
            // 최종적으로 한번에 출력
            System.out.println(sb.toString().trim());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
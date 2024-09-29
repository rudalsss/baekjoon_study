import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            HashSet<String> set = new HashSet<>();

            //set에 추가
            for(int i=0; i<n; i++){
                set.add(br.readLine());
            }

            //입력받으며 set에 존재하는지 확인
            int cnt = 0;
            for(int i=0; i<m; i++){
                String str = br.readLine();
                if(set.contains(str)) cnt++;
            }
            System.out.println(cnt);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
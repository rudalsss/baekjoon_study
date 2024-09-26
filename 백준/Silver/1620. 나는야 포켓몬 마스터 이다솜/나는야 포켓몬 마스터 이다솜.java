import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] inputs = br.readLine().split(" ");
            int n = Integer.parseInt(inputs[0]); //도감 수
            int m = Integer.parseInt(inputs[1]); //문제 수

            HashMap<Integer, String> dogam1 = new HashMap<>();
            HashMap<String, Integer> dogam2 = new HashMap<>();

            for(int i=1; i<=n; i++){
                String name = br.readLine();
                dogam1.put(i, name);
                dogam2.put(name, i);
            }
            
            for(int i=0; i<m; i++){
                String quiz = br.readLine();
                try{
                    int num = Integer.parseInt(quiz);
                    System.out.println(dogam1.get(num));
                } catch (NumberFormatException e ){ //문제가 숫자값이 아님 -> 문자값임
                    // val값을 통해 key를 얻기위해 역방향 전체 탐색
                    System.out.println(dogam2.get(quiz));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


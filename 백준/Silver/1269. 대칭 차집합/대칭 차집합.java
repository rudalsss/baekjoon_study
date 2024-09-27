import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            String[] Ainputs = br.readLine().split(" ");
            String[] Binputs = br.readLine().split(" ");

            HashMap<Integer, Integer> map = new HashMap<>();

            // 집합A의 숫자를 map에 +1
            for(int i=0; i<a; i++){
                int num = Integer.parseInt(Ainputs[i]);
                map.put(num, 1);
            }

            // 집합B의 숫자를 map에 +1
            for(int i=0; i<b; i++){
                int num = Integer.parseInt(Binputs[i]);
                if(map.containsKey(num)){
                    int cnt = map.get(num)+1;
                    map.put(num, cnt);
                } else {
                    map.put(num, 1);
                }
            }

            // 대칭 차집합 = 교집합이 아닌 것 = map값이 1인 숫자들
            int cnt = 0;
            for( Map.Entry<Integer, Integer> entry : map.entrySet() ){
                if(entry.getValue()==1){
                    cnt++;
                }
            }

            System.out.println(cnt);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


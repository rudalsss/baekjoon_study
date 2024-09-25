import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder()); // 이름 + 0(퇴근), 1(출근)
            //HashMap의 기능을 확장한 형태로, 입력된 순서대로 요소를 유지하며, 키와 값의 쌍을 관리
            for(int i=0; i<n; i++){
                String[] inputs = br.readLine().split(" ");

                if( inputs[1].equals("enter") ){
                    map.put(inputs[0], 1);
                } else {
                    map.put(inputs[0], 0);
                }
            }

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(entry.getValue().equals(1)){
                    System.out.println(entry.getKey());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


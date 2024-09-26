import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> cards = new HashMap<>();
            String[] inputs = br.readLine().split(" ");
            for(int i=0; i<n; i++){
                int num = Integer.parseInt(inputs[i]);
                if(cards.containsKey(num)){ //존재하는 숫자라면
                    int cnt = cards.get(num) + 1; // 기존 cnt를 1증가시켜 저장
                    cards.put(num, cnt);
                } else {
                    cards.put(num, 1);
                }
            }

            int m = Integer.parseInt(br.readLine());
            inputs = br.readLine().split(" ");
            for(int i=0; i<m; i++){
                int num = Integer.parseInt(inputs[i]);
                if( !cards.containsKey(num) ){
                    System.out.print(0+" ");
                } else {
                    System.out.print(cards.get(num)+" ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


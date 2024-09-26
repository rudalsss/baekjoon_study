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
            int n = Integer.parseInt(inputs[0]); //듣도 못한 수
            int m = Integer.parseInt(inputs[1]); //보도 못한 수

            TreeMap<String, Integer> people = new TreeMap<>();
            for(int i=0; i<n; i++){ //듣도 못한 사람들 : +1
                String name = br.readLine();
                people.put(name, 1);
            }

            for(int i=0; i<m; i++){ //보도 못한 사람들 : +1
                String name = br.readLine();
//                if(!people.containsKey(name)){
//                    people.put(name,1);
//                } else {
//                    int val = people.get(name)+1;
//                    people.put(name,val);
//                }
                if(people.containsKey(name)){
                    int val = people.get(name)+1;
                    people.put(name,val);
                }
            }

            int cnt = 0;
            for(Map.Entry<String, Integer> map : people.entrySet()){
                if(map.getValue()==2) cnt++;
            }
            System.out.println(cnt);

            for(Map.Entry<String, Integer> map : people.entrySet()){
                if(map.getValue()==2) System.out.println(map.getKey());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


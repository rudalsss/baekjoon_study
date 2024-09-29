import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            HashSet<String> set = new HashSet<>(); //중복을 제거해주는 set 사용
            
            String inputs = br.readLine();
            for(int i=1; i<=inputs.length(); i++){ // 부분문자열 길이 범위 ( 1 ~ 전체길이 )
                for(int j=0; j<=inputs.length()-i; j++){ // 잘라낼 문자열 인덱스 범위
                    String substring = inputs.substring(j, j + i);// i만큼 잘라내기
                    set.add(substring); //set에 추가
                }
            }

            System.out.println(set.size());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


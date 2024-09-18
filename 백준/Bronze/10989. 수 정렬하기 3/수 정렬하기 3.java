import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int n = Integer.parseInt(br.readLine());
      int[] count = new int[10001];  // 1~10000의 범위 자연수
      
      // 입력받아 위치에 카운팅
      for (int i = 0; i < n; i++) {
        int num = Integer.parseInt(br.readLine());
        count[num]++;
      }

      // 출력
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i < 10001; i++) {
        while (count[i] > 0) {
          sb.append(i).append('\n');
          count[i]--; // 추가한뒤 -1 --> 중복되어 남아있으면 다시 루프
        }
      }
      System.out.print(sb);  // 출력 시간을 줄이기 위해 한 번에 출력
        
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
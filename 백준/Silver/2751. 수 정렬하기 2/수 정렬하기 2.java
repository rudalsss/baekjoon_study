import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(br.readLine());
      }

      Arrays.sort(arr);
      for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

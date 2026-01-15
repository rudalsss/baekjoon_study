import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        // map 채우기
        int[][] map = new int[n][m];
        for (int i = 0; i < n ; i++) {
            String str = br.readLine();
            for (int j = 0; j < m ; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        // 이동좌표 설정
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][] dist = new int[n][m];

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        dist[0][0] = 1;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];

            for(int i = 0; i < 4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                //범위밖
                if( nr<0 || nc<0 || nr>=n || nc>=m ) continue;
                //벽
                if(map[nr][nc]==0) continue;
                //이미 방문
                if(dist[nr][nc]!=0) continue;

                dist[nr][nc] = dist[r][c]+1;
                queue.offer(new int[]{nr,nc});
            }
        }

        System.out.println(dist[n-1][m-1]);
    }
}
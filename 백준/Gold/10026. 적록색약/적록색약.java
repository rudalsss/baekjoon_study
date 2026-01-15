import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main{
    // 기본 값
    static int n;
    static char[][] map;
    static int[][] visited;

    // 이동좌표 설정
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void normal_BFS(int sr, int sc){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr,sc});
        visited[sr][sc] = 1;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for(int k = 0; k < 4; k++){
                int nextRow = row + dr[k];
                int nextCol = col + dc[k];

                if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n) continue;
                if (visited[nextRow][nextCol] == 1) continue;
                if(map[nextRow][nextCol] != map[row][col]) continue; // 다른 영역이라면 종료

                visited[nextRow][nextCol] = 1; // 새 영역의 방문체크
                queue.offer(new int[]{nextRow, nextCol});
            }
        }
    }

    public static void blind_BFS(int sr, int sc){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr,sc});
        visited[sr][sc] = 1;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for(int k = 0; k < 4; k++){
                int nextRow = row + dr[k];
                int nextCol = col + dc[k];

                if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n) continue;
                if (visited[nextRow][nextCol] == 1) continue;
                if(map[row][col]=='B' && map[nextRow][nextCol]!='B') continue; // 색약조건
                if(map[row][col]!='B' && map[nextRow][nextCol] == 'B') continue;

                visited[nextRow][nextCol] = 1; // 새 영역의 방문체크
                queue.offer(new int[]{nextRow, nextCol});
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        visited = new int[n][n];

        // map 채우기
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int normal_area = 0;
        int blind_area = 0;

        // 정상상태 : 방문하지 않은 전좌표 탐색
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if (visited[i][j] == 0) {
                    normal_BFS(i, j);
                    normal_area++; // 하나의 영역종료
                }
            }
        }

        visited = new int[n][n];

        // 색약상태 : 방문하지 않은 전좌표 탐색
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if (visited[i][j] == 0) {
                    blind_BFS(i, j);
                    blind_area++; // 하나의 영역종료
                }
            }
        }



        System.out.println(normal_area + " " + blind_area);
    }
}
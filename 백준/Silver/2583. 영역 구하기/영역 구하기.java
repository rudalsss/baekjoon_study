import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    // 기본 값
    static int n;
    static int m;
    static int k;
    static int[][] map;
    static int[][] visited;

    // 이동좌표 설정
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static int normal_BFS(int sr, int sc){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr,sc});
        visited[sr][sc] = 1;

        int area_size = 1;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for(int k = 0; k < 4; k++){
                int nextRow = row + dr[k];
                int nextCol = col + dc[k];

                if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) continue;
                if(visited[nextRow][nextCol] == 1) continue;
                if(map[nextRow][nextCol] == 1) continue;

                visited[nextRow][nextCol] = 1; // 새 영역의 방문체크
                queue.offer(new int[]{nextRow, nextCol}); // 새 영역의 큐 추가
                area_size++;
            }
        }
        return area_size;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        n = Integer.parseInt(inputs[0]);
        m = Integer.parseInt(inputs[1]);
        k = Integer.parseInt(inputs[2]);
        map = new int[n][m];
        visited = new int[n][m];

        // map 채우기
        for(int i = 0; i < k; i++){
            inputs = br.readLine().split(" ");
            int x1 = Integer.parseInt(inputs[0]);
            int y1 = Integer.parseInt(inputs[1]);
            int x2 = Integer.parseInt(inputs[2]);
            int y2 = Integer.parseInt(inputs[3]);

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    int row = n - 1 - y;
                    int col = x;
                    map[row][col] = 1;
                }
            }
        }

        List<Integer> areas = new ArrayList<>();

        // 정상상태 : 방문하지 않은 전좌표 탐색
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && map[i][j]==0) {
                    // BFS시작조건 : 방문하지 않은 상태 + 유효영역
                    int area_size = normal_BFS(i, j);
                    areas.add(area_size);
                }
            }
        }

        Collections.sort(areas);
        System.out.println(areas.size());
        for (int area : areas) {
            System.out.print(area + " ");
        }
    }
}
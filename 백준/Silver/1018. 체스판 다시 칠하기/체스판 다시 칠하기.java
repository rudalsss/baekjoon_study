import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    char[][] board = new char[n][m];

    for (int i = 0; i < n; i++) {
      String row = sc.next();
      for (int j = 0; j < m; j++) {
        board[i][j] = row.charAt(j);
      }
    }

    char[][] case1 = {
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };  

    char[][] case2 = {
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
      {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
      {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };

      
    int minChangeCnt = Integer.MAX_VALUE; 
    
    for(int i=0; i<=n-8; i++){
      for(int j=0; j<=m-8; j++){
        int changeCnt1 = 0; //  case1일때 바꿔야될 갯수
        int changeCnt2 = 0; // case2일때 바꿔야될 갯수
        
        for(int k=0; k<8; k++){ 
          for(int l=0; l<8; l++){
            if(board[i+k][j+l] != case1[k][l]) changeCnt1++;
            if(board[i+k][j+l] != case2[k][l]) changeCnt2++;
          }
        }
        //minChangeCnt = Math.min(minChangeCnt, changeCnt1, changeCnt2);
        minChangeCnt = Math.min(minChangeCnt, Math.min(changeCnt1, changeCnt2));

      }
    }

    System.out.println(minChangeCnt);

  }
}
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * [골드 4] 감시 : https://www.acmicpc.net/problem/15683
 */
public class Main {

    static int n;
    static int m;
    static int[][] board1;
    static int[][] board2;
    static int[] dx;
    static int[] dy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        List<Position> cctvList = new ArrayList<>();
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        board1 = new int[n][m];
        board2 = new int[n][m];
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};
        int result = 0;

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                board1[i][j] = Integer.parseInt(inputs[j]);
                if (board1[i][j] != 0 && board1[i][j] != 6) {
                    cctvList.add(new Position(i, j));
                }
                if (board1[i][j] == 0) {
                    result++;
                }
            }
        }

        int cctvSize = cctvList.size();

        for (int tmp = 0; tmp < (int) Math.pow(4, cctvSize); tmp++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    board2[i][j] = board1[i][j];
                }
            }

            int brute = tmp;
            for (int i = 0; i < cctvSize; i++) {
                int dir = brute % 4;
                brute /= 4;

                Position cctv = cctvList.get(i);
                int x = cctv.x;
                int y = cctv.y;

                if(board1[x][y] == 1){
                    upd(x, y, dir);
                } else if (board1[x][y] == 2) {
                    upd(x, y, dir);
                    upd(x, y, dir + 2);
                } else if (board1[x][y] == 3) {
                    upd(x, y, dir);
                    upd(x, y, dir + 1);
                } else if (board1[x][y] == 4) {
                    upd(x, y, dir);
                    upd(x, y, dir + 1);
                    upd(x, y, dir + 2);
                } else if (board1[x][y] == 5) {
                    upd(x, y, dir);
                    upd(x, y, dir + 1);
                    upd(x, y, dir + 2);
                    upd(x, y, dir + 3);
                }

                int tempResult = 0;
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        if (board2[j][k] == 0) {
                            tempResult++;
                        }
                    }
                }
                result = Math.min(tempResult, result);
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void upd(int x, int y, int dir) {
        int nx = x;
        int ny = y;
        while (true) {
            nx = nx - dx[dir % 4];
            ny = ny - dy[dir % 4];
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                return;
            }
            if (board1[nx][ny] == 6) {
                return;
            }
            board2[nx][ny] = 7;
        }
    }

    public static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

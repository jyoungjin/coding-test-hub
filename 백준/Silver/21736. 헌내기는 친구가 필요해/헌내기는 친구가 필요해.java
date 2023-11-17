import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] board = new int[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<Position> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char[] array = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (array[j] == 'I') {
                    board[i][j] = 1;
                    queue.add(new Position(i, j));
                }
                if (array[j] == 'X') {
                    board[i][j] = -1;
                }
                if (array[j] == 'P') {
                    board[i][j] = 2;
                }
            }
        }

        int result = 0;
        while (!queue.isEmpty()) {
            Position position = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (board[nx][ny] == -1 || board[nx][ny] == 1) {
                    continue;
                }
                if (board[nx][ny] == 2) {
                    result++;
                }
                board[nx][ny] = 1;
                queue.add(new Position(nx, ny));
            }
        }
        System.out.println(result == 0 ? "TT" : result);
        br.close();
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

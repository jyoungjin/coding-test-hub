import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int[][] res = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        Queue<Position> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                board[i][j] = input;
                res[i][j] = input == 0 ? 0 : -1;
                if (input == 2) {
                    queue.add(new Position(i, j, 0));
                    visited[i][j] = true;
                    res[i][j] = 0;
                }
            }
        }

        while (!queue.isEmpty()) {
            Position poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (visited[nx][ny] || board[nx][ny] == 0) {
                    continue;
                }
                visited[nx][ny] = true;
                res[nx][ny] = poll.value + 1;
                queue.add(new Position(nx, ny, poll.value + 1));
            }

        }

        for (int[] arr : res) {
            System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

    static class Position {
        int x;
        int y;
        int value;

        Position(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}

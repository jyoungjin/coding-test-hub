import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int[][] board = new int[n + 1][n + 1];
        boolean[] visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = 1;
            board[y][x] = 1;
        }

        // DFS
        recur(board, visit, v);

        // BFS
        sb.append("\n");
        Arrays.fill(visit, false);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (visit[poll]) {
                continue;
            }
            visit[poll] = true;
            sb.append((poll)).append(" ");
            for (int i = 1; i <= n; i++) {
                if (board[poll][i] == 1) {
                    queue.add(i);
                }
            }
        }
        System.out.println(sb);
    }

    private static void recur(int[][] board, boolean[] visit, int v) {
        if (visit[v]) {
            return;
        }
        visit[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i < board.length; i++) {
            if (board[v][i] == 1) {
                recur(board, visit, i);
            }
        }
    }
}
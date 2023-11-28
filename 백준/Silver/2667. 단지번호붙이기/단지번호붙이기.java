import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        Queue<Position> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                board[i][j] = Character.getNumericValue(charArray[j]);
            }
        }

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && board[i][j] == 1) {
                    int count = 1;
                    visited[i][j] = true;
                    queue.add(new Position(i, j));
                    while (!queue.isEmpty()) {
                        Position poll = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = poll.x + dx[k];
                            int ny = poll.y + dy[k];

                            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                                continue;
                            }
                            if (visited[nx][ny] || board[nx][ny] == 0) {
                                continue;
                            }

                            count++;
                            visited[nx][ny] = true;
                            queue.add(new Position(nx, ny));
                        }
                    }
                    arrayList.add(count);
                }
            }
        }

        System.out.println(arrayList.size());
        Collections.sort(arrayList);
        arrayList.forEach(System.out::println);
    }

    static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

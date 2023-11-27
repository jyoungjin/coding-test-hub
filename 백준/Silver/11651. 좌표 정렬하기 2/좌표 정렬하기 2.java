import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Position[] positions = new Position[n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            positions[i] = new Position(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }

        Arrays.sort(positions, (e1, e2) -> {
            if (e1.y == e2.y) {
                return e1.x - e2.x;
            } else {
                return e1.y - e2.y;
            }
        });

        for (Position position : positions) {
            System.out.println(position.x + " " + position.y);
        }
    }

    public static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

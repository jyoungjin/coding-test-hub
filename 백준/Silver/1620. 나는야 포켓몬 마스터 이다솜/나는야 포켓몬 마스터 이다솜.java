import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map1.put(i, name);
            map2.put(name, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            String tmp = br.readLine();
            if (Character.isDigit(tmp.charAt(0))) {
                sb.append(map1.get(Integer.parseInt(tmp))).append("\n");
            } else {
                sb.append(map2.get(tmp)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}

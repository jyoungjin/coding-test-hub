import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int a = n % h == 0 ? h : n % h;
            int b = n % h == 0 ? (n / h) : (n / h) + 1;

            StringBuilder sb = new StringBuilder();
            sb.append(a);
            String bString = String.valueOf(b);
            sb.append(bString.length() == 1 ? "0" + bString : bString);
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
    }
}

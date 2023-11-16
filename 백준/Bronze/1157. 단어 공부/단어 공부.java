import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String lowerCase = str.toLowerCase();

        int[] arr = new int[26];
        for (char c : lowerCase.toCharArray()) {
            arr[c - 97] += 1;
        }

        int max = 0;
        int cnt = 1;
        char c = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cnt = 0;
                c = (char) (i + 65);
            }
            if (arr[i] == max) {
                cnt++;
            }
        }

        if (cnt > 1) {
            bw.write("?");
        } else {
            bw.write(c);
        }

        bw.flush();
        bw.close();
        br.close();

    }
}

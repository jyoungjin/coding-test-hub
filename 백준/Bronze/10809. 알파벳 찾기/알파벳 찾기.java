import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (arr[charArray[i] - 97] == -1) {
                arr[charArray[i] - 97] = i;
            }
        }

        bw.write(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        bw.flush();
        br.close();
    }
}

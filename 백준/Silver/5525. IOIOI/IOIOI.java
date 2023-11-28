import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int res = 0;
        int count = 0;

        for (int i = 1; i < m - 1; i++) {
            if (arr[i - 1] == 'I' && arr[i] == 'O' && arr[i + 1] == 'I') {
                count++;
                if (count == n) {
                    count--;
                    res++;
                }
                i++;
            } else {
                count = 0;
            }
        }
        System.out.println(res);
    } 
}
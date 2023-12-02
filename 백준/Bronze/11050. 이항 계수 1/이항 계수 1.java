import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
 
		// nCk = n! / ((n-k)! * k!)
		System.out.println(factorial(n) / (factorial(n - k) * factorial(k)));
	}
 
	static int factorial(int n) {
		// factorial(0) == 1 이다. 
		if (n <= 1)	{
			return 1;
		}
		return n * factorial(n - 1);
	}
}
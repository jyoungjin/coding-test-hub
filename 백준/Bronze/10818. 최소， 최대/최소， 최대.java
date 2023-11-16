import java.util.Arrays;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.printf("%d %d",arr[0],arr[n-1]);
  }
}
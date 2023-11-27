import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			sum+=arr[i]*n;
			n--;
		}
		System.out.println(sum);
  }
}
package Assignment_1;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int arr[]= new int [n];
		System.out.println("Enter the array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			int maxsum = 0;
			for(int j=i;j<n;j++) {
				maxsum+=arr[j];
				if(maxsum>=sum) {
					sum=maxsum;
				}
			}
		}
		System.out.println(sum);
	}

}

package Assignment_1;
import java.util.*;
public class Q5 {
	
	static void Rotate(int arr[]) {
		int s = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
			arr[i+1] = s;
		}
	}

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
		System.out.println("Enter the number of times you want to rotate");
		int k = sc.nextInt();
		for(int i=0;i<k;i++) {
			Rotate(arr);
			for(int b : arr) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

}

package Assignment_1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// import array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		//main code
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=i && arr[i]<n) {
//				int temp = arr[i];
//				arr[i] = arr[temp];
//				arr[temp] = temp;
//			}
//			else if(arr[i]>n) {
//				continue;
//			}
//		}
		
//		for(int i=n-1;i>=0;i--) {
//			for(int j=0;j<i;j++){
//				if(arr[j]>arr[j+1]){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=i) {
//				arr[i] = -1;
//			}
//		}
		int a[] = new int [n];
		for(int i=0;i<n;i++) {
			if(arr[i]<n) {
				int temp =arr[i];
				a[temp] = arr[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]!=i) {
				a[i] = -1;
			}
		}
		for(int b : a) {
			System.out.print(b+" ");
		}
	}

}

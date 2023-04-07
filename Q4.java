package Assignment1;
import java.util.*;

public class Q4 {

	static void BinarySearch(int arr[],int key,int low,int high) {
		int mid = (low+high)/2;
		if(low>=high && arr[mid]!=key) {
			System.out.println("Key not found");
			return;
		}
		if(arr[mid]==key) {
			System.out.println("Key found");
			return;
		}
		if(key<arr[mid]) {
			BinarySearch(arr,key,0,mid-1);
		}
		if(key>arr[mid]) {
			BinarySearch(arr,key,mid+1,arr.length-1);
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
		System.out.println("Enter your key :");
		int key = sc.nextInt();
		BinarySearch(arr,key,0,arr.length-1);
	}

}

package Assignment_1;

import java.util.Scanner;

public class Q7 {

	// Waveform

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

		// main code
		for (int i = 1; i < n - 1; i += 2) {
			if (arr[i] > arr[i - 1]) {
				int temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
			} else if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
		for(int b : arr) {
			System.out.print(b+" ");
		}

	}

}

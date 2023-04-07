package Assignment1;

import java.util.*;

public class Q2 {
	
	static String s = " ";

	static void bin(int n) {
		
		if (n >= 1) {
			int temp = n % 2;
			s = temp + s;
			bin(n / 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n==0) {
			System.out.println(0);
		}
		bin(n);
		System.out.println(s);
	}

}

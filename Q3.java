package Assignment1;
import java.util.*;
public class Q3 {

	static void RevInt(int n) {
		if(n!=0) {
			System.out.print(n%10);
			RevInt(n/10);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		RevInt(n);
	}

}

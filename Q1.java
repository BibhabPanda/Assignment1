package Assignment1;
import java.util.*;
public class Q1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		int count = 0;
		for(int i=2;i<Math.sqrt(n);i++) {
			if((n%i)==0)
				count+=1;
		}
		if(count>0) {
			System.out.println("Its not prime");
		}
		else {
			System.out.println("Its prime");
		}
	}

}

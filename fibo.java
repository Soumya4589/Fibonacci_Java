import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// To Execute Fibonacci Series.
		int num;
		int a=0,b=1,c;
		System.out.println("Enter no of terms in Fibonacci series:");
		Scanner s= new Scanner(System.in);
		num = s.nextInt();
		System.out.print(a+" "+b);
		for (int i=2;i<num;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;                    //Swapping the values for next iteration.
		}

	}

}

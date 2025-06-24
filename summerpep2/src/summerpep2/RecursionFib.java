package summerpep2;
import java.util.Scanner;
public class RecursionFib {
	public static int Fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return Fib(n-1)+Fib(n-2);
		}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int result=Fib(n);
	System.out.println(result);
	
}
}

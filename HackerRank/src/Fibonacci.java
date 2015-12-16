public class Fibonacci {
	public static void main(String args[]){
		int n=12;
		//int p=fib(12);
		for(int i=1;i<=n;i++){
			System.out.println(fib(i));
		}
		//System.out.println(p);
	}
	public static int fib(int n){
		if (n < 2) {
            return n;
         }
         else {
	   return fib(n-1)+fib(n-2);
         }
	}
}

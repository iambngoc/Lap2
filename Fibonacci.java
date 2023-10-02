package Lab2;

public class Fibonacci {
	public static int getFibonacci(int n) {
        if (n==1) return 0;
        if (n==2) return 1;
        return getFibonacci(n - 2) + getFibonacci(n - 1);
    }

	public static void printFibonacci(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(getFibonacci(i)+ " ");
		}
	}

	public static void main(String[] args) {
		System.out.println(getFibonacci(10));
		printFibonacci(10);
	}
}

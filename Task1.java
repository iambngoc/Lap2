package Lab2;

public class Task1 {
public static int getSn1(int n) {
	if(n==1) return 1;
	return (int) (getSn1(n-1) + Math.pow(-1, n+1)*n);
}
public static int giaithua(int n) {
	if(n==1) return 1;
	return giaithua(n-1) * n;
}
	public static double nhanSn4(int n) {
		if(n==1) return 2;
		return nhanSn4(n-1) * n * 2;
}

public static int getSn2(int n) {
	if(n==1) return 1;
	
	return n*giaithua(n-1) + getSn2(n - 1);
}

public static int getSn3(int n) {
	if(n==1) return 1;
	return getSn3(n-1)+ n*n;
}
public static double getSn4(int n) {
	if(n==0) return 1;
	return getSn4(n-1)+1/nhanSn4(n);
}
public static void main(String[] args) {
	System.out.println(getSn1(10));
	System.out.println(getSn2(2));
	System.out.println(getSn3(3));
	System.out.println(getSn4(1));
	System.out.println(nhanSn4(3));
	
}
}

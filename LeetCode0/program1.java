import java.util.*;
class reverseDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		reversefun(n);
	}
	public static void reversefun(int n){
		int rem=0;
		while(n>0){
			rem=n%10;
			n=n/10;
			System.out.print(rem);
		}
	}
}

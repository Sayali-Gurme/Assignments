import java.util.*;
class SumDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		int target=sc.nextInt();
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				if(arr[i]+arr[j]==target){
					System.out.println("["+i+","+j+"]");
					break;
				}
			}
		}
	}
}

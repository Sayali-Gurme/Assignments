import java.util.*;
class SearchDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int left=0;
		int right=arr.length - 1;
		while(left<=right){
			int mid= left+(right-left)/2;
			if(arr[mid]==target){
				//System.out.println(mid);
				break;
			}else if(arr[mid]<target){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		System.out.println(left);
	}
}

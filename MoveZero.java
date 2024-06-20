package dsa_practice;

public class MoveZero {
	public static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void moveZeros(int[] arr, int n) {
		int j=0; //focus on zeros elements
		for(int i=0;i<arr.length;i++) { //focus on non-zero element	
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j]; //swap
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,9,0,1,0,8,0,4,3};
		printArray(nums);
		System.out.println("-----------");
		System.out.println("after modification");
		moveZeros(nums,nums.length);
		printArray(nums);

	}

}

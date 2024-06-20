package dsa_practice;

public class ReverseArray {
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	public static void reverse(int numbers[], int start, int end) {
		while(start<end) {
			int temp=numbers[start];
			numbers[start]=numbers[end];
			numbers[end]=temp;
			start++;
			end--;
		}
		
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,5,6,7,8};
		printArray(nums);
reverse(nums,0,nums.length-1);
printArray(nums);
	}

}

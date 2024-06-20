package dsa_practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,7,4,2,1,5,6};
		int size=nums.length;
		int temp=0;
		int minIndex=0;
		
		System.out.println("Before sorting");
		for(int num:nums) {
			System.out.print(num + " ");
		}
		
		for(int i=0;i<size-1;i++) {
			minIndex=i;

			for(int j=i+1;j<size;j++) {
				if(nums[minIndex]>nums[j]) {
					temp=nums[minIndex];
					nums[minIndex]=nums[j];
					nums[j]=temp;					
				}
			}
			System.out.println();
			System.out.println("sorting in-progress");
			for(int num:nums) {
				System.out.print(num + " ");
			}
			
		}
		System.out.println();
		System.out.println("After sorting");
		for(int num:nums) {
			System.out.print(num + " ");
		}

	}

}

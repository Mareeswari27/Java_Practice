package dsa_practice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,9,6,4,8,1,13,2};
		int size=nums.length;
		int temp=0;
		
		System.out.println("Before sorting");
		for(int num:nums) {
			System.out.print(num +" ");
		}
		System.out.println();
		
		for(int i=0;i<size;i++) {
			for (int j=0;j<size-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
			for(int num:nums) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		System.out.println("after sorting");
		for(int num:nums) {
			System.out.print(num + " ");
		}
 
	}

}

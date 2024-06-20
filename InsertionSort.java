package dsa_practice;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,8,9,5,3,1};
		int size=nums.length;
		int key=0;
		
		for(int i=1;i<size;i++) {
			key=nums[i];
			int j=i-1;
			
			while(j>=0 && nums[j] > key) {
				nums[j+1]=nums[j];
				j=j-1;
			}
			nums[j+1] =key;
		}
		
		for(int num:nums) {
			System.out.print(num + " ");

		}


	}

}

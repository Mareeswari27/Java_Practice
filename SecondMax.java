package dsa_practice;

public class SecondMax {
	public static int findSecondMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			if (arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]==max) {
				secondMax=arr[i];
			}
		
		}
		return secondMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,7,33,33,44,30,31};
System.out.print(findSecondMax(nums));
	}

}

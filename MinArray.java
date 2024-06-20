package dsa_practice;

public class MinArray {
public static int findmin(int[] arr) {
	if(arr==null || arr.length==0) {
		try {
			throw new Exception("Invalid Input");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i] < min) {
			min=arr[i];
		}	
	}
	return min;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,6,7,9,4,3};
		System.out.print(findmin(nums));
		
		

}
}

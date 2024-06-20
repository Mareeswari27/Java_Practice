package dsa_practice;

public class ResizeArray {
	public void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public int[] resize(int[]arr, int capacity) {
		int[]temp=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeArray obj=new ResizeArray();
		int[] original= {5,8,9,1,2,4};
		obj.printArray(original);
		System.out.println("the size of an original array" + original.length);
		
		original=obj.resize(original, 10);
		System.out.println("The size of an array after original" +original.length);
		obj.printArray(original);

	}

}

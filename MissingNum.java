package dsa_practice;

public class MissingNum {
	public int findmissingNum(int[] arr) {
		int n=arr.length +1;
		int sum=n*(n+1)/2;
		for(int var:arr) {
			sum=sum-var;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MissingNum obj=new MissingNum();
int[] arr= {1,2,6,3,8,9,4,7};
int missingNum=obj.findmissingNum(arr);
System.out.println("The missing number is " + missingNum);
	}

}

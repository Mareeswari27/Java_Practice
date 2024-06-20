package dsa_practice;

public class TimeComplexityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double now=System.currentTimeMillis();
 TimeComplexityDemo demo=new TimeComplexityDemo();
 System.out.println(demo.findsum(99999));
 System.out.println("Time taken " +(System.currentTimeMillis()-now) +" milliseconds");
	}
	public int findsum(int n) {
		//return n*(n+1)/2;
		int sum=0;
		for (int i=0;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}

}

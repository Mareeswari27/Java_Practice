package dsa_practice;

public class PalindromeOrNot {
	public boolean palindrom(String word) {
		char[] charArray=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		while(start<end) {
			if(charArray[start] != charArray[end]) {
			return false;
			}
			start++;
			end--;
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeOrNot obj=new PalindromeOrNot();
		//System.out.println(obj.palindrom("dad"));
		if(obj.palindrom("that")) {
			System.out.println("the string is palindrom");
		}
		else {
			System.out.println("the string is not palindrome");
		}

	}

}

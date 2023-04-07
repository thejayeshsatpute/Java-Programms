package java30codingproblems;

public class ReverseString {

	public static void main(String[] args) {
		
//		//using string concatenation operator
		String str="ABCD";
		String rev="";
//		
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
		
		//Logic 2nd By using char Array
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("Reversed string is : "+rev);
	}

}

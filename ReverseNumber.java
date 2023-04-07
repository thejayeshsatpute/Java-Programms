package java30codingproblems;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number =sc.nextInt();
		
//		//Using Algorithm
//		//int rev=0;
//		while(number!=0) {
//			rev=rev * 10 + number % 10;
//			number=number / 10;	
//		}
		
//		//using StringBuffer class
//		StringBuffer sb =new StringBuffer(String.valueOf(number));
//		StringBuffer rev =sb.reverse();
		
		StringBuilder sb=new StringBuilder();
		sb.append(number);
		StringBuilder rev=sb.reverse();
		
		System.out.println("Reverse number is: "+ rev);
	}

}

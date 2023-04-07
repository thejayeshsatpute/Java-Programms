package java30codingproblems;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swapping "+a+" "+b);
		
		//logic 1 using third variable
//		int c=a;
//		a=b;
//		b=c;
		
		//Logic 2-- using +& -
//		a=a+b; 		 // 30
//		b=a-b;		 //10
//		a=a-b;		 //20
		
		//Logic 3 using * and /
		a=a*b;		//200
		b=a/b;		//10
		a=a/b;		//20
		
		//Logic 4 using bitwise operator
		a=a^b;
		b=a^b;
		a=a^b;
		
			
		
		
		System.out.println("after swapping "+a+" "+b);
		
		
		

	}

}

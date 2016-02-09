import java.util.Scanner;

public class Phuree {


public static void main (String[]args){
	Scanner scan = new Scanner (System.in);
	int a,a2,a3,a4,a5,a6,a7,a8,a9,sum;
	
	System.out.println("Enter 9 Number of Dwarves 1-99 : ");
	a = scan.nextInt();
	a2 = scan.nextInt();
	a3 = scan.nextInt();
	a4 = scan.nextInt();
	a5 = scan.nextInt();
	a6 = scan.nextInt();
	a7 = scan.nextInt();
	a8 = scan.nextInt();
	a9 = scan.nextInt();
	

	if (100 == a+a2+a3+a4+a5+a6+a7)
	System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7);
	
	else if (100 == a8+a2+a3+a4+a5+a6+a7+a8)
		System.out.println(a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a8);
	else if (100 == a9+a2+a3+a4+a5+a6+a7)
		System.out.println(a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a9);
	
	else if (100 == a+a8+a3+a4+a5+a6+a7)
		System.out.println(a+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a8);
	else if (100 == a+a9+a3+a4+a5+a6+a7)
		System.out.println(a+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a9);
	
	else if (100 == a+a2+a8+a4+a5+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a8);
	else if (100 == a+a2+a9+a4+a5+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a9);
	
	else if (100 == a+a2+a3+a8+a5+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a8);
	else if (100 == a+a2+a3+a9+a5+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a9);

	else if (100 == a+a2+a3+a4+a8+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a6+"\n"+a7+"\n"+a8);
	else if (100 == a+a2+a3+a4+a9+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a6+"\n"+a7+"\n"+a9);
	
	else if (100 == a+a2+a3+a4+a5+a8+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a7+"\n"+a8);
	else if (100 == a+a2+a3+a4+a5+a9+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a7+"\n"+a9);
	
	else if (100 == a+a2+a3+a4+a5+a6+a8)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a8);
	else if (100 == a+a2+a3+a4+a5+a6+a9)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a9);
	
	else if (100 == a8+a9+a3+a4+a5+a6+a7)
		System.out.println(a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a8+"\n"+a9);
	
	else if (100 == a+a8+a9+a4+a5+a6+a7)
		System.out.println(a+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a8+"\n"+a9);
	
	else if (100 == a+a2+a8+a9+a5+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a5+"\n"+a6+"\n"+a7+"\n"+a8+"\n"+a9);
	
	else if (100 == a+a2+a3+a8+a9+a6+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a6+"\n"+a7+"\n"+a8+"\n"+a9);
	
	else if (100 == a+a2+a3+a4+a8+a9+a7)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a7+"\n"+a8+"\n"+a9);
	
	else if (100 == a+a2+a3+a4+a5+a8+a9)
		System.out.println(a+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a8+"\n"+a9);

	else if (100 == a9+a2+a3+a4+a5+a6+a8)
		System.out.println(a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6+"\n"+a8+"\n"+a9);
	else System.out.println("Number > 100 or Number < 100" );
}
}
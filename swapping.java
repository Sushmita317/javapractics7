import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		
			
		 
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("Enter the a value");
			a= sc.nextInt();
			System.out.println("Enter the b value");
			b=sc.nextInt();
			a = a+b;
			b=a-b;
			a=a-b;
			
		System.out.println("a= " + a);
		System.out.println("b= "+ b);
		}

		}
	



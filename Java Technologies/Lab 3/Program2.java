import java.util.*;
class Program2{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		try{
			int c = a/b;
			System.out.println("Output of " + a + "/" + b + " = " + c);
		}catch(ArithmeticException e){
			System.out.println("Error because " + e.getMessage());
		}
		
	}
}
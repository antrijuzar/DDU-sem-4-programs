import java.lang.*;
import java.util.Scanner;
class Program2{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		System.out.println("Sum is : " + (num1 + num2));
	}
}
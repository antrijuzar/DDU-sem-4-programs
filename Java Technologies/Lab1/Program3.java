import java.lang.*;
import java.util.Scanner;

class Program3{
static void findFibo(int n){
	System.out.print("0 1 ");
	int prevl = 0;
	int prevr = 1;
	int temp;
	for(int i = 0; i < n - 2; i++){
		temp = prevl + prevr;
		prevl = prevr;
		prevr = temp;
		System.out.print(prevr + " ");
	}
}
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter fibonacci number");
		int num = obj.nextInt();
		findFibo(num);
		//System.out.println("Sum is : " + (num1 + num2));
	}
}
import java.util.*;
class Program4{
	public static void main(String arge[]){
		int a = 0,b = 0;
		int c = 0;
		try{
			//CASE 1
			//a = 25;
			//b = 5;
			//CASE 2
			//a = 25;
			//b = 0;
			//CASE 3
			a = 25;
			b = 0;
			c = a/b;
		}catch(ArithmeticException e){
			System.out.println("Error because : " + e.getMessage());
		}catch(NullPointerException e){
			System.out.println("Error because : " + e.getMessage());
		}finally{
			System.out.println("Output of " + a + "/" + b + " = " + c);
		}
	}
}
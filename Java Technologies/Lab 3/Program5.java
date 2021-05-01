import java.util.*;
class RangeException extends Exception{
	RangeException(String s){
		super(s);
	}
}
class Program5{
	static double add(String a[]){
		double sum = 0;
		try{
			double n1 = Double.valueOf(a[0]);
			double n2 = Double.valueOf(a[1]);
			if(n1 == 0 || n2 == 0){
				throw new RangeException("Number cannot be 0");
			}
			sum = n1 + n2;
		}catch(NumberFormatException e){
			System.out.println("Error in NumberFormatException " + e.getMessage());
		}catch(Exception e){
			System.out.println("Error in CustomException " + e.getMessage());
		}finally{
			System.out.println("Thanks user to use dumb system you output is");
			return sum;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s[] = new String[5];
		System.out.println("Enter two numbers");
		s[0] = sc.nextLine();;
		s[1] = sc.nextLine();
		System.out.println("Sum is = " + add(s));
	}
}
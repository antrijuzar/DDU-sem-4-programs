import java.util.*;
import java.lang.*;
class Calculator<T extends Number>{
	T[] numbers;
	Calculator(T[] o) {
		numbers = o;
	}
	int addition(){
		int sum = 0;
		sum = numbers[0].intValue() + numbers[1].intValue();
		return sum;
	}
	int subtraction(){
		int sum = 0;
		sum = numbers[0].intValue() - numbers[1].intValue();
		return sum;
	}
	int multiplication(){
		int sum = 0;
		sum = numbers[0].intValue() * numbers[1].intValue();
		return sum;
	}
	double division(){
		double sum = 0;
		sum = numbers[0].doubleValue() / numbers[1].doubleValue();
		return sum;
	}
}
public class TestClass {
	public static void main(String args[]) {
		Integer add[] = {2,3};
		Calculator<Integer> o1 = new Calculator<Integer>(add);
		
		Integer sub[] = {10,5};
		Calculator<Integer> o2 = new Calculator<Integer>(sub);
		
		Integer mul[] = {3,5};
		Calculator<Integer> o3 = new Calculator<Integer>(mul);
		
		Integer div[] = {17,5};
		Calculator<Integer> o4 = new Calculator<Integer>(div);
		
		System.out.println("Addition of 2 and 3");
		System.out.println(o1.addition());
		System.out.println("Subtraction of 10 and 5");
		System.out.println(o2.subtraction());
		System.out.println("Multiplication of 3 and 5");
		System.out.println(o3.multiplication());
		System.out.println("Division of 17 and 5");
		System.out.println(o4.division());
	}

	
}

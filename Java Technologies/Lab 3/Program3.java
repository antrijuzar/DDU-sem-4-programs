import java.util.*;
class Program3{
	public static void main(String arg[]){
		int a[] = new int[5];
		try{
			for(int i = 0; i < a.length; i++){
				a[i] = i+1;
				int c = a[i] / new Random().nextInt();
			}
			a[6] = 4;
		}catch(ArithmeticException e){
			System.out.println("Error because : " + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error in ArrayIndexOutOfBoundsException because : " + e.getMessage());
		}catch(IndexOutOfBoundsException e){
			System.out.println("Error in IndexOutOfBoundsException because : " + e.getMessage());
		}catch(Exception e){
			System.out.println("Error in Exception because : " + e.getMessage());
		}
	}
}
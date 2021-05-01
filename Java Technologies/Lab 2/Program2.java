import java.util.*;
class Program2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for(int j = 0; j < str.length() ; j++){
			if(str.charAt(j) == 'h' && str.charAt(j+1) == 'i'){
				count += 1;
			}
		}
		System.out.println("hi appeared " + count + " times");
	}
}
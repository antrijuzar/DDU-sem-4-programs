import java.util.*;
class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = str.length();
		for(int j = 0; j < str.length() ; j++){
			if(str.charAt(j) == str.charAt(count - 1)){
				count--;
			}else{
				System.out.println(str + " is not a Palindrome string");
				System.exit(0);
			}
		}
		System.out.println(str + " is a Palindrome string");
	}
}
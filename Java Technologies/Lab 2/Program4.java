import java.util.*;
class Program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String temp = "";
		for(int i = str.length() - 1; i >= 0 ; i--){
			if(str.charAt(i) != ' '){
				temp += str.charAt(i);
			}else{
				for(int j = temp.length() - 1; j >= 0; j--){
					System.out.print(temp.charAt(j));
				}
				System.out.print(" ");
				temp = "";
			}
		}
		for(int j = temp.length() - 1; j >= 0; j--){
					System.out.print(temp.charAt(j));
		}
	}
}
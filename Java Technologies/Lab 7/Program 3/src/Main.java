import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory path");
		String path = sc.nextLine();
		File file = new File(path);
		// Check for valid directory
		if(file.isDirectory()) {
			System.out.println("Yes the input is valid directory");
			System.out.println("The file and directories it contains are:");
			String list[];
			for(String l : file.list()) {
				System.out.println(l);
			}
		}else {
			System.out.println("Please enter vaild input the path is not a valid directory");
		}

	}
}

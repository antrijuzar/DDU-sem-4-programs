import java.lang.*;
import java.util.Scanner;
class Program5{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = obj.nextLine();
		System.out.println("Enter Roll No.");
		int roll = obj.nextInt();
		System.out.println("Enter Marks of Math of 100 : ");
		int m1 = obj.nextInt();
		System.out.println("Enter Marks of FMA of 100 : ");
		int m2 = obj.nextInt();
		System.out.println("Enter Marks of DSA of 100 : ");
		int m3 = obj.nextInt();
		System.out.println("Enter Marks of OOPC++ of 100 : ");
		int m4 = obj.nextInt();
		System.out.println("Enter Marks of DBMS of 100 : ");
		int m5 = obj.nextInt();
		System.out.println("Name is : " + name);
		System.out.println("Roll no. : " + roll);
		int avg = (m1+m2+m3+m4+m5)/5;
		System.out.println("Average : " + avg);
		if(avg > 80){
			System.out.println("A Grade ");
		}else if(avg < 80 && avg > 60){
			System.out.println("B Grade ");
		}else if(avg < 60 && avg > 40){
			System.out.println("c Grade ");
		}else if(avg < 40 && avg > 20){
			System.out.println("D Grade ");
		}else{
			System.out.println("Fail");
		}
	} 
}
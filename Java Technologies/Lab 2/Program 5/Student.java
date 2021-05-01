import java.util.*;
class Student{
	int roll_no;
	String name;
	double sum;
	int mark_of_five_sub[] = new int[5];
	Student(){
		this.roll_no = 0;
		this.name = "";
		sum = 0;
		for(int i = 0; i < 5; i++){
			this.mark_of_five_sub[i] = 0; 
		}		
	}
	Student(int roll_no,String name,int[] mark_of_five_sub){
		this.roll_no = roll_no;
		this.name = name;
		sum = 0;
		for(int i = 0; i < 5; i++){
			this.mark_of_five_sub[i] = mark_of_five_sub[i]; 
		}
	}
	
	double findAverage(){
		for(int i = 0; i < 5; i++){
			sum += mark_of_five_sub[i]; 
		}
		return sum/5;
	}
	
	void display(){
		System.out.println("Roll no : " + roll_no);
		System.out.println("Name : " + name);
		for(int i = 0; i < 5; i++){
			System.out.println("Marks of subject" + i + " : "  + mark_of_five_sub[i]);
		}
	}
}
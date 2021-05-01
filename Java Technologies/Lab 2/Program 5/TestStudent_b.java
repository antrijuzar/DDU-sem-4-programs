import java.util.*;
class TestStudent_b{
	static void generateMarks(int []arr){
		Random r = new Random();
		for(int i = 0; i < 5; i++){
			arr[i] = r.nextInt(100); 
		}
	}
	public static void main(String args[]){
		int arr[] = new int[5];
		double avg1,avg2,avg3;
		String names[] = {"Yash","Dharmik","Niraj"};
		Student studs[] = new Student[3];
		for(int i = 0; i < 3;i++){
			generateMarks(arr);
			studs[i] = new Student(i+1,names[i],arr);
		}
		avg1 = studs[0].findAverage();
		avg2 = studs[1].findAverage();
		avg3 = studs[2].findAverage();
		if(avg1 > avg2 && avg1 > avg3){
			System.out.println("Ther highest average of student is " + avg1);
			studs[0].display();
		}else if(avg2 > avg1 && avg2 > avg3){
			System.out.println("Ther highest average of student is " + avg2);
			studs[1].display();
		}else{
			System.out.println("Ther highest average of student is " + avg3);
			studs[2].display();
		}
	}
}
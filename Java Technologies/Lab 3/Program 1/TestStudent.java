import java.util.*;
class TestStudent{
	static void generateMarks(double []arr){
		Random r = new Random();
		for(int i = 0; i < 5; i++){
			arr[i] = r.nextInt(100); 
		}
	}
	public static void main(String args[]){
		Student studs[] = new Student[3];
		double arr[] = new double[5];
		double avg1,avg2,avg3;
		String names[] = {"Juzar","Dharmik","Niraj"};
		for(int i = 0; i < 3;i++){
			generateMarks(arr);
			studs[i] = new Student(i+1,names[i],17+i,arr);
		}
		avg1 = studs[0].findAverage();
		avg2 = studs[1].findAverage();
		avg3 = studs[2].findAverage();
		if(avg1 > avg2 && avg1 > avg3){
			studs[0].displayDetails();
		}else if(avg2 > avg1 && avg2 > avg3){
			studs[1].displayDetails();
		}else{
			studs[2].displayDetails();
		}
		
		Student newStud = new Student(4,"late",18,arr);
		System.out.println("Total no. of student after adding one is : " + Student.getCount());
	}	
}
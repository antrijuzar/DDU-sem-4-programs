import java.util.*;
class TestStudent_a{
	public static void main(String args[]){
		int arr[] = new int[5];
		Random r = new Random();
		for(int i = 0; i < 5; i++){
			arr[i] = r.nextInt(100); 
		}
		Student s1 = new Student(1,"Yash",arr);
		s1.display();
	}
}
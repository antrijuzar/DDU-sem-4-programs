import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
public class MyClass {

	public static void main(String[] args) {
		Student s[] = {
				new Student(1,"Juzar",18),
				new Student(2,"Dharmik",18),
				new Student(3,"Niraj",18),
				new Student(4,"Tushar",18),
				new Student(5,"Bhargav",18)
				};
		LinkedList<Student> se = new LinkedList<>();
		for(Student s1 : s) {
			se.add(s1);
		}
		Collections.sort(se);
		for(Student s1 : se) {
			System.out.println(s1.getRollNo() + " " + s1.getName() + " " + s1.getAge());
		}
	}

}
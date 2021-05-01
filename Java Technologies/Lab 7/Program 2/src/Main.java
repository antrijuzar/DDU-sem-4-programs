import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

// Person class 
class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person arg0) {
		if(getAge() > arg0.getAge()) {
			return 1;
		}else if(getAge() == arg0.getAge()) {
			return 0;
		}else {
			return -1;
		}
		
	}
	
		
}
public class Main{

	public static void main(String[] args) {
		// defining map 
		Map<Person, String> m = new HashMap();
		// array of hobby
		String hobby[] = {"Singing","Sketching","Reading"};
		Random r = new Random();
		Person p[] = {
				new Person("Juzar",14),
				new Person("Dharmik",18),
				new Person("Niraj",21),
				new Person("Tushar",15),
				new Person("Bhargav",19)
				};
		// Sort in linked list to sort
		LinkedList<Person> se = new LinkedList<>();
		for(Person s1 : p) {
			se.add(s1);
		}
		// Sorting
		Collections.sort(se);
		// initialize map
		for(Person p1 : se) {
			m.put(p1, hobby[r.nextInt(hobby.length)]);
		}
		// Output based on Sorted age of persons
		Set<String> uniqueHobbies = new HashSet<>();
		for(int i = 0; i < m.size(); i++) {
			System.out.println("Name: "+se.get(i).getName()+" :Age "+se.get(i).getAge()+" "+m.get(se.get(i)));
			uniqueHobbies.add(m.get(se.get(i)));
		}
		//Unique hobbies
		System.out.println("Unique hobbies according to the stored values in map collection object:");
		System.out.println(uniqueHobbies);
	}

}

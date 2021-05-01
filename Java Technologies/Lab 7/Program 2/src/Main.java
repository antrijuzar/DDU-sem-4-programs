import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
		Map<Person, String> m = new HashMap();
		
		m.put(new Person("Juzar",18), "Singing");
		m.put(new Person("Niraj",16), "Dancing");
		m.put(new Person("Dharmik",28), "Running");
		Collections.sort(m, Comparator.comparing(Person::getName).thenComparingInt(Person::getAge));
		Map<Person,String> tm = new TreeMap<>(m);	
		//System.out.println();
		printMap(tm);

	}
	public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                + " Value : " + entry.getValue());
        }
    }

}

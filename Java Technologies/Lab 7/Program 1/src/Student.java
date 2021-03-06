public class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int age;
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public int compareTo(Student arg0) {
		int t2 = (int)arg0.getName().charAt(0);
		int t1 = (int)this.getName().charAt(0);
		if(t1 > t2){
			return 1;
		}else if(t1 == t2) {
			return 0;
		}else {
			return -1;
		}
	}
}
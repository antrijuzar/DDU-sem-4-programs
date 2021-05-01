class Person{
	String name;
	int age;
	Person(){
		name = "";
		age = 0;
	}
	Person(String name,int age){
		
	}
	String getName(){
		return this.name;
	}
	int getAge(){
		return this.age;
	}
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		this.age = age;
	}
	
	public String toString(){
		return getName();
	}
}
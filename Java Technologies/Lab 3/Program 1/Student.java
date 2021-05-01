class Student extends Person{
	int rollno;
	static int count;
	int sum;
	double marks[];
	static{
		count = 0;
	}
	Student(){
		sum = 0;
		count++;
	}
	Student(int rollno){
		this.rollno = rollno;
		count++;
		sum = 0;
	}
	Student(int rollno,double[] marks){
		this.rollno = rollno;
		for(int i = 0; i < marks.length; i++){
			this.marks[i] = marks[i];
		}
		count++;
		sum = 0;
	}
	Student(int rollno,String name,int age,double[] marks){
		super.setName(name);
		super.setAge(age);
		this.rollno = rollno;
		this.marks = new double[5];
		for(int i = 0; i < marks.length; i++){
			this.marks[i] = marks[i];
		}
		count++;
		sum = 0;
	}
	int getRollno(){
		return this.rollno;
	}
	double[] getMarks(){
		return this.marks;
	}
	void setRollno(int rollno){
		this.rollno = rollno;
	}
	void setMarks(double[] marks){
		for(int i = 0; i < marks.length; i++){
			this.marks[i] = marks[i];
		}
	}
	
	public String toString(){
		return getName();
	}
	
	void displayDetails(){
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Roll no :" + rollno);
		System.out.print("Marks =  ");
		for(int i = 0; i < marks.length; i++){
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}
	
	static int getCount(){
		return count;
	}
	
	
	double findAverage(){
		for(int i = 0; i < 5; i++){
			sum += marks[i]; 
		}
		return sum/5;
	}
}
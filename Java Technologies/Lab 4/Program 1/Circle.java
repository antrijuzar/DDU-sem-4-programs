class Circle extends Shape{
	double radius;
	Circle(){};
	Circle(double radius){
		this.radius = radius;
	}
	void setRadius(double radius){
		this.radius = radius;
	} 
	double getRadius(){
		return radius;
	}
	void findArea(){
		area = 3.14 * radius * radius;
	}
	public String toString(){
		return "Circus of radius " + radius + " units is " + area;
	}
}
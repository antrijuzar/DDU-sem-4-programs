class Rectangle extends Shape{
	double length,breadth;
	Rectangle(){};
	/* Rectangle(double length){
		this.length = length;
	} */
	Rectangle(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void setLength(double length){
		this.length = length;
	} 
	void setBreadth(double breadth){
		this.breadth = breadth;
	} 
	double getLength(){
		return length;
	}
	double getBreadth(){
		return breadth;
	}
	void findArea(){
		area = length * breadth;
	}
	public String toString(){
		return "Circus of length " + length + " units and breadth " + breadth + " units is " + area;
	}
}
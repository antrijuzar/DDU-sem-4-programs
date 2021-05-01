class Square extends Rectangle{
	Square(){}
	Square(double length){
		super(length,length);
	}
	public String toString(){
		return "Circus of length " + length + " units is " + length*length;
	}
}
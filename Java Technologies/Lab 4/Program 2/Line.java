class Line implements RelationInterface{
	double x1;
	double x2;
	double y1;
	double y2;
	Line(double v1,double v2,double v3,double v4){
		x1 = v1;
		x2 = v2;
		y1 = v3;
		y2 = v4;
	}
	double getLength(){
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	public boolean isGreater(Line l){
		if(this.getLength() > l.getLength()){
			System.out.print(String.format("%.2f", this.getLength()));
			System.out.print(" > ");
			System.out.println(String.format("%.2f", l.getLength()));
			return true;
		}else{
			return false;
		}
	}
	public boolean isEqual(Line l){
		if(this.getLength() == l.getLength()){
			System.out.print(String.format("%.2f", this.getLength()));
			System.out.print(" = ");
			System.out.println(String.format("%.2f", l.getLength()));
			return true;
		}else{
			return false;
		}
	}
	public boolean isLess(Line l){
		if(this.getLength() < l.getLength()){
			System.out.print(String.format("%.2f", this.getLength()));
			System.out.print(" < ");
			System.out.println(String.format("%.2f", l.getLength()));
			return true;
		}else{
			return false;
		}
	}
}
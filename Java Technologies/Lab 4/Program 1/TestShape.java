class TestShape{
	public static void main(String args[]){
		/// Using normal way ///
		System.out.println("Using normal way");
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(5,6);
		Square s = new Square(7);
		c.findArea();
		r.findArea();
		System.out.println(c.toString());
		System.out.println(r.toString());
		System.out.println(s.toString());
		
		/// Using dynamic method dispatch ///
		Shape circle = new Circle(5);
		Shape rect = new Rectangle(5,6);
		Shape square = new Square(7);
		
		System.out.println("");
		System.out.println("Using dynamic method dispatch");
		circle.findArea();
		rect.findArea();
		System.out.println(circle.toString());
		System.out.println(rect.toString());
		System.out.println(square.toString());
		
		System.out.println("");
		shapeInfo(circle);
		shapeInfo(rect);
		shapeInfo(square);
	}
	static void shapeInfo(Shape x){
		if(x instanceof Square){
			System.out.println("The length of Square is " + ((Square)x).getLength());
		}else if(x instanceof Circle){
			System.out.println("The radius of circle is " + ((Circle)x).getRadius());
		}else if(x instanceof Rectangle){
			System.out.println("The length of Rectangle is " + ((Rectangle)x).getLength() + " and breadth is " + ((Rectangle)x).getBreadth());
		}
	}
}
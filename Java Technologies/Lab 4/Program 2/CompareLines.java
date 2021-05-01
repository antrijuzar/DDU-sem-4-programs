class CompareLines{
	public static void main(String args[]){
			Line l1 = new Line(2,5,7,6);
			Line l2 = new Line(7,1,3,12);
			if(l1.isGreater(l2)){
				System.out.println("l1 is greater than l2");
			}
			if(l1.isLess(l2)){
				System.out.println("l1 is less than l2");
			}
			if(l1.isEqual(l2)){
				System.out.println("l1 is equal than l2");
			}
			
	}
}
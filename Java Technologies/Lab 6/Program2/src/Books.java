public class Books implements Comparable<Books>{
	int price;
	String name;
	String author;
	public Books(String name,String author,int price) {
		this.author = author;
		this.price = price;
		this.name = name;
	}
	public String toString() {
		return "Book name: " + name + "\nAuthor name: " + author
				+ "\nPrice: " + price;
		
	}
	@Override
	public int compareTo(Books arg0) {
		if(price == arg0.price) {
			return 0;
		}else if(price > arg0.price) {
			return 1;
		}else
			return -1;
	}
}

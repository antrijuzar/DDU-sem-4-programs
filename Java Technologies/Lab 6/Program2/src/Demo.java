
public class Demo {

	public static void main(String[] args) {
		Books obj[] = {new Books("Adventures of Tom Sawyer","Mark Twain",500),
					   new Books("Agni Veena","Kazi Nasrul Islam",700),
					   new Books("Animal Farm","George Orwell",300)};
		MyClass<Books> mc = new MyClass<Books>(obj);
		System.out.println("Maximum Price Book is : \n" + mc.findMax());
		System.out.println("Minimum Price Book is : \n" + mc.findMin());

	}

}

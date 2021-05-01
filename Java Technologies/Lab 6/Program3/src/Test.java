public class Test {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.enQueue(2);
		q.enQueue(1);
		q.enQueue(21);
		q.deQueue();
		q.enQueue(7);
		q.deQueue();
		q.display();
	}

}

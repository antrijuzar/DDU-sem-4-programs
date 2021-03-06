public class Queue<T>{
	T[] array;
	Integer rear = - 1, front = -1;
	Queue(){
		array = (T[])new Object[20];
	}
	static int count = 0; 
	void enQueue(T x) {
		if(rear != 19) {
			if(front == -1) {
				front++;
			}
			rear++;
			array[rear] =  x;
		}else{
			System.out.println("Queue is full");
		}
	}
	void deQueue() {
		if(front == -1) {
			System.out.println("Queue is empty");
		}else {
			if(front == rear) {
				front = -1;
				rear = -1;
			}else {
				front++;
			}
			
		}
	}
	void display() {
		System.out.println("Current set of elements in queue");
		for(int i = front; i <= rear; i++) {
			System.out.println(array[i]);
		}
	}
}

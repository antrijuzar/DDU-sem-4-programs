class Buffer{
	int buffer;
	boolean isBufferFilled = false;
	synchronized int consumeData(){
		while(!isBufferFilled){
			try{
				System.out.println("Producer has not yet generated the value ");
				wait();
			}catch(InterruptedException e){
				System.out.println("Error : " + e.getMessage());
			}
		}
		isBufferFilled = false;
		notify();
		System.out.println("Got value : " + this.buffer);
		return buffer;
	}
	
	synchronized void putData(int n){
		while(isBufferFilled){
			try{
				System.out.println("Consumer has not yet took the value ");
				wait();
			}catch(InterruptedException e){
				System.out.println("Error : " + e.getMessage());
			}
			
		}
		this.buffer = n;
		notify();
		isBufferFilled = true;
		System.out.println("Kept value : " + this.buffer);
	} 
}

class Producer implements Runnable{
	Buffer b;
	Producer(Buffer b){
		this.b = b;
		new Thread(this,"Producer").start();
	}
	public void run(){
		int i = 0;
		while(true){
			b.putData(++i);
		}
	}
}

class Consumer implements Runnable{
	Buffer b;
	Consumer(Buffer b){
		this.b = b;
		new Thread(this,"Consumer").start();
	}
	
	public void run(){
		while(true){
			b.consumeData();
		}
	}
}

class Program1{
	public static void main(String args[]){
		Buffer b = new Buffer();
		new Producer(b);
		new Consumer(b);
	}
}
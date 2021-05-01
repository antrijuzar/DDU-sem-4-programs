class NewThread implements Runnable{
	String name;
	Thread t;
	boolean suspendThread;
	NewThread(String threadname){
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New thread : " + t);
		suspendThread = false;
		t.start();
	}
	
	public void run(){
		try{
			for(int i = 1; i < 25; i++){
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized(this){
					while(suspendThread){
						wait();
					}
				}
			}
		}catch(InterruptedException e){
			System.out.println(name + ": interrupted");
		}
		System.out.println(name + ": exiting");
	}
	
	synchronized void myResume(){
		suspendThread = false;
		notify();
	}
	synchronized void mySuspend(){
		suspendThread = true;
	}
}

class Program3{
	public static void main(String args[]){
		NewThread o1 = new NewThread("One");
		NewThread o2 = new NewThread("Two");
		try{
			Thread.sleep(1000);
			o1.mySuspend();
			System.out.println("Suspending thread one");
			Thread.sleep(1000);
			o1.myResume();
			System.out.println("Resuming thread one");
			Thread.sleep(1000);
			o2.mySuspend();
			System.out.println("Suspending thread two");
			Thread.sleep(1000);
			o2.myResume();
			System.out.println("Suspending thread two");
		}catch(Exception e){
			System.out.println("Main thread interrupted");
		}
		
		try{
			System.out.println("Waiting for threads to finish");
			o1.t.join();
			o2.t.join();
		}catch(Exception e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
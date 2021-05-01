class Program2{
	public static void main(String args[]){
		final String Job1 = "Transmitting information";
		final String Job2 = "Printing";
		Thread t1 = new Thread(){
			public void run(){
				synchronized(Job1){
					System.out.println("Thread one is " + Job1);
					synchronized(Job2){
						System.out.println("Thread one is " + Job2);
					}
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				synchronized(Job2){
					System.out.println("Thread two is " + Job2);  
					synchronized(Job1){
						System.out.println("Thread two is " + Job1);
					}
				}
			}
		};
		t1.start();
		t2.start();
		System.out.println("Deadlock as both the job wait for each other to finish the task");
	}
}
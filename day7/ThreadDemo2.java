class ThreadDemo2{
	public static void main(String[] args){
		//create thread object
		MyThread t1 = new MyThread("Thread -- 1");
		MyThread t2 = new MyThread("Thread -- 2");
		
		//start of thread
		t1.start();
		t2.start();
		
	}
}

class MyThread extends Thread{
	
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(;;){
			System.out.println(name);
			//
			Thread.yield();
		}
	}
}
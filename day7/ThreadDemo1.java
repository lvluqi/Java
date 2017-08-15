class ThreadDemo1{
	public static void main(String[] args){
		/*
		MyThread t1 = new MyThread();
		YourThread t2 = new YourThread();
		t1.start();
		t2.start();
		*/
		MyThread t1 = new MyThread("Thread -- 1");
		MyThread t2 = new MyThread("Thread -- 2");
		
		t1.start();
		t2.start();
	}
}

class MyThread extends Thread{
	private String name;
	//This is GouZao function
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(;;){
			System.out.println(name);
			Thread.yield();
		}
	}
}

/*
class YourThread extends Thread{
	public void run(){
		for(;;){
			System.out.println("hello world! - 2");
		}
	}
}
*/
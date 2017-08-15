class ThreadDemo6{
	public static void main(String[] args){
		Object lock = new Object();
		Saler s1 = new Saler("S1",lock);
		Saler s2 = new Saler("S2",lock);
		
		s1.start();
		s2.start();
		
	}
}

class Saler extends Thread{
	private String name;
	static int tickets = 100;
	
	Object lock = new Object();
	
	public Saler(String name,Object lock){
		this.name = name ;
		this.lock = lock;
	}
	
	public void run(){
		while(true){
			int t = getTicket();
			if(t == -1){
				return ;
			}
			else{
				System.out.println(name + ": " + t);
				//Thread.yield();
			}
		}
	}
	public int getTicket(){
		synchronized(lock){
			int t = tickets;
			tickets = tickets - 1 ;
			return t < 1 ? -1 : t ;
		}
	}
}
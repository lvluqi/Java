class ThreadDemo3{
	public static void main(String[] args){
		//create Object
		Player p1 = new Player("Boy",1000);
		Player p2 = new Player("Tom",2000);
		Player p3 = new Player("Jey",2500);
		Player p4 = new Player("Lv",3000);
		
		//start of thread
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		//
		try{
			p1.join();
			p2.join();
			p3.join();
			p4.join();
		}
		catch(Exception e){
		}
		
		System.out.println("Over");
	}
}

class Player extends Thread{
	
	private String name;
	private int time;
	
	public Player(String name,int time){
		this.name = name;
		this.time = time;
	}
	public void run(){
		System.out.println(name + " start...");
		try{
			Thread.sleep(time);
		}
		catch(Exception e){
		}
		System.out.println(name + " get here time: " + time);	
	}
}
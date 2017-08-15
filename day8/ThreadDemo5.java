class ThreadDemo5{
	public static void main(String[] args){
		/*
		Saler s1 = new Saler("S1");
		Saler s2 = new Saler("S2");
		
		s1.start();
		s2.start();
		*/
		
		Person p1 = new Person("Boy",1000);
		Person p2 = new Person("Tom",1500);
		Person p3 = new Person("Biy",2000);
		Person p4 = new Person("bob",3000);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
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

class Person extends Thread{
	private String name;
	private int time;
	public Person(String name,int time){
		this.name = name;
		this.time = time;
	}
	public void run(){
		System.out.println(name +" start...");
		try{
			Thread.sleep(time);
		}
		catch(Exception e){
		}
		System.out.println(name + "get here:" + time);
		//System.out.println(new java.util.Date());
	}
}

/*
class Saler extends Thread{
	
	private String name;
	static int tickets = 100;
	static Object lock = new Object();
	
	public Saler(String name){
		this.name = name;
	}
	
	public void run(){
		while(true){
			int t = getTicket();
			if(t == -1){
				return ;
			}
			else{
				System.out.println(name + " :" + t);
			}
		}
	}
	
	public int getTicket(){
		synchronized(lock){
			int t = tickets;
			tickets = tickets - 1;
			return t < 1 ? -1 : t ;
		}
	}
}*/
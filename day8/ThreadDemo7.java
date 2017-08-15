class ThreadDemo7{
	public static void main(String[] args){
		TicketPool pool = new TicketPool();
		Saler s1 = new Saler("S1",pool);
		Saler s2 = new Saler("S2",pool);
		
		s1.start();
		s2.start();
		
	}
}

class Saler extends Thread{
	private String name;
	private TicketPool pool;
	
	public Saler(String name,TicketPool pool){
		this.pool = pool ;
		this.name = name ;
	}
	
	public void run(){
		while(true){
			int t = pool.getTicket();
			if(t == -1){
				return ;
			}
			else{
				System.out.println(name + ": " + t);
			}
		}
	}
}

//tickets pool

class TicketPool{
	private int tickets = 100;
	public synchronized int getTicket(){
		int temp = tickets;
		tickets = tickets - 1 ;
		return temp < 1 ? -1 : temp;
	}
}
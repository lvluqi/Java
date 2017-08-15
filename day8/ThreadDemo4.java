class ThreadDemo4{
	public static void main(String[] args){
		Box b1 = new Box("No1",5000);
		Box b2 = new Box("No2",7000);
		Waiter w1 = new Waiter();
		
		w1.setDaemon(true);
		
		b1.start();
		b2.start();
		w1.start();
	}
}

class Box extends Thread{
	private String nu;
	private int time;
	
	public Box(String nu,int time){
		this.nu = nu;
		this.time = time;
	}
	
	public void run(){
		System.out.println(nu + " start...");
		try{
			Thread.sleep(time);
		}
		catch(Exception e){
		}
		System.out.println(nu + "is over at:" + time);
	}
}

class Waiter extends Thread{
	public void run(){
		while(true){
			System.out.println(new java.util.Date());
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
			}
		}
	}
}
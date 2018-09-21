class BeeDemo{
	public static void main(String[] args){
		Box box = new Box();
		for(int i = 1;i <= 40;i ++){
			new Bee("Bee-" + i,box).start();
		}
		Bear be = new Bear("Bear",box);
		be.start();
	}
}

class Bee extends Thread{
	private String name;
	private Box box;
	public Bee(String name, Box box){
		this.name = name;
		this.box = box;
	}
	public void run(){
		box.add();
		System.out.println(name + "add : 1");
	}
}

class Bear extends Thread{
	private String name;
	private Box box;
	public Bear(String name, Box box){
		this.name = name;
		this.box = box;
	}
	public void run(){
		box.remove();
		System.out.println(name + "remove: 20");
	}
}

class Box{
	private int MAX = 20;
	private int count ;
	
	public synchronized void add(){
		while(count >= MAX){
			try{
				this.notify();
				this.wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		count ++ ;
	}
	public synchronized void remove(){
		while(count < MAX){
			try{
				this.wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		this.notify();
		count = 0;
	}
}
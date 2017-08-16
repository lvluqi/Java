class ThreadDemo8{
	public static void main(String[] args){
		//java.util.List<Integer> list = new java.util.ArrayList<Integer>();
		
		Pool pool = new Pool();
		Productor p1 = new Productor("S1",pool);
		Productor p2 = new Productor("S2",pool);
		Comsourm c1 = new Comsourm("c1",pool);
		
		p1.start();
		p2.start();
		c1.start();
	}
}

class Productor extends Thread{
	private String name;
	//private java.util.List<Integer> list;
	private Pool pool;
	static int i = 0 ;
	
	public Productor(String name,Pool pool){
		this.name = name;
		//this.list = list;
		this.pool = pool;
	}
	
	public void run(){
		while(true){
			pool.add(i ++);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("add: " + i + " ");
		}
	}
}

class Comsourm extends Thread{
	private String name;
	//private java.util.List<Integer> list;
	private Pool pool;
	public Comsourm(String name,Pool pool){
		this.name = name;
		//this.list = list;
		this.pool = pool;
	}
	
	public void run(){
		while(true){
			int i = pool.remove();
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("remove: " + i);
		}
	}
}

class Pool{
	//new ArrayList
	private java.util.List<Integer> list = new java.util.ArrayList<Integer>();
	
	//MAX of Pool
	private int MAX = 100;
	
	//add num
	public void add(int n){
		synchronized(this){
			try{
				System.out.println(list.size());
				while(list.size() >= MAX){
					this.wait();
				}
					list.add(n);
					this.notify();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	//delete num
	public int remove(){
		synchronized(this){
			try{
				while(list.size() == 0){
					this.wait();
				}
				int i = list.remove(0);
				this.notifyAll();
				return i ;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return -1;
	}
}
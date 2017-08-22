class WorkDemo2{
	public static void main(String[] args){
		Time t = new Time();
		Car c1 = new Car("c1");
		Car c2 = new Car("c2");
		ThreedCar t1 = new ThreedCar("t1",t);
		CowCar cow1 = new CowCar("cow1",t);
		CowCar cow2 = new CowCar("cow2",t);
		
		c1.start();
		c2.start();
		t1.start();
		cow1.start();
		cow2.start();
	}
}

//2
class Car extends Thread{
	private String name;
	private Time t;
	public Car(String name,Time t){
		this.name = name;
		this.t = t;
	}
	public synchronized void run(){
		System.out.println(name +" is start...");
		t.running();
	}
}

//1
class ThreedCar extends Thread{
	private Time t;
	private String name;
	public ThreedCar(String name,Time t){
		this.name = name;
		this.t = t;
	}
	public synchronized void run(){
		System.out.println(name +" is start...");
		t.running();
	}
}

//2
class CowCar extends Thread{
	private String name;
	private Time t;
	public CowCar(String name,Time t){
		this.name = name;
		this.t = t;
	}
	public synchronized void run(){
		System.out.println(name +" is start...");
		t.running();
	}
}

class Time{
	private int time = 0;
	public synchronized void running(int time){
		while(this.time < time){
			this.time = this.time + 1;
		}
		try{
			Thread.sleep(time*1000);
			System.out.println(" is throngth: " + time);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
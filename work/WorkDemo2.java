class WorkDemo2{
	public static void main(String[] args){
		Car c1 = new Car("c1");
		Car c2 = new Car("c2");
		ThreedCar t1 = new ThreedCar("t1");
		CowCar cow1 = new CowCar("cow1");
		CowCar cow2 = new CowCar("cow2");
		
		c1.start();
		c2.start();
		t1.start();
		cow1.start();
		cow2.start();
	}
}

//2
class Car extends Thread{
	private int time = 0;
	private String name;
	
	public Car(String name){
		this.name = name;
	}
	public synchronized void run(){
		System.out.println(name +" is start...");
		while(time < 3){
			time = time + 1;
		}
		try{
			Thread.sleep(3000);
			System.out.println(name + " is throngth: " + time);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

//1
class ThreedCar extends Thread{
	private int time = 0;
	private String name;
	public ThreedCar(String name){
		this.name = name;
	}
	public synchronized void run(){
		System.out.println(name +" is start...");
		while(time < 5){
			time = time + 1;
		}
		try{
			Thread.sleep(5000);
			System.out.println(name + " is throngth: " + time);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

//2
class CowCar extends Thread{
	private String name;
	private int time = 0;
	public CowCar(String name){
		this.name = name;
	}
	public synchronized void run(){
		System.out.println(name +" is start...");
		while(time < 10){
			time = time + 1;
		}
		try{
			Thread.sleep(10000);
			System.out.println(name + " is throngth: " + time);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
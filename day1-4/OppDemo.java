class OppDemo{
	public static void main(String[] args){
		//Dog d = new Dog();
		//System.out.println(d.age);
		
		Jing8 dd = new Jing8();
		System.out.println(dd.age);
	}
}

class Anmail{
	int age;
	String color;
	int weight;
	
	public void run(){
		System.out.println("run....");
	}
}

class Dog extends Anmail{

	public Dog(String color){
		this.color = color ;
	}
}

class Jing8 extends Dog{
	public Jing8(){
		super("white");
	}
}
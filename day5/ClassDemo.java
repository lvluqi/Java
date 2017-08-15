class ClassDemo{
	public static void main(String[] args){
		Jing8 d = new Jing8();
		System.out.println(d.name);
	}
}

class Anmail{
	String blood;
	
	public Anmail(){
		System.out.println("new Anmail()");
	}
	
	public String setBlood(String blood){
		this.blood = blood;
	}
	
	public void getBlood(){
		return blood;
	}
}

class Dog extends Anmail{
	int eye;
	String color;
	
	public Dog(String color){
		System.out.println("new Dog()");
	}
	public void getColor(){
		return color;
	}
	public String setColor(String color){
		this.color = color;
	}
}

class Jing8 extends Dog{
	String name;
	
	public Jing8(){
		System.out.println("new Jing8()");
	}
}
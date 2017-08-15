class Interface{
	public static void main(String[] args){
		Jing8 j = new Jing8();
		j.cry();
		RichMan rm = new RichMan();
		rm.feed(j);
	}
}

abstract class Animal{
	abstract public void cry();
}

class Dog extends Animal{
	public void cry(){
		System.out.println("wang wang ...");
	}
}

interface Pet{
	public void feed();
}

class Jing8 extends Dog implements Pet{
	public void feed(){
		System.out.println("My owener");
	}
}

class RichMan{
	public void feed(Pet p){
		System.out.println("Jing8 is good.");
		p.feed();
	}
}
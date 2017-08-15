class InterfaceDemo3{
	public static void main(String[] args){
		Jing8 d = new Jing8();
		RichMan rm = new RichMan();
		Eater e = new Eater();
		e.eat(d);
		rm.haha(d);
	}
}

abstract class Animal{
	abstract public void cry();
}

class Dog extends Animal{
	public void cry(){
		System.out.println("Dog cry ....");
	}
}

class Jing8 extends Dog implements Eatable,Pet{
	public void eat(){
		System.out.println("who is eat me.");
	}
	public void buy(){
		System.out.println("who is buy me.");
	}
}

interface Eatable{
	public void eat();
}
interface Pet{
	public void buy();
}

class Eater{
	public void eat(Eatable e){
		e.eat();
	}
}

class RichMan{
	public void buy(Pet p){
		p.buy();
	}
}
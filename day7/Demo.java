class Demo{
	public static void main(String[] args){
		/*
		Person p = new Person();
		p.white();
		p.rich();
		p.beautiful();
		*/
		Benz b = new Benz();
		System.out.println(b.getColor());
		b.setColor("blue");
		System.out.println(b.getColor());
	}
}

/*interface BFM{
	public void white();
	public void rich();
	public void beautiful();
}

class Person implements BFM{
	public void white(){
		System.out.println("white");
	}
	public void rich(){
		System.out.println("rich");
	}
	public void beautiful(){
		System.out.println("beautiful");
	}
}*/

class Car{
	private String color = "black";
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
}

class Benz extends Car{
	String color = "white";
	public String getColor(){
		return super.getColor();
	}
	public void setColor(String color){
		super.setColor(color);
	}
}
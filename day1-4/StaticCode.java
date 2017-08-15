class StaticCode{
	public static void main(String[] args){
		Car c = new Car();
		c.setColor("white");
		System.out.println(c.getColor());
	}
}

class Car{
	private String color = "black";
	private int tires = 4;
	public Car(){
		
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color ;
	}
	
}
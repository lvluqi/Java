class ClassDemo{
	public static void main(String[] args){
		//创建对象
		Person p = new Person();		//p>>成员变量
		//Person p1 = new Person();
		
		Person p1 = p;
		p.run();
		p.sleep();
		
		p = null;
		System.out.println(p1.height);
		p1.run();
	}
}

class Person{
	//int height;
	int height = 180;
	int weight;
	
	public void run(){
		System.out.println(height + "----run");
	}
	
	public void sleep(){
		System.out.println("Zzzzzz");
	}
}



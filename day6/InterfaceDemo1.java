class InterfaceDemo1{
	public static void main(String[] args){
		Woman w = new Woman();
		w.white();
	}
}

interface WomanStar{
	public void white();
}

class Woman implements WomanStar{
	public void white(){
		System.out.println("很白");
	}
}


class StackHeap{
	public static void main(String[] args){
		Stack s = new Stack();
		s.getStack();
		s.setStack();
		
	}
}

class Stack{
	
	static{
		System.out.println("Code");
	}
	int a = 100 ;
	int b = 200 ; 
	public Stack(){
		System.out.println(a+b);
	}
	public void getStack(){
		System.out.println("Hello world!");
	}
	public void setStack(){
		System.out.println("Hello world! 2");
	}
}
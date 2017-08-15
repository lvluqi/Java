class InterfaceDemo2{
	public static void main(String[] args){
		Mp3 mp3 = new Mp3();
		Fan fan = new Fan();
		Camera can = new Camera();
		
		Compute com = new Compute();
		
		com.insert(mp3);
		com.insert(fan);
		com.insert(can);
	}
}

interface USB{
	public void play();
}

class Mp3 implements USB{
	public void play(){
		System.out.println("Mp3");
	}
}

class Fan implements USB{
	public void play(){
		System.out.println("Fan");
	}
}

class Camera implements USB{
	public void play(){
		System.out.println("Camera");
	}
}

class Compute{
	public void insert(USB usb){
		System.out.println("USB device success.");
		usb.play();
	}
}


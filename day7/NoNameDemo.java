class NoNameDemo{
	public static void main(String[] args){
		Computer com = new Computer();
		Slot s = new Slot();
		com.slot(s);
	}
}



class Computer{
    public void slot(PCI p){
		System.out.println("This is pci");
		p.videoCard();
	}
}

interface PCI{
	public void videoCard();
	public void soundCard();
	public void voiceCard();
}

class Slot implements PCI{
	public void videoCard(){
		System.out.println("videoCard");
	}
	public void soundCard(){
		System.out.println("soundCard");
	}
	public void voiceCard(){
		System.out.println("voiceCard");
	}
}


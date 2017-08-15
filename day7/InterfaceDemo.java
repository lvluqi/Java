class InterfaceDemo{
	public static void main(String[] args){
		PC pc = new PC();
		//VideoCard v = new VideoCard();
		pc.pci(new Slot(){
			public void insert(){
				System.out.println("VideoCard");
			}
		});
		
		pc.pci(new Slot(){
			public void insert(){
				System.out.println("SoundCard");
			}
		});
		
		pc.pci(new Slot(){
			public void insert(){
				System.out.println("VoiceCard");
			}
		});
	}
}



interface Slot{
	public void insert();
}

//class VideoCard implements Slot{
//	public void insert(){
//		System.out.println("VideoCard");
//	}
//}

class PC{
	public void pci(Slot s){
		System.out.println("This is pci");
		s.insert();
	}
}
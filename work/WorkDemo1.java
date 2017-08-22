class WorkDemo1{
	public static void main(String[] args){
		ManTou mt = new ManTou();
		Worker w1 = new Worker("S1",mt);
		Worker w2 = new Worker("S2",mt);
		Worker w3 = new Worker("S3",mt);
		Worker w4 = new Worker("S4",mt);
		Worker w5 = new Worker("S5",mt);
		Worker w6 = new Worker("S6",mt);
		Worker w7 = new Worker("S7",mt);
		Worker w8 = new Worker("S8",mt);
		Worker w9 = new Worker("S9",mt);
		Worker w10 = new Worker("S10",mt);
		Worker w11 = new Worker("S11",mt);
		Worker w12 = new Worker("S12",mt);
		Worker w13 = new Worker("S13",mt);
		Worker w14 = new Worker("S14",mt);
		Worker w15 = new Worker("S15",mt);
		Worker w16 = new Worker("S16",mt);
		Worker w17 = new Worker("S17",mt);
		Worker w18 = new Worker("S18",mt);
		Worker w19 = new Worker("S19",mt);
		Worker w20 = new Worker("S20",mt);
		
		
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		w5.start();
		w6.start();
		w7.start();
		w8.start();
		w9.start();
		w10.start();
		w11.start();
		w12.start();
		w13.start();
		w14.start();
		w15.start();
		w16.start();
		w17.start();
		w18.start();
		w19.start();
		w20.start();
	}
}

class Worker extends Thread{
	private String name;
	private ManTou mt;
	public Worker(String name,ManTou mt){
		this.name = name;
		this.mt = mt;
	}
	
	public void run(){
		int flag = 1;
		while(true){
			int i = mt.getMt();
			if(flag <= 3){
				flag = flag + 1;
			}
			else{
				return ;
			}
			if(i == -1){
				return ;
			}
			else{
				//System.out.println(flag);
				System.out.println(name + " eat:" + i);
			}
		}
	}
}

class ManTou{
	private int Mt = 60;
	public synchronized int getMt(){
		int temp = Mt;
		Mt = Mt - 1;
		return temp < 1 ? -1 : temp;
	}
}
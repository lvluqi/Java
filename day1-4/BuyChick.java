class BuyChick{
	
	public static void main(String[] args){
		for(int i = 0; i < 100 / 3; i ++){
			for(int j = 0 ; j < 100; j ++){
				for (int k = 0 ; k < 100; k = k + 3){
					int money = i * 3 + j * 1 + k / 3;
					int count = i + j + k * 3 ;
					if (money == 100 && count == 100){
						System.out.println(i + "," + j + "," + k);
					}
				}
			}
			
		}
	}
}
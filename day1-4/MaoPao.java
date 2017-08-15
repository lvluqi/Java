class MaoPao{
	public static void main(String[] args){
		int[] arr = {8949,6456,1212,748798,64654,7878,46546,479874,4654,262,0};
		getArry(arr);
	}
	
	public static void getArry(int[] arr){
		
		for (int i = arr.length - 1; i > 0 ; i --){
			for(int j = 0; j < i ; j ++){
				if (arr[j] > arr[j + 1]){
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int ii:arr){
			System.out.print(ii+" ");
		}
		System.out.println();
	}
}
class Solution{
	public static void main(String[] args){
	int[] B = {1,2,2,3,2,4};
		Demo(B,6,2);
	}
	public static int Demo(int[] A,int n, int elem){
		int i = 0;
		int j = 0 ;
		for(i = 0; i < n ; i++){
			if(A[i] == elem){
				continue;
			}
			
			A[j] = A[i];
			j++;
		}
		return j;
	} 
}
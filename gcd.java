class Gcd{
	public static int main(int q , int p){
		if (q == 0){
			return p;
		}
		int r = p % q ;
		return main(q,r);
	}
}
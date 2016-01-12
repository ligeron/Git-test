
class pussy {
	public static void main(String args[]){
		int i;
		int k;
//		System.out.println("Hello world!!!");
		inputVaribles iv = new inputVaribles();
		iv.Scan();
		i = count(iv.i);
		k = count(iv.k);
		iv.Scan(i, k);
		
		}
	private static int count(int x){
		x=x+1;
		return x;
	} 
}

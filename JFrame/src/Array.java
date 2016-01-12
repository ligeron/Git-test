
public class Array {
	public static void main(String args[]) {
		int[][] m = {{1,2,3},{4,5},{7,8,9}};
		
		for(int row=0;row<m.length;row++)
		{
			for(int col=0;col<m[row].length;col++)
			{
				System.out.print(m[row][col]+"  ");
			}
			System.out.println();
		}
	}
}

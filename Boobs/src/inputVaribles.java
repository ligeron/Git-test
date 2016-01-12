import javax.swing.JOptionPane;
public class inputVaribles  {
	int i,k;
	String n1,n2;
	dougter dgt;
	
	public void Scan() {
		
		n1 = JOptionPane.showInputDialog("Enter i");
		n2 = JOptionPane.showInputDialog("Enter k");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
	}
	
	public void Scan(int a, int b) {
		dgt = new dougter();
		String s1 = dgt.dougterMethod();
		String s2 = dgt.dougterMethod("Now i ="+a+", k ="+b);
		String s3 = s1 + s2;
		JOptionPane.showMessageDialog(null,s3 );
	}
	
}

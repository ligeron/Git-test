import java.math.MathContext;
import java.util.ArrayList;

public class threadCall {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new threadListener("1"));
		Thread t2 = new Thread(new threadListener("2"));
		Thread t3 = new Thread(new threadListener("3"));
		
		t1.start();
		t2.start();
		t3.start();
	}

}

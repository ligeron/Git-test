import java.util.*;

public class threadListener implements Runnable {

	int time;
	String name;
	Random r = new Random();
	
	public threadListener(String name){
		this.name = name;
		time = r.nextInt(999);
	}
	
	@Override
	public void run() {
		System.out.printf("����� %s ���� %d\n", name ,time);
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
		System.out.printf("����� %s ��������� � ����������\n", name);
		
		
	}
	
	

}

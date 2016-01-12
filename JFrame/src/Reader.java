import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {
	JButton b1,b2;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	int i,k;
	String a,b;
	eHandler heandler = new eHandler();
	
	public Reader(String s){
		super(s);//javax.swing.JFrame.JFrame(s); 
		setLayout(new FlowLayout());
		b1 = new JButton("Erase");
		b2 = new JButton("Calculate");
		l1 = new JLabel("Enter first number:");
		t1 = new JTextField(10);
		l2 = new JLabel("Enter thecond number:");
		t2 = new JTextField(10);
		l4 = new JLabel("");
		l3 = new JLabel("");
		
		add(b1);
		add(b2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		
		b2.addActionListener(heandler);
		b1.addActionListener(heandler);
		
	}
	
	public class eHandler implements ActionListener{

		public void actionPerformed(ActionEvent evt) {
		
			try{
			if(evt.getSource()==b2){
				i = Integer.parseInt(t1.getText());
				k = Integer.parseInt(t2.getText());
				i++;
				k++;
				a = ""+i;
				b = ""+k;
				l3.setText(a);
				l4.setText(b);
			}
			else if(evt.getSource()==b1){
				a = "";
				b = "";
				l3.setText("");
				l4.setText("");
				t1.setText("");
				t2.setText("");
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Enter numbers");
				
			}
		}
		
		
	}

}

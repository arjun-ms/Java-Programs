import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNumGUI extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	
	AddNumGUI(){
			l1 = new JLabel("1st Num: ");
			t1 = new JTextField(10);
			l2 = new JLabel("2nd Num: ");
			t2 = new JTextField(10);
			b1 = new JButton("ADD!");
			l3 = new JLabel("SUM ");
			t3 = new JTextField(10); 
			setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
			add(l1);
			add(t1);
			add(l2);
			add(t2);
			add(b1);
			add(l3);
			add(t3);
			b1.addActionListener(this);
			setSize(400,300);
			setVisible(true);
			setTitle("Add 2 Numbers");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		int sum = x+y;
		t3.setText(" "+sum);
	}
	
	public static void main(String args[]){
		new AddNumGUI();
	}
}

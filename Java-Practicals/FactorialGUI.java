import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialGUI extends JFrame implements ActionListener{
		JLabel l1,l2;
		JTextField t1,t2;
		JButton b1;
		
		FactorialGUI(){
			l1 = new JLabel("Enter a num:");
			t1 = new JTextField(10);
			b1 = new JButton("Find!");
			l2 = new JLabel("Factorial:");
			t2 = new JTextField(10);
			b1.addActionListener(this);
			add(l1);
			add(t1);
			add(b1);
			add(l2);
			add(t2);
			setLayout(new GridLayout(10,10));
			setVisible(true);
			setSize(400,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Factorial");
		}
		
		public void actionPerformed(ActionEvent e){
			int fact=1;
			int num = Integer.parseInt(t1.getText());
			for(int i=1;i<=num;i++)
				fact *= i;
			t2.setText(" "+fact);
		}
		
		public static void main(String args[]){
			new FactorialGUI();
		}
}

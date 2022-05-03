import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class PalindromeGUI extends JFrame implements ActionListener{
		JLabel l1,l2;
		JTextField t1;
		JButton b1;
		
		PalindromeGUI(){
			l1 = new JLabel("Enter a String:");
			t1 = new JTextField(10);
			b1 = new JButton("Check!");
			l2 = new JLabel();
			b1.addActionListener(this);
			add(l1);
			add(t1);
			add(b1);
			add(l2);
			setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
			setVisible(true);
			setSize(400,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Palindrome");
		}
		
		public void actionPerformed(ActionEvent e){
			String str = t1.getText();
			StringBuilder sbd  = new StringBuilder(str);
			sbd.reverse();
			String rev = sbd.toString();
			if(str.equals(rev)){
				l2.setText("Pallindrome");
				l2.setForeground(Color.green);
			}
			else{
				l2.setText("NOT Pallindrome");
				l2.setForeground(Color.red);
			}
		}
		
		public static void main(String args[]){
			new PalindromeGUI();
		}
}


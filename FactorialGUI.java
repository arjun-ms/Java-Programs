import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FactorialGUI extends JFrame implements ActionListener{

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    

    FactorialGUI(){
        setTitle("Factorial GUI");
       

        l1 = new JLabel("Enter a number: ");
        t1 = new JTextField(10);
        l2 = new JLabel("Factorial ");
        t2 = new JTextField(10);
        b1 = new JButton("Find Factorial");

        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);

        setVisible(true);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){

        int n = Integer.parseInt(t1.getText());
        int fact=1;
        for(int i=1; i<=n;i++){
            fact = fact*i;
        }
        t2.setText(""+fact);
    }

    public static void main(String[] args){
        new FactorialGUI();
    }
}

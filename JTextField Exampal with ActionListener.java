//Java JTextField Example with ActionListener
package Swing_Demo;
 
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public final class Eight_One extends JFrame
{
    private double num_01, num_02;
    private String sign;
    private double result,answer;
    
    private Container c;
    private JTextField tf1,tf2,tf3;
    private JButton jb1,jb2;
    
    Eight_One()
    {
        info();
    }
    
    public void info()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        tf1 = new JTextField();
        tf1.setBounds(40,40,200,40);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(40,100,200,40);
        c.add(tf2);
        
        tf3 = new JTextField();
        tf3.setBounds(40,160,200,40);
        tf3.setFocusable(false);
        c.add(tf3);
        
        jb1 = new JButton("+");
        jb1.setBounds(60,280,60,40);
        c.add(jb1);
        jb1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                num_01 = Double.parseDouble(tf1.getText());
                num_02 = Double.parseDouble(tf2.getText());
                sign = "+";
                
                result = num_01 + num_02;
                tf3.setText(num_01+" + "+num_02 + " = "+result);
            }
        
        
        });
        
        jb2 = new JButton("-");
        jb2.setBounds(150,280,60,40);
        c.add(jb2);
        jb2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                num_01 = Double.parseDouble(tf1.getText());
                num_02 = Double.parseDouble(tf2.getText());
                sign = "-";
                
                result = num_01 - num_02;
                tf3.setText(num_01+" - "+num_02 + " = "+result);
            }
        
        
        });
    }
    
    public static void main(String[] args) 
    {
        Eight_One frame = new Eight_One();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(800,180,350,450);
    }
}

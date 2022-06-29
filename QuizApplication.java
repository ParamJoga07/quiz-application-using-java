package QuizApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QuizApplication extends JFrame implements ActionListener {

    JButton b1,b2;
    JTextField t1;
    QuizApplication(){
        setBounds(0, 0,1400,720);
        setVisible(true);
        getContentPane().setBackground(Color.gray);
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("QuizApplication/icons/bg1.jpeg"));
        JLabel l1 = new JLabel(il);
        l1.setBounds(0,0,1400,720);
        add(l1);

//        JLabel l2 = new JLabel("QUIZMANIA");
//        l2.setFont(new Font("Sans Serif", Font.BOLD,45));
//        l2.setForeground(Color.BLACK);
//        l2.setBounds(825,50,300,200);
//        add(l2);

        JLabel l3 = new JLabel("Enter your Name");
        l3.setFont(new Font("Times New Roman", Font.BOLD,18));
        l3.setForeground(Color.BLACK);
        l3.setBounds(870,180,300,200);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(800,300,300,40);
        t1.setFont(new Font("Comic Sans Ms", Font.BOLD,20));
        t1.setForeground(Color.BLACK);
        add(t1);

        b1 = new JButton("RULES");
        b1.setFont(new Font("Comic Sans Ms", Font.BOLD,16));
        b1.setBounds(800,350,120,35);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("QUIT!");
        b2.setFont(new Font("Comic Sans Ms", Font.BOLD,16));
        b2.setBounds(980,350,120,35);
        b2.addActionListener(this);
        add(b2);


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }
        else{
            System.exit(0);
        }
    }
}

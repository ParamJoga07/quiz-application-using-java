package QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class score extends JFrame implements ActionListener {
    JButton b2;
    String username;
    score(String username,int score){
        setBounds(250, 50,1440,950);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("QuizApplication/icons/score.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(500,450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400,210,500,450);
        add(l1);

        JLabel l2= new JLabel("Thank you " +username+" for attempting the quiz!!! hope you enjoyed it!!!");
        l2.setBounds(400,30,900,30);
        l2.setFont(new Font("Comic Sans Ms", Font.BOLD,20));
        add(l2);

        JLabel l3= new JLabel("Your score is "+score);
        l3.setBounds(500,70,900,30);
        l3.setFont(new Font("Comic Sans Ms", Font.BOLD,20));
        add(l3);

        JButton b2 = new JButton("PLAY AGAIN");
        b2.setFont(new Font("Comic Sans Ms", Font.BOLD,16));
        b2.setBounds(500,100,150,30);
        b2.addActionListener(this);
        add(b2);

    }
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new QuizApplication().setVisible(true);
    }
}

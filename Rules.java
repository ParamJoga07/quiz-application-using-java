package QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    JButton b6,b7;
    String username;

    Rules(String username){
        this.username=username;
        setBounds(0, 0,1400,720);
        setVisible(true);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        JLabel l4 = new JLabel("WELCOME TO QUIZMANIA " + username);
        l4.setFont(new Font("Comic Sans Ms",Font.BOLD,28));
        l4.setForeground(Color.BLACK);
        l4.setBounds(500,20,700,30);
        add(l4);

        JLabel l5 = new JLabel("RULES AND REGULATIONS");
        l5.setFont(new Font("Comic Sans Ms",Font.BOLD,18));
        l5.setForeground(Color.BLACK);
        l5.setBounds(300,60,800,500);
        l5.setText(
            "<html>"+
                    "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                    "2. Participation in the quiz implies that participants accept the integrality of these rules. Non-compliance with the rules results in the automatic cancellation of the participation in the quiz and of the candidacy for the prize." + "<br><br>" +
                    "3. Anyone suspected by an official of cheating will be disqualified. You must not use any mobile device during a quiz competition." + "<br><br>" +
                    "4. All questions are compulsory." + "<br><br>" +
                    "5. Any discrepancies in the question the question will not be considered for evalulation and you can report to the team." + "<br><br>" +
                    "6. There will be total of 10 questions, each of 10 points." + "<br><br>" +
                    "7. There is no negative marking awarded for incorrect answer." + "<br><br>" +
            "<html>");
        add(l5);


        b6 = new JButton("QUIT!");
        b6.setFont(new Font("Times New Roman", Font.BOLD,16));
        b6.setBounds(500,570,100,50);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("START!");
        b7.setFont(new Font("Comic Sans Ms", Font.BOLD,16));
        b7.setBounds(720,570,100,50);
        b7.addActionListener(this);
        add(b7);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b6){
            this.setVisible(false);
            new QuizApplication().setVisible(true);
        }
        else if(ae.getSource()== b7){
            new quiz(username).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Rules("Param");
    }
};

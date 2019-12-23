package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {

    private Container c;
    private JLabel imgLabel, textLabel, devolop;  //Showing something on container
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;

    Test() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Lakshman", Font.BOLD, 15);

        img = new ImageIcon(getClass().getResource("MultiplicationImage.jpg"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(20, 10, 300, 200);
        c.add(imgLabel);

        textLabel = new JLabel("Enter any number : ");
        textLabel.setBounds(30, 200, 350, 100);
        textLabel.setForeground(Color.GRAY);
        textLabel.setFont(f);
        c.add(textLabel);


        tf = new JTextField();
        tf.setBounds(200, 240, 70, 30);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.ORANGE);
        c.add(tf);


        cursor = new Cursor(Cursor.HAND_CURSOR);

        clearButton = new JButton("Clear");
        clearButton.setBounds(200, 290, 70, 30);
        clearButton.setCursor(cursor);
        //clearButton.setFont(f);
        //clearButton.setBackground(Color.WHITE);
        c.add(clearButton);

        ta = new JTextArea();
        ta.setBounds(20, 340, 300, 300);
        ta.setFont(f);
        ta.setBackground(Color.cyan);
        c.add(ta);

        devolop = new JLabel("Develop By Lakshman....");
        devolop.setBounds(205, 605, 250, 90);
        c.add(devolop);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ta.setText("");

                int num = 0;
                try {
                    num = Integer.parseInt(tf.getText());
                    ta.append(" Multiplication of " + String.valueOf(num) + ":\n");
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String increment = String.valueOf(i);

                        ta.append("    " + n + " X " + increment + " = " + r + "\n");
                    }
                } catch (Exception nf) {
                    JOptionPane.showMessageDialog(null, "Please enter any number!");
                    ta.setText("");
                    tf.setText("");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                tf.setText("");
            }
        });

    }

    public static void main(String[] args) {

        try {

            Test frame = new Test();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(300, 20, 360, 700);
            frame.setTitle("Multiplication Table");
            frame.setResizable(false);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

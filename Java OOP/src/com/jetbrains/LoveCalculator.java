package com.jetbrains;
//Created By Lakshman on 12/30/2018

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoveCalculator extends JFrame {

    private Container container;
    private JLabel text1, text2, imageField, imageField1, developerName, leftPic, rightPic;
    private JButton clearButton, clickButton;
    private JTextField field1, field2;
    private JTextArea textArea, textAreaImage;
    private Cursor cursor;
    private ImageIcon icon, imageLabel, taImage, warningIcon, leftImage, rightImage;
    private Font font;

    LoveCalculator() {

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.red);
        icon = new ImageIcon(getClass().getResource("loveCalculator.png"));
        this.setIconImage(icon.getImage());

        text1 = new JLabel("Your name :");
        text1.setBounds(30, 20, 140, 15);
        container.add(text1);

        field1 = new JTextField();
        field1.setBounds(170, 20, 100, 20);
        field1.setBackground(Color.white);
        container.add(field1);

        text2 = new JLabel("Lover name :");
        text2.setBounds(30, 80, 140, 15);
        container.add(text2);

        field2 = new JTextField();
        field2.setBounds(170, 80, 100, 20);
        field2.setBackground(Color.white);
        container.add(field2);

        imageLabel = new ImageIcon(getClass().getResource("giphy.gif"));
        imageField = new JLabel(imageLabel);
        imageField.setBounds(140, 120, 150, 90);
        container.add(imageField);

        taImage = new ImageIcon(getClass().getResource("sidePic.gif"));
        imageField1 = new JLabel(taImage);
        imageField1.setBounds(10, 430, 400, 200);
        container.add(imageField1);

        leftImage = new ImageIcon(getClass().getResource("6FW4.gif"));
        leftPic = new JLabel(leftImage);
        leftPic.setBounds(0, 220, 100, 200);
        container.add(leftPic);

        rightImage = new ImageIcon(getClass().getResource("6FW4.gif"));
        rightPic = new JLabel(rightImage);
        rightPic.setBounds(320, 220, 100, 200);
        container.add(rightPic);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clearButton = new JButton("Clear");
        clearButton.setBounds(340, 170, 70, 30);
        clearButton.setCursor(cursor);
        container.add(clearButton);

        clickButton = new JButton("Click!");
        clickButton.setBounds(20, 170, 70, 30);
        clickButton.setCursor(cursor);
        container.add(clickButton);

        font = new Font("Ariyal", Font.BOLD, 40);

        textArea = new JTextArea();
        textArea.setBounds(115, 220, 200, 200);
        textArea.setBackground(Color.PINK);
        textArea.setFont(font);
        container.add(textArea);

        developerName = new JLabel("Develop By Lakshman....");
        developerName.setBounds(280, 600, 250, 90);
        container.add(developerName);

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String field3 = field1.getText();
                String field4 = field2.getText();

                if (field3.isEmpty() || field4.isEmpty()) {
                    // warningIcon = new ImageIcon("icon.gif");
                    JOptionPane.showMessageDialog(null, "   Please enter name !", "Warning !", 2);
                    textArea.setText("");
                } else {

                    textArea.setText("");
                    int randomNumber = (int) (Math.random() * 61) + 40;
                    String result = String.valueOf(randomNumber);

                    textArea.append("\n" + "      " + result + " %\n");
                    if (randomNumber >= 40 && randomNumber <= 60) {
                        textArea.append(" Average !");
                    } else if (randomNumber >= 61 && randomNumber <= 80) {
                        textArea.append("    Good !");
                    } else {
                        textArea.append(" Excellent !");
                    }
                }

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                field1.setText("");
                field2.setText("");
            }
        });

    }

    public static void main(String[] args) {
        try {
            LoveCalculator loveCalculator = new LoveCalculator();
            loveCalculator.setVisible(true);
            loveCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        loveCalculator.setDefaultCloseOperation(JOptionPane.showConfirmDialog(null, "Do you want to quite?", "End!", JOptionPane.YES_NO_OPTION));
            loveCalculator.setBounds(1000, 90, 435, 690);
            loveCalculator.setTitle("Love Calculator!");
            loveCalculator.setResizable(false);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

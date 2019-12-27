package com.lakshman;
//Created By Lakshman on 12/29/2018

import javax.swing.*;
import java.awt.*;

public class FrameDemo extends JFrame {

    private ImageIcon icon, image;
    private Container container;
    private JLabel userLabel, passLabel, imageAdd;
    private TextField userField, passField;
    private Font font;


    FrameDemo() {
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.CYAN);
        icon = new ImageIcon (getClass().getResource("image.png")); //Icon change
        this.setIconImage(icon.getImage());

        font = new Font("Arial", Font.BOLD, 14);

        userLabel = new JLabel("Enter your username : ");
        userLabel.setBounds(20, 40, 150, 15);
        userLabel.setForeground(Color.ORANGE);
        userLabel.setToolTipText("username: Lakshman");

//        userLabel.setText("Enter your username : ");
//        userLabel.setFont(font);
//        userLabel.setOpaque(true);           //Text backgtround color change
//        userLabel.setBackground(Color.BLUE);

        container.add(userLabel);

        passLabel = new JLabel("Enter your password : ");
        passLabel.setBounds(20, 80, 150, 15);
//      passLabel.setFont(font);
        container.add(passLabel);

        userField = new TextField();
        userField.setBounds(170, 40, 100, 20);
        userField.setBackground(Color.GREEN);
        container.add(userField);

        passField = new TextField();
        passField.setBounds(170, 75, 100, 20);
        container.add(passField);

        image = new ImageIcon(getClass().getResource("image11.jpg")); //Image add
        imageAdd = new JLabel(image);
        imageAdd.setBounds(20, 150, 200, 200); //getIconWidth, getIconHeight
        container.add(imageAdd);


    }

    public static void main(String[] args) {
         FrameDemo frame = new FrameDemo();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 400); // width, height
//         frame.setLocationRelativeTo(null); //Frame show in center
//         frame.setLocation(1100, 200); // x, y
         frame.setBounds(1100, 200, 400, 400);
         frame.setTitle("Frame Demo");
         frame.setResizable(false);


    }
}

package com.lakshman;

import javax.swing.*;

public class ShowMessageDialog {

    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("image.png");
        JOptionPane.showMessageDialog(null, "Wrong Password!!", "Warning",JOptionPane.PLAIN_MESSAGE,imageIcon);
    }
}

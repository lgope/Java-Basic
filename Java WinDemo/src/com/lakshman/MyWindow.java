package com.lakshman;
//Created By Lakshman on 1/9/2019

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500, 500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        graphics.setFont(sansSerifLarge);
        graphics.drawString("Hello My Window", 60, 60);
        graphics.setFont(sansSerifSmall);
        graphics.drawString("by Lakshman Gope", 60, 100);
    }
}

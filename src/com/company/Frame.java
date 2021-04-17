package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame {
    Panel myPanel;

    public Frame(){




        myPanel = new Panel();
        addKeyListener(new MyKey());
        add(myPanel);
        //setExtendedState(MAXIMIZED_BOTH);
        setBounds(0,0,800,800);
        setVisible(true);
        setFocusable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class MyKey implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if ((e.getKeyCode() == e.VK_W || e.getKeyCode() == e.VK_UP) && myPanel.mySnake.direction != "down") {
                myPanel.mySnake.direction = "up";
            }
            if ((e.getKeyCode() == e.VK_S || e.getKeyCode() == e.VK_DOWN) && myPanel.mySnake.direction != "up") {
                myPanel.mySnake.direction = "down";
            }
            if ((e.getKeyCode() == e.VK_A || e.getKeyCode() == e.VK_LEFT) && myPanel.mySnake.direction != "right") {
                myPanel.mySnake.direction = "left";
            }
            if ((e.getKeyCode() == e.VK_D || e.getKeyCode() == e.VK_RIGHT) && myPanel.mySnake.direction != "left") {
                myPanel.mySnake.direction = "right";
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }



}
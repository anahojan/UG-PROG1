package com.company;

import com.company.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
   public static JFrame okno;
   public static JTextField napisi;
   public static JTextField napisi2;
   public static JButton sestej;

    public static void main(String[] args) {
         okno = new JFrame();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(400,400);
        Poslusalec poslusalec=new Poslusalec();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        napisi = new JTextField(10);
        napisi2 = new JTextField(5);
         sestej = new JButton();
         sestej.addActionListener(poslusalec);

        panel.add(napisi);
        panel.add(napisi2);
        panel.add(sestej);


        okno.add(panel);
        okno.setVisible(true);

    }
}
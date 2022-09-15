package com.company;

import javax.swing.*;
import java.awt.*;

public class Grafika extends JPanel {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setSize(800, 600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //menu bar
        JPanel menubar=new JPanel();
        menubar.setLayout(new FlowLayout());
        JButton lahko = new JButton("Easy");
        JButton srednjetezo = new JButton("Intermediate");
        JButton tezko = new JButton("Hard");
       JButton newgame = new JButton("New game");
       JButton savegame = new JButton("Save game");


        menubar.add(lahko);
        menubar.add(srednjetezo);
        menubar.add(tezko);
        menubar.add(newgame);
        menubar.add(savegame);
        okno.add(menubar, BorderLayout.NORTH);

        MenuListener poslusalec = new MenuListener();
        lahko.addActionListener(poslusalec);
        srednjetezo.addActionListener(poslusalec);
        tezko.addActionListener(poslusalec);
        newgame.addActionListener(poslusalec);
        savegame.addActionListener(poslusalec);

        JPanel center_panel=new JPanel();
        center_panel.setLayout(new GridLayout());

        okno.setVisible(true);
    }


}
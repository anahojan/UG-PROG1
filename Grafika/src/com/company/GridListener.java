package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton b= (JButton) actionEvent.getSource();  //ta stavar bo ok dokler bo objekt Jbutton
        b.setBackground(new Color(0x2FBF7F));
        b.setForeground(new Color(0x801C7C));
        String coordinates[]=b.getText().split(",");
        System.out.println(coordinates[0]+ ":"+ coordinates[1]);
        //System.out.println("Click");
        //poslusalec za matriko -klik na mxn
        //za menu bomo hendlali drugače
    }
}
//array barv ne večji od 10
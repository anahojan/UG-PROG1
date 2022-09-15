package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GridListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        JButton source= (JButton) actionEvent.getSource();  //ta stavar bo ok dokler bo objekt Jbutton
        source.setBackground(new Color(0x07FFD0));

        String coordinates[]=source.getText().split(",");
        System.out.println(coordinates[0]+ ":"+ coordinates[1]);
    }

}

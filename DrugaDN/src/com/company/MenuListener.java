package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MenuListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton c = (JButton) actionEvent.getSource();
        c.setBackground(new Color(0x11FFCC));
    }






}

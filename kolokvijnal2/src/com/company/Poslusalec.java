package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Poslusalec extends Main implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int a = Integer.parseInt(napisi.getText());
        int b = Integer.parseInt(napisi2.getText());

        int c = a+b;
        sestej.setText(String.valueOf(c));
    }
}


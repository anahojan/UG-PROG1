package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Game extends Grafika{

    public static void main(String[] args) {
        int M=8;
        int N=8;
        int K=8;

        Color set_k[]=new Color[3];
        set_k[0]=new Color(Color.getHSBColor(240, 44, 100).getRGB()); //roza
        set_k[1]=new Color(Color.getHSBColor(0, 0, 10).getRGB()); //bela
        set_k[2]=new Color(Color.getHSBColor(0,100,50).getRGB()); //rumena


        JPanel game = new JPanel();
        GridListener poslusalec=new GridListener();
        JButton data[][]= new JButton[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                JButton b = new JButton("" + i + "," + j);
                b.addActionListener(poslusalec);

                /*b.setBackground(colorselect(set_k));*/
                game.add(b);
            }
        }

        Grafika.okno.add(center_panel);
        center_panel.revalidate();
        Grafika.okno.setVisible(false);
        Main.okno.validate();
        Main.okno.repaint();
        Main.okno.setVisible(true);*/


    }
    public Color colorselect(Color a[]){
        int rand=new Random().nextInt(3);
        return a[rand];
    }
}

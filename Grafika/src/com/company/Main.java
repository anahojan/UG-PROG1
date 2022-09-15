package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N=6;
        int M=7;
        int K=4;
        int set_k[]=new int[K];
        Random rand = new Random();
        for (int i = 0; i < K; i++) {
            set_k[i]= rand.nextInt();
        }

        JFrame okno = new JFrame();
        okno.setSize(800, 600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // če kliknemo na x se program tudi ustavi
        //menu
        JButton prvi=new JButton("New game");
        prvi.setBackground(Color.MAGENTA); //ima prvi.set ima zelo veliko funkcij
        JButton drugi= new JButton("Save game");
        drugi.setBackground(Color.PINK);
        JButton load=new JButton("Load game");
        load.setBackground(Color.white);
       // okno.add(prvi, BorderLayout.NORTH); //znotraj podkontejnerja se gumb(ipd) razširi čez celoten South
        //okno.add(drugi, BorderLayout.NORTH); //Zato je drugi overlappa prvega
       //zato naredimo Jpanel -navaden list papirja - spremenimo mu layout v flow in prilepimo gumba
        JPanel north_panel=new JPanel();
        north_panel.setLayout(new FlowLayout());
        north_panel.add(prvi);
        north_panel.add(drugi);
        north_panel.add(load);
        okno.add(north_panel, BorderLayout.NORTH);
        GridListener poslusalec =new GridListener();



        //game
        JPanel center_panel=new JPanel();
        center_panel.setLayout(new GridLayout(N,M));
        JButton data[][]= new JButton[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                JButton b=new JButton(""+i+","+j);
                b.addActionListener(poslusalec);
                b.setBackground(new Color(set_k[rand.nextInt(K)]));
                center_panel.add(b);
            }

        }
        okno.add(center_panel);
        okno.setVisible(true);

    }
}

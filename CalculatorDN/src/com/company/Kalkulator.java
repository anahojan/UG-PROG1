package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Kalkulator extends JFrame implements ActionListener{
    private double result;
    private JLabel label;
    private JButton buttonena;
    private JButton buttonstiri;
    private JButton buttonsedem;
    private JButton buttonnic;
    private JButton buttondva;
    private JButton buttonpet;
    private JButton buttonosem;
    private JButton buttontri;
    private JButton buttonsest;
    private JButton buttondevet;
    private JButton buttonDot;
    private JButton buttonenako;
    private JButton buttonsestevanje;
    private JButton buttonodstevanje;
    private JButton buttondeljenje;
    private JButton buttonmnoženje;
    private JButton buttonBs;
    private JButton buttonCl;
    private JPanel okno;

    Kalkulator() {
        super("Kalkulator");
        this.setSize(450, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno = new JPanel();
        okno.setLayout(null);


        label = new JLabel(" ");
        label.setBounds(100, 20, 400, 25);
        okno.add(label);


        buttonCl = new JButton("Clear");
        buttonCl.setBounds(220, 60, 110, 30);
        buttonCl.addActionListener(this);

        okno.add(buttonCl);

        buttonBs = new JButton("BackSpace");
        buttonBs.setBounds(100, 60, 110, 30);

        buttonBs.addActionListener(this);
        okno.add(buttonBs);

        buttonsedem = new JButton("7");
        buttonsedem.setBounds(100, 100, 50, 50);
        buttonsedem.addActionListener(this);

        okno.add(buttonsedem);

        buttonosem = new JButton("8");
        buttonosem.setBounds(160, 100, 50, 50);
        buttonosem.addActionListener(this);

        okno.add(buttonosem);

        buttondevet = new JButton("9");
        buttondevet.setBounds(220, 100, 50, 50);
        buttondevet.addActionListener(this);

        okno.add(buttondevet);

        buttonmnoženje = new JButton("*");
        buttonmnoženje.setBounds(280, 100, 50, 50);
        buttonmnoženje.addActionListener(this);

        okno.add(buttonmnoženje);

        buttonstiri = new JButton("4");
        buttonstiri.setBounds(100, 160, 50, 50);
        buttonstiri.addActionListener(this);

        okno.add(buttonstiri);

        buttonpet = new JButton("5");
        buttonpet.setBounds(160, 160, 50, 50);
        buttonpet.addActionListener(this);

        okno.add(buttonpet);

        buttonsest = new JButton("6");
        buttonsest.setBounds(220, 160, 50, 50);
        buttonsest.addActionListener(this);

        okno.add(buttonsest);

        buttondeljenje = new JButton("/");
        buttondeljenje.setBounds(280, 160, 50, 50);
        buttondeljenje.addActionListener(this);

        okno.add(buttondeljenje);

        buttonena = new JButton("1");
        buttonena.setBounds(100, 220, 50, 50);
        buttonena.addActionListener(this);

        okno.add(buttonena);

        buttondva = new JButton("2");
        buttondva.setBounds(160, 220, 50, 50);
        buttondva.addActionListener(this);

        okno.add(buttondva);

        buttontri = new JButton("3");
        buttontri.setBounds(220, 220, 50, 50);
        buttontri.addActionListener(this);

        okno.add(buttontri);

        buttonodstevanje = new JButton("-");
        buttonodstevanje.setBounds(280, 220, 50, 50);
        buttonodstevanje.addActionListener(this);

        okno.add(buttonodstevanje);

        buttonnic = new JButton("0");
        buttonnic.setBounds(100, 280, 50, 50);
        buttonnic.addActionListener(this);

        okno.add(buttonnic);

        buttonDot = new JButton(".");
        buttonDot.setBounds(160, 280, 50, 50);
        buttonDot.addActionListener(this);

        okno.add(buttonDot);

        buttonenako = new JButton("=");
        buttonenako.setBounds(220, 280, 50, 50);
        buttonenako.addActionListener(this);

        okno.add(buttonenako);

        buttonsestevanje = new JButton("+");
        buttonsestevanje.setBounds(280, 280, 50, 50);
        buttonsestevanje.addActionListener(this);

        okno.add(buttonsestevanje);

        this.add(okno);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String zacetna = actionEvent.getActionCommand();

        switch (zacetna) {
            case "1":
                label.setText(label.getText() + buttonena.getText());
                break;
            case "2":
                label.setText(label.getText() + buttondva.getText());
                break;
            case "3":
                label.setText(label.getText() + buttontri.getText());
                break;
            case "4":
                label.setText(label.getText() + buttonstiri.getText());
                break;
            case "5":
                label.setText(label.getText() + buttonpet.getText());
                break;
            case "6":
                label.setText(label.getText() + buttonsest.getText());
                break;
            case "7":
                label.setText(label.getText() + buttonsedem.getText());
                break;
            case "8":
                label.setText(label.getText() + buttonosem.getText());
                break;
            case "9":
                label.setText(label.getText() + buttondevet.getText());
                break;
            case "0":
                label.setText(label.getText() + buttonnic.getText());
                break;
            case ".":
                label.setText(label.getText() + buttonDot.getText());
                break;
            case "=":
                Operacije Es = new Operacije(label.getText());
                result = Es.Result();
                String answ = Double.toString(result);
                label.setText(answ);
                break;
            case "+":
                label.setText(label.getText() + buttonsestevanje.getText());
                break;
            case "-":
                label.setText(label.getText() + buttonodstevanje.getText());
                break;
            case "*":
                label.setText(label.getText() + buttonmnoženje.getText());
                break;
            case "/":
                label.setText(label.getText() + buttondeljenje.getText());
                break;
            case "BackSpace":
                String temp = label.getText();
                int len = temp.length();
                temp = temp.substring(0, len - 1);
                label.setText(temp);
                break;
            case "Clear":
                label.setText("");
                break;
        }
    }
}



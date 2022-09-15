package com.company;

public class Operacije implements Vmesnik{
    private double[] stevilo;
    private char[] operator;
    private String s;
    private int dolzina;
    private int prev;
    private String temp;
    private int pozicija;
    private int Operatorpozicija;
    private int NumPos;
    private double rezultat;
    double Result(){
        return rezultat;
    }

    Operacije(String s){
        rezultat = 0;
        this.s = s;
        dolzina = s.length();
        stevilo = new double[20];
        operator = new char[20];
        prev = 0;
        pozicija = 0;
        Operatorpozicija=1;
        NumPos = 0;
        GetNumOp();

        Izracunaj();
        rezultat = stevilo[0];

    }
    public void GetNumOp(){
        while(pozicija<dolzina){
            if(s.charAt(pozicija)=='+') {
                operator[Operatorpozicija] = '+';
                Operatorpozicija+=2;
                temp = s.substring(prev,pozicija);
                stevilo[NumPos]= Double.parseDouble(temp);
                NumPos+=2;
                prev = pozicija+1;

            }else  if(s.charAt(pozicija)=='-') {
                operator[Operatorpozicija] = '-';
                Operatorpozicija+=2;
                temp = s.substring(prev,pozicija);
                stevilo[NumPos]= Double.parseDouble(temp);
                NumPos+=2;
                prev = pozicija+1;
            }else  if(s.charAt(pozicija)=='*') {
                operator[Operatorpozicija] = '*';
                Operatorpozicija+=2;
                temp = s.substring(prev,pozicija);
                stevilo[NumPos]= Double.parseDouble(temp);
                NumPos+=2;
                prev = pozicija+1;
            }else  if(s.charAt(pozicija)=='/') {
                operator[Operatorpozicija] = '/';
                Operatorpozicija+=2;
                temp = s.substring(prev,pozicija);
                stevilo[NumPos]= Double.parseDouble(temp);
                NumPos+=2;
                prev = pozicija+1;
            }else{}
            pozicija++;
        }
        temp = s.substring(prev);
        stevilo[NumPos] = Double.parseDouble(temp);
    }

    public void Izracunaj(){
        for(int i=1; i<=Operatorpozicija; i+=2){
            if(operator[i]=='*'){
                stevilo[i-1] =stevilo[i-1]*stevilo[i+1];
                SteviloPozicija(i+1);
                OperatorPozicija(i);
            }
        }
        for(int i=1; i<=Operatorpozicija; i+=2){
            if(operator[i]=='/'){
                stevilo[i-1] =stevilo[i-1]/stevilo[i+1];
                SteviloPozicija(i+1);
                OperatorPozicija(i);
            }
        }
        for(int i=1; i<=Operatorpozicija; i+=2){
            if(operator[i]=='-'){
                stevilo[i-1] =stevilo[i-1]-stevilo[i+1];
                SteviloPozicija(i+1);
                OperatorPozicija(i);
            }
        }
        for(int i=1; i<=Operatorpozicija; i+=2){
            if(operator[i]=='+'){
                stevilo[i-1] =stevilo[i-1]+stevilo[i+1];
                SteviloPozicija(i+1);
                OperatorPozicija(i);
            }
        }
    }


    public void SteviloPozicija(int pos1) {
        for (int i = pos1; i < NumPos; i += 2) {
            stevilo[i] = stevilo[i + 2];
        }
    }
    public void OperatorPozicija(int pos1){
        for(int i = pos1; i<Operatorpozicija; i+=2) {
            operator[i] = operator[i+2];
        }
    }
}


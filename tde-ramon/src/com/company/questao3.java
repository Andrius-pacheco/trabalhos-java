package com.company;

import javax.swing.*;

public class questao3 {
    public static void main(String[] args) {
        double n1, n2, n3;
        double media;
        String dado;

        dado = JOptionPane.showInputDialog("Informe a nota do trabalho:");
        n1= Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe a nota do trabalho:");
        n2= Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe a nota da prova:");
        n3= Double.parseDouble(dado);
        media =( n1+n2+n3)/3;

        if(media>6){
            JOptionPane.showMessageDialog(null,"aluno foi aprovado");
        }
        else {
            JOptionPane.showMessageDialog(null,"aluno foi reprovado");
        }





    }
}

package com.company;

import javax.swing.*;

public class questao2 {
     public static void main(String[] args) {

         double percentualitbi;
         double valvenal;
         double valtransacao;
         double impostopago;
         String dado;
         dado= JOptionPane.showInputDialog("Digite o valor transação:");
         valtransacao = Double.parseDouble(dado);
         dado= JOptionPane.showInputDialog("Digite o valor da venal:");
         valvenal = Double.parseDouble(dado);
         dado= JOptionPane.showInputDialog("Digite a porcentagem do imposto:");
         percentualitbi = Double.parseDouble(dado);
         if (valtransacao >valvenal){
             impostopago = valtransacao*percentualitbi/100;
         }
         else {
             impostopago= valvenal*percentualitbi/100;
         }
         JOptionPane.showMessageDialog(null,"Imposto a ser pago é:"+ impostopago);





     }
}

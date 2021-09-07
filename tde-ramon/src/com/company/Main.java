package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        double valor;
        double porcentagem;
        double desconto;
        double precodesconto;

        System.out.println("Digite o valor do produto!");
        valor=tc.nextDouble();

        System.out.println("Digite a porcentagem do desconto!");
        porcentagem = tc.nextDouble();
        desconto=valor*porcentagem/100;
        precodesconto=valor-desconto;

        System.out.println("O preço do produto:"+ valor);
        System.out.println("o valor do desconto:"+ desconto);
        System.out.println("O valor do produto com desconto:"+ precodesconto);



    }
}

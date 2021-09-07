package com.company;

public class questao1math {
    public static void main(String[] args) {

       final int FACES=6;
        final int VEZES=3;
        int sorteio,total=0;

        for (int i=0; i<3; i++) {
            sorteio = (int) (Math.random() * FACES+1);
            total+=sorteio;


            System.out.println(sorteio);



        }
        System.out.println(total);

    }
}

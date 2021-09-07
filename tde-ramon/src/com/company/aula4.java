package com.company;

public class aula4 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));
        System.out.println(Math.sin(25));//metodo
        System.out.println(Math.PI);
        System.out.println(Math.E);//atributo

        System.out.println( Math.ceil(2.9)) ;
        System.out.println(Math.ceil(2.1));

        System.out.println(Math.round(2.9));
        System.out.println(Math.round(2.1));

        System.out.println(Math.floor(2.1));
        System.out.println(Math.floor(2.9));

        System.out.println(Math.max(Math.max(2.9,Math.ceil(3.1)),2.1));

        int sorteio = (int)(Math.random()*6)+1;
        System.out.println(sorteio);

        System.out.println(Math.pow(7, 2));

        int a = -6;
        double d = -200;
        float f = -90;

        System.out.println(Math.abs(a));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));

        System.out.println(Math.min(12.321, 12.654));
        System.out.println(Math.min(23.12, 23.0));

    }
}

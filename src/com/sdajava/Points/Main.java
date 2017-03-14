package com.sdajava.Points;
//kopiowac to łatwo :P
import java.util.Scanner;

public class Main {
    String szyfr(String str)
    {
        char x[ ] = str.toCharArray( );

        for( int i=0 ; i!=x.length ; i++)
        {
            int n = x[i];
            n+=3;
            x[i]=(char)n;
            System.out.print(x[i]);
        }
        return new String(x);

    }
    public static void main(String[] args) {
        String tekst;


        System.out.println("Podaj tekst:");
        Scanner in = new Scanner(System.in);
        tekst = in.nextLine();

       Main main = new Main();

        main.szyfr(tekst);


    }
}

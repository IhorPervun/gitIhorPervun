package com.company;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int s = in.nextInt();
        short[][] a = new short[s][s];
        short[][] b = new short[s][s];
        short[][] c = new short[s][s];
        short Res = 0;

        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a.length; ++j) {
                a[i][j] = ((short)Math.round(Math.random() * 10.0D));
                b[i][j] = ((short)Math.round(Math.random() * 10.0D));
                c[i][j] = (short)(a[i][j] ^ b[i][j]);
            }

            for(int j = 0; j < c[i].length; ++j) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();

            short cmin = c[i][0];
            for(int j = 0; j < c[i].length; ++j) {
                if (c[i][j] < cmin) {
                    cmin = c[i][j];
                }
            }
            Res += cmin;
        }
        System.out.println("The result is:" + Res);
    }
}

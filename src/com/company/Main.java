package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int a;

        System.out.print("Jumlah deret Fibonancci yang diinginkan : ");
        a = aa.nextInt();

        for (int i=1;i<=a;i++){
            int b = cari(i);
            System.out.print(b+"");
        }
	// write your code here
    }
    public static int cari(int a){
        if (a == 1 || a == 2){
            return 1;
        }else {
            return cari(a-1)+cari(a-2);
        }
    }
}

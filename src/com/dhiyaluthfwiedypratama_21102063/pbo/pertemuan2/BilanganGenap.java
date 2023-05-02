package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan2;

import java.util.Scanner;
public class BilanganGenap {
    //  Untuk Menginput batas bilangan yang diinputkan
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.print("Input batas bilangan : ");
        bilangan = input.nextInt();

        System.out.println("===Program menampilkan Bilangan genap===");
        for (int i = 1; i<= bilangan; i++){
            if(i % 2 == 0){
                System.out.println(("Angka-" + i));
            }
        }
        input.close();
    }

}

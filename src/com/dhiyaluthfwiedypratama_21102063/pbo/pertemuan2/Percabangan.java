package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan2;

 import java.util.Scanner;
public class Percabangan {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Sebuah Bilangan : ");
        int bilangan = scanner.nextInt();

        if (bilangan > 0){
            System.out.println("Bilangan Poistif");
        }else if (bilangan < 0){
            System.out.println("Bilangan Negatif");
        }else{
            System.out.println("Bilangan Nol");
        }
    }
}

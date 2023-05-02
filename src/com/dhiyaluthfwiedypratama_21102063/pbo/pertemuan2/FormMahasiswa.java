package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan2;

import java.util.Scanner;
public class FormMahasiswa {
    public static void main (String[] args){
        Scanner Dhiyaa = new Scanner(System.in);

        String nama;
        int umur, Pilih;

        System.out.println(" ~~=== Form Pendaftaran Mahasiswa Baru ===~~ ");
        System.out.print(" Masukan Nama Anda : ");
        nama = Dhiyaa.nextLine();
        System.out.print("Masukan Umur Anda : ");
        umur = Dhiyaa.nextInt();

        if(nama == ""){
            System.out.println("Maaf, Nama Tidak Boleh Kosong");
        }else  if (umur <=17){
            System.out.println("Maaf Umur Anda Belum Mencukupi");
        }else {
            System.out.println("--Pilih Jurusan--");
            System.out.println("1. Teknik Informatika ");
            System.out.println("2. Sistem Informatika ");
            System.out.println("3. Rekayasa Perangkat Lunak" );
            System.out.print("Masukan Pilihan : ");
            Pilih = Dhiyaa.nextInt();
            if (Pilih ==1){
                System.out.println("== Data Pendaftaran ==");
                System.out.println("Nama    : " + nama );
                System.out.println("Umur    : " + umur );
                System.out.println("Jurusan : Teknik Informatika");
            } else if (Pilih == 2) {
                System.out.println("== Data Pendaftaran ==");
                System.out.println("Nama    : " + nama );
                System.out.println("Umur    : " + umur );
                System.out.println("Jurusan : Sistem Informasi");
            } else if (Pilih == 3) {
                System.out.println("== Data Pendaftaran ==");
                System.out.println("Nama    : " + nama );
                System.out.println("Umur    : " + umur );
                System.out.println("Jurusan : Rekayasa Perangkat Lunak:");
                } else {
                System.out.println("Program eror , Pilihan tidak tersedia");
            }
        }
    }
}

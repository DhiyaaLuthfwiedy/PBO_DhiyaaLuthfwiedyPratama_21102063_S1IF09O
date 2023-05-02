package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan3;
import java.util.Scanner;
public class mainbuku {

    public static void main(String[] args) {

        Buku pertama = new Buku(70000, "Pemrograman Berbasis Objek dengan Java", 1, "Indrajani", 2007);
        Buku kedua = new Buku(30000, "Dasar Pemrograman Java",2, "Abdul Kadir", 2004);

        System.out.println("=== LIST TOKO BUKU DHIYAA ===");
        pertama.detail_buku();
        kedua.detail_buku();
        System.out.println();

        System.out.println("=== PEMBELIAN TOKO BUKU DHIYAA ===");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nomor buku yang ingin dibeli : ");

        int nomorBuku = input.nextInt();

        System.out.print("Masukan jumlah buku yang ingin dibeli : ");

        int jumlahBuku = input.nextInt();

        int totalHarga = 0;

        if(nomorBuku == pertama.getNo_buku()){ totalHarga = jumlahBuku*
                pertama.getHarga();
            System.out.println("Total harga : " + totalHarga);
        }else if(nomorBuku == kedua.getNo_buku()){ totalHarga = jumlahBuku*
                kedua.getHarga();
            System.out.println("Total harga : " + totalHarga);
        }else{
            System.out.println("Nomor buku yang dimasukan salah");
        }
        System.out.println();

        System.out.println("=== PEMBAYARAN TOKO BUKU DHIYAA ===");
        System.out.print("Jumlah Bayar : ");

        int jumlahBayar = input.nextInt();

        if(jumlahBayar >= totalHarga){
            int kembalian = jumlahBayar - totalHarga;

            System.out.println("Kembalian : " + kembalian);
                    System.out.println("Terima Kasih telah berbelanja di toko kami");
        }else{
            System.out.println("Jumlah bayar kurang!");
        }
    }
}



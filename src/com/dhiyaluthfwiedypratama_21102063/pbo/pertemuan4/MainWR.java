package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan4;
import java.util.Scanner;
public class MainWR {
    public static void main(String[] args) {

        System.out.println("NAMA : Dhiyaa Luthfwiedy Pratama");
        System.out.println("NIM  : 21102063");
        System.out.println();

        Scanner input = new Scanner(System.in);
        WarungMakan wm = new WarungMakan();
        MenuextendsWarungMakan m = new MenuextendsWarungMakan();
        MenuextendsWarungMakan m1 = new MenuextendsWarungMakan();
        MenuextendsWarungMakan m2 = new MenuextendsWarungMakan();
        MenuextendsWarungMakan m3 = new MenuextendsWarungMakan();

        wm.nama_warung = " Warung Mas Gudday ";
        wm.alamat = " Purwokerto ";
        wm.no_telp = " 0858115218281 ";

        m1.no_makanan = 1;
        m1.nama_makanan = "Nasi Goreng";
        m1.harga = 10000;
        m1.Stok = 10;

        m2.no_makanan = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga = 15000;
        m2.Stok = 4;

        m3.no_makanan = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga = 20000;
        m3.Stok = 20;

        wm.detailwarung();
        m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();

        System.out.println("Masukkan Nomor Makanan : ");
        m.no_makanan = input.nextInt();
        if (m.no_makanan == 1){
            System.out.println("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalharga();
            wm.cekStok(m1);

        } else if (m.no_makanan == 2){
            System.out.println("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalharga();
            wm.cekStok(m2);

        } else if (m.no_makanan == 3){
            System.out.println("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalharga();
            wm.cekStok(m3);

        }
        input.close();
    }
}

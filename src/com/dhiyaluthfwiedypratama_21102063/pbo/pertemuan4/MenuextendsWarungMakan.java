package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan4;

public class MenuextendsWarungMakan extends WarungMakan {
    int Stok;
    int harga;
    String nama_makanan;
    int no_makanan;

    public void detailMakanan(){
        System.out.println("No Makanan      : " + no_makanan);
        System.out.println("Nama Makanan    : " + nama_makanan);
        System.out.println("Harga           : " + harga);
        System.out.println("Stok            : " + Stok);
        System.out.println();
    }

    public void totalharga(){
        System.out.println("Total Harga     : " + harga);
        System.out.println();
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int stok) {
        Stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public int getNo_makanan() {
        return no_makanan;
    }

    public void setNo_makanan(int no_makanan) {
        this.no_makanan = no_makanan;
    }
}

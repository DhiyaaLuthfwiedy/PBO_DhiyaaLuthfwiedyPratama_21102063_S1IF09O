package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan4;

public class WarungMakan {
    String no_telp;
    String nama_warung;
    String alamat;

    public void detailwarung(){
        System.out.println("==== Warung Makan Sederhana ====");
        System.out.println(" Nama Warung : " + nama_warung);
        System.out.println(" Alamat      : " + alamat);
        System.out.println(" No Telpon   : " + no_telp);
        System.out.println();
    }

    public void cekStok(MenuextendsWarungMakan m){
        if (m.no_makanan == 1) {
            System.out.println("Stok Nasi Goreng : " + m.Stok);
        } else if (m.no_makanan == 2) {
            System.out.println("Stok Nasi Goreng Spesial : " + m.Stok);
        } else if (m.no_makanan == 3) {
            System.out.println("Stok Nasi Goreng Spesial + Telur : " + m.Stok);
        }
        System.out.println();
    }

    public void beliMakanan(MenuextendsWarungMakan m, int jumlah) {
        if (jumlah >= m.Stok) {
            System.out.println("Stok Tidak Cukup!!!");
        } else {
            System.out.println("<<<< Detail Pembelian >>>>");
            System.out.println();
            System.out.println("Nama Makanan    : " + m.nama_makanan);
            System.out.println("Harga           : " + m.harga);
            System.out.println("Jumlah          : " + jumlah);
            m.harga = m.harga * jumlah;
            m.Stok -= jumlah;
        }
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getNama_warung() {
        return nama_warung;
    }

    public void setNama_warung(String nama_warung) {
        this.nama_warung = nama_warung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}


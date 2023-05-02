package com.dhiyaluthfwiedypratama_21102063.pbo.pertemuan3;

public class main {
    public static void main(String[] args) {

        SepedaMotor suzuki = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();
        SepedaMotor honda = new SepedaMotor();

//       suzuki.merek = "Suzuki";
//        suzuki.tipe = "GSX 150R";
//        suzuki.harga = 20000000;

//        yamaha.merek = "Yamaha";
//        yamaha.tipe = "YZF R15";
//        yamaha.harga = 25000000;

//        honda.merek = "Honda";
//        honda.tipe = "CBR 150R";
//        honda.harga = 23500000;

//        suzuki.showInfo();
//        yamaha.showInfo();
//        honda.showInfo();

        SepedaMotor vespa = new SepedaMotor("vespa","Vespa Matic",400000);

        System.out.println("Motor Merek : " + vespa.getMerek()+ "Dengan tipe(before) :" +vespa.getTipe());

        //melakukan proses perubahan
        vespa.setTipe("Sprint");

        //lihat hasil perubahan
        System.out.println("Motor Merek : " + vespa.getMerek() + "Dengan tipe(after):" + vespa.getTipe());
    }


}


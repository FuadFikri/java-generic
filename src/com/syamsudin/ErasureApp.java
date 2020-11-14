package com.syamsudin;

public class ErasureApp {
    /*
    proses pengecekan generic dilakukan saat compile
    * By default, ketika compile, seluruh generic akan diubah menjadi object
    * */

    public static void main(String[] args) {
//        DONT
//        TIDAK MENULISKAN TYPE
        MyData myData = new MyData("fikri");

        MyData<Integer> integerMyData = (MyData<Integer>) myData; //PAKSA KONVERSI
        Integer integer = integerMyData.getData(); // bisa compile ERROR SAAT RUNTIME


//        DO
//        tulis tipenya
        MyData<String> myData2 = new MyData<>("fikri");
//        error tidak bisa compile. karena tidak bisa diganti ke integer
//        MyData<Integer> integerMyData2 = (MyData<Integer>) myData2; //

    }
}

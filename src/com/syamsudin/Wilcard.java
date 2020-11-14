package com.syamsudin;

public class Wilcard {
/*
tidak peduli dgn generic parameter type
misal kita hanya ingin print, tidak peduli apa tipenya

* */
    public static void main(String[] args) {
        cetak(new MyData<>(99));
        cetak(new MyData<>("hahaah"));
        cetak(new MyData<>(true));
        cetak(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void cetak(MyData<?> data){
        Object x = data.getData();
        System.out.println(data.getData());
    }
}

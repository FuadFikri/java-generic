package com.syamsudin;

public class CovariantApp {
//    Covariant : kita bisa melakukan substitusi child dgn parent
//    agar generic object menjadi covariant, adalah dengan menggunakan  ? extends ParentClass
//    Covariant : read only. tidak bisa dibuah datanya
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("halo !");
        process(stringMyData);

        MyData<? extends  Object> myData = stringMyData;
    }

    public static void process(MyData<? extends  Object> data) {
        System.out.println(data.getData());
    }
}

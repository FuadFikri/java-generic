package com.syamsudin;

public class ContravariantApp {

//    COVARIANT : child ke parent
//    COntravariant : parent ke child
//    ? super SubClass
//     saat kita membuat object Contoh<Object> , maka bisa disubtitusi menjadi Contoh<? super String>

    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("opopopop");
//        karena string adalah subclass dari Object
        MyData<? super String> myData = objectMyData;

        process(objectMyData);

    }
//  ? super String : apapun yg jadi parentnya si string
    public static void process(MyData<? super String> myData){
        Object value = myData.getData();
        System.out.println(value);
    }
}

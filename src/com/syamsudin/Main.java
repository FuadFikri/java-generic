package com.syamsudin;

public class Main {

    public static void main(String[] args) {

//        1 generic
        MyData<String> dataString = new MyData<String>("Hello ");
        MyData<Integer> dataInteger = new MyData<>(10);

        String stringValue = dataString.getData();
        Integer intValue = dataInteger.getData();

        System.out.println(stringValue);
        System.out.println(intValue);


//        2 generic
        Pair<String,String> pair1 = new Pair<>("name","fikri");
        System.out.println(pair1.getKey() + "=" + pair1.getValue());

        Pair<String,Integer> pair2 = new Pair<>("id",10);
        System.out.println(pair2.getKey() + "=" + pair2.getValue());

//      generic method

        String[] names = {"fuad","fikri","syamsudin"};
        Integer[] numbers = {90,2,3,223,4,24,2,5};
        System.out.println(
                ArrayHelper.count(names)
        );
        System.out.println(
                ArrayHelper.count(numbers)
        );

  //    INVARIANT
    /*
    secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah variant
    invariant : tidak boleh di substitusi dengan child ataupun parent
    * */

        MyData<String> stringMyData = new MyData<>("halo");
//        doIt(stringMyData);  //INVARIANT -> ERROR

        MyData<Object> objectMyData = new MyData<>(90);
//        MyData<Integer> integerMyData = objectMyData;  //ERROR INVARIANT
    }


    public static void doIt(MyData<Object> objectMyData){
//        do something
    }
}

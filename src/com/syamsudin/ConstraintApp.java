package com.syamsudin;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(10);
        NumberData<Long>  longNumberData = new NumberData<>(190L);

//        NumberData<String> stringNumberData = new NumberData<String>("satu");  TIDAK BISA


    }


//    Membatasi tipe data
//    HANYA BOLEH NUMBER DAN TURUNANNYA
    public static class NumberData<T extends  Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData()
        {
//            Keuntungan pake extends number, bisa akses method2 nya si Number
            data.intValue();
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}

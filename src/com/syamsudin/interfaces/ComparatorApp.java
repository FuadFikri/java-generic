package com.syamsudin.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    /*
     * kapan menggunakan Comparator interface ?
     *  jika kita ingin mengurutkan class , tetapi class tersebut milik orang lain. didalam suatu library misalnya
     * */
    public static void main(String[] args) {


        Person[] people = {
                new Person(2,"Fikri"),
                new Person(9,"Rooney"),
                new Person(7, "Lionel"),
                new Person(79, "Andreas"),
                new Person(79, "Fikri")
        };


        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };

        Arrays.sort(people,comparator);
        System.out.println(Arrays.toString(people));


    }




}

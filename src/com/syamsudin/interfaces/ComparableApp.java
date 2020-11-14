package com.syamsudin.interfaces;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person(2,"Fikri"),
                new Person(9,"Rooney"),
                new Person(7, "Lionel"),
                new Person(79, "Andreas"),
                new Person(79, "Fikri")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));


        Person person1 = people[0];
        Person person2 = people[3];


        /*
        * a negative integer, zero, or a positive integer as this object
         *          is less than, equal to, or greater than the specified object.
        * */
        int res1 = person1.compareTo(person2);
        System.out.println(res1);

        Person person3 = people[1];
        Person person4 = people[2];
        int res2 = person3.compareTo(person4);
        System.out.println(res2);


    }
}

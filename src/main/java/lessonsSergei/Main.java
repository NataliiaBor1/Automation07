package lectionsSergei;

import java.security.PublicKey;
import java.util.Arrays;

public class Main {

    public static void printName(IName named) {
        System.out.println(named.getName());
    }

    public static void main(String[] args) {

        final int[] arr1 = {1,2,3};
        arr1[1] = 0;
//        arr = new int[]{0,9,8};
        System.out.println(Arrays.toString(arr1));

        //********************************************

        Person person = new Person("Sergey", 30);
        Pet pet = new Pet("dog", "Lucy");

        IName[] arr = {pet, person};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }

        printName(pet);
        printName(person);

    }

}

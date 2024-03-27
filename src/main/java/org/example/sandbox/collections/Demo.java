package org.example.sandbox.collections;
import java.util.*;
public class Demo {
    public static void main(String[] args) {


        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("howdy");
        set.add("hi");
        set.add("hola");

        set.forEach(System.out::println);
    }
}

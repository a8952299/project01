package com.atguigu;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Helloworld {

    private int i;

    public static void main(String[] args) {
        System.out.println("Hello World02 !!");

        ArrayList list = new ArrayList();
        list.add(0, 123);
        System.out.println(list.get(0));

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Test
    public void test() throws FileNotFoundException {
        i = 0;
        Date date = new Date();
        System.out.println(date);
        FileInputStream file = new FileInputStream("hello.txt");

    }
}
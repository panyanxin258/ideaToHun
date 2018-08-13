package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String name;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("helloworld!!!!");
        ArrayList list1 = new ArrayList();
        list1.add(1);
        System.out.println(list1);

    }

    public void play() {
        Date date = new Date();
    }
}

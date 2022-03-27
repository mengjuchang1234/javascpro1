package com.itheima;


import java.util.Scanner;
interface A {
    public void run();
}


class Test implements A{
    @Override
    public void run(){
        System.out.println("2");
    }
}

class Test2 {

    public static void main(String[] args) {
        A a= new Test();
        a.run();
    }

}
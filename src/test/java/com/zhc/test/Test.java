package com.zhc.test;

public class Test {

    public static void main(String[] args){
        String a = "a";
        String b = "b";

       if(!a.equals("b") || !b.equals("s")){
           System.out.println("123");
       }

        if((!a.equals("b")) || (!b.equals("s"))){
            System.out.println("222");
        }
    }

}

package com;

public class Test {



        public void setString(String s){
            s = "a";
            System.out.println("s的值为:"+s);

        }

        public static void main(String[] args) {
            String s0 = "aa";
            Test test= new Test();
            test.setString(s0);
            System.out.println("s0的值为:" + s0);
        }

    }

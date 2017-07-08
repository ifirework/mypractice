package com.wt.demo;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * Created by wang on 2017/7/7.
 */
public class Demo2 {


    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.setUserName("A");
        changeStatus(persion);
        System.out.println(persion.getUserName());
        boolean flag = true ;
        changeBoolenStatus(flag) ;
        System.out.println(flag);
    }
    public static void changeStatus(Persion p){
        p = new Persion() ;//p的指针指向新的地址
        p.setUserName("B");
    }
    public static void changeBoolenStatus(boolean b){
        b=false ;
    }
    protected static class Persion{
        private String userName ;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private int age ;


    }

}

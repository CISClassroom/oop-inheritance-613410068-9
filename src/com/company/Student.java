package com.company;

public class Student extends CIS {
    public  String name = "Owen";
    private  String id = "613410068-9";
    private  String cis = "วิทย์คอม";
    public  void main(String[] args) {
        // write your code here
        //System.out.println(university); // private -
        System.out.println(campus); // no modify
        System.out.println(facaulty); // protected #
        System.out.println(this.cis);
        System.out.println(super.cis); // public +
    }
}

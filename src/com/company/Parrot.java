package com.company;

public class Parrot {
    private String name;
    private String color;
    private int age;

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void getParrotSkill(){
        System.out.println(getName()+" can repeats");
    }


}

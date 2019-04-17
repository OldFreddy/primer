package com.example.myapplication;

enum Animal {

    DEER(5),
    DOG(5),
    CAT(1);

    private int age;

    Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

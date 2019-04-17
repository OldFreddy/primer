package com.example.myapplication;

public class Box {

    private static Box INSTANCE;

    private Box() {

    }

    public static Box getInstance() {
      throw new IllegalAccessException();
    }

}

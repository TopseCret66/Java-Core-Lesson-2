package com.company;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер не верный!");
    }
}

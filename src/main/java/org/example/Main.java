package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String example = "example";
        Class<?> clazz = example.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
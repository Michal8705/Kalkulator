package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


class Calculator{
    public int a;
    public int b;

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.add(1, 2);
        System.out.println(result);
    }
}

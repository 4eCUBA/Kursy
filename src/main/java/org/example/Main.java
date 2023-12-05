package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//1
        int a = 5;
        double b = 10.123121;
        byte c = 12;
        short d = 1;
        long e = 11111999;
        float f = 0.1F;
        char g = 'a';
        char g2 = 'b';
        boolean nn = true;
//2
        System.out.println(a+b);
        int h = c+d;
        System.out.println(h);
        System.out.println(e+f); //?
        var x = e+f;
        System.out.println(x); // nu i ladno
        System.out.println(b+f);
        System.out.println("double+float="+ b+f); // понятно
        System.out.println("double+float="+ (b+f));
        System.out.println(a-c);
        System.out.println(c*f);
        System.out.println(e/c);
        //3
        System.out.println("---------------3------------");
        System.out.println(sum(36, 323));
        System.out.println(minus(99, 105));
        umnogenie(a,b);
        chetNeChet(7);
        chetNeChet(1);
        chetNeChet(0);
        chetNeChet(48);

        //4
        chetNeChetScanner(); //тест 1
        chetNeChetScanner(); // тест 2
        chetNeChetScanner(); // тест 3
    }

    public static int sum(int a, int b){
        return a+b;
    };
    public static int minus(int a, int b){
        return a-b;
    }

    public static void umnogenie(int a, double b){
        System.out.println(a*b);
    };

    public static void chetNeChet (int a){
        if (a % 2 == 0)
            System.out.println("Четное");
        else
            System.out.println("Нечетное");
    };

    public static void chetNeChetScanner () {
        System.out.println("Введіть число");
        Scanner scanner = new Scanner(System.in);
        int kkk = scanner.nextInt();
        if (kkk % 2 == 0)
            System.out.println("Парне");
        else
            System.out.println("Не парне");
    }
    }
package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
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
        if (kkk % 2 == 0) {
            System.out.println("Парне");
        } else {
            System.out.println("Не парне");
        }
*/

 //1
        System.out.println("Задайте довжину масиву array:");
        Scanner s = new Scanner(System.in);
        int[] array = new int[s.nextInt()];
        int a = 3;
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++){
            array[i] = a*i;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
//2


        for (int i = 9; i > 0; i--) {
            System.out.println();
            for (int j = 9; j > 0; j--) {
                System.out.print(j + " * " + i + " = " + (j * i) + "    ");
                if (i*j<10){
                    System.out.print(" ");
                }
            }
        }

//3
        int [][] ar = new int[4][8];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 8; j++){
                ar[i][j] = i*j;
            }
        }
        for (int i = 0; i < 4; i++){
            System.out.println();
            for (int j = 0; j < 8; j++){
                if(ar[i][j]>2)
                System.out.print(ar[i][j] + " ");
            }
        }
        System.out.println();
//4 метод быстрой сортировки

        int[] sortIt = {11, 6, 3, 2, 1, 7, 15, 81};

        printArray(sortIt);
        quickSort(sortIt, 0, sortIt.length - 1);
        System.out.println();
        printArray(sortIt);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем подмассивы до и после опорного элемента
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Меняем элементы местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Меняем опорный элемент с элементом, находящимся после всех элементов, меньших опорного
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
/*
Быстрая сортировка:
Плюсы:
Высокая эффективность в среднем случае:  один из самых быстрых алгоритмов для сортировки больших массивов данных.
Хорошо поддается параллельной обработке: Быстрая сортировка может быть легко адаптирована для параллельной обработки.
Минусы:
Низкая эффективность: для частично отсортированных массивов
Не гарантированно стабильная сортировка: Порядок элементов с одинаковыми ключами может изменяться

Сортировка пузырьком:
Плюсы:
Простота реализации
Стабильность: Порядок элементов с одинаковыми ключами не изменится.
Минусы:
Низкая эффективность: для больших массивов и для частично отсортированных массивов

 */

}
    }
package com.epam.part1;
import java.math.BigInteger;
import java.util.Scanner;

// unit1 Introduction to Java EPAM
// 1_Basics_of_software_code_development
// Part 1 - Lines programs(tasks 1-6)
// Part 2 - Branching(task 7 - 11)
// Part 3 - Cycle(task 12 - 19)
// starting coding 13.07.2022 (5:19 PM)
// Ending coding 14.07.2022 (1:03 AM)
public class Main {

    public static void main(String[] args) {
        allTasks();
    } // show all tasks

    public static void allTasks() // archive all tasks
    {
        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
        task09();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
    }

    // part 1 Lines programs
    private static void task01() {
        System.out.println("Найдите значение функции : z = ((a-3)*b/2)+c");
        int a = 5;
        int b = 6;
        int c = 1;
        int z = ((a - 3) * b / 2) + c;
        System.out.println("Answer(1) : " + z);
    }

    private static void task02() {
        System.out.println("\nВычислить значение выражения по формуле" +
                " (все переменные принимают действительные значения)");
        int b = 5;
        int a = 4;
        int c = 1;
        double f = ((b + (Math.sqrt(((b * b) - (4 * a * c))))) / (2 * a)) - (Math.pow(a, 3) * c) + (Math.pow(5, -2));
        System.out.println("Answer(2) : " + f);
    }

    private static void task03() {
        System.out.println("\nВычислить значение выражения по формуле " +
                "(все переменные принимают действительные значения)");
        int x = 90;
        int y = 60;
        double f = (((Math.sin(x)) + (Math.cos(y))) / ((Math.cos(x)) - (Math.sin(y)))) * (Math.tan(x) * Math.tan(y));
        System.out.println("Answer(3) : " + f);
    }

    private static void task04() {
        System.out.println("\nДано действительное число R вида nnn.ddd " +
                "(три цифровых разряда в дробной и целой частях). Поменять местами\n" +
                "дробную и целую части числа и вывести полученное значение числа");
        double x = 123.456;
        double f = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println("Answer(4) : " + f);
    }

    private static void task05() {
        System.out.println("\nДано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести\n" +
                "данное значение длительности в часах, минутах и секундах в следующей форме:\n" +
                "ННч ММмин SSc");
        int T = 14393;
        int hours = T / 3600;
        int temp = T - (hours * 3600);
        int minutes = temp / 60;
        int seconds = temp - (minutes * 60);
        System.out.println("Answer(5) : " + hours + "ч " + minutes + "мин " + seconds + "c");
    }

    private static void task06() {
        System.out.println("\nДля данной области составить линейную программу, " +
                "которая печатает true, если точка с координатами (х, у) " +
                "принадлежит закрашенной области, и false — в противном случае");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите переменную x : ");
        int x = scanner.nextInt();
        System.out.print("Введите переменную y : ");
        int y = scanner.nextInt();
        if (y + Math.abs(x) <= 4 && y >= 0) {
            System.out.print("Answer(6) --- True: ");
        } else if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)) {
            System.out.print("Answer(6) --- True: ");
        } else if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)) {
            System.out.print("Answer(6) --- True: ");
        } else {
            System.out.print("Answer(6) --- False");
        }
        System.out.println();
    }

    // part 2 Branching
    private static void task07() {
        System.out.println("\nДаны два треугольника(в градусах). " +
                "Определить, существует ли такой треугольник," +
                "если да, то будет ли он прямоугольным.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите угол a : "); int a = scanner.nextInt();
        System.out.print("Введите угол b : "); int b = scanner.nextInt();
        int c = 180 - a - b;
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Да, треугольник существует.");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Да треугольник прямоугольный");
            }
        } else {
            System.out.println("Треугольника не существует");
        }
    }

    private static void task08() {
        System.out.println("\nНайти max{min(a, b), min(c, d)}");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a : "); int a = scanner.nextInt();
        System.out.print("Введите число b : "); int b = scanner.nextInt();
        System.out.print("Введите число c : "); int c = scanner.nextInt();
        System.out.print("Введите число d : "); int d = scanner.nextInt();
        int max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Результат : " + max);
    }

    private static void task09() {
        System.out.println("\nДаны три точки А(х1,у1), В(х2,у2) и С(х3,у3). " +
                "Определить, будут ли они расположены на одной прямой");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x1 : "); int x1 = scanner.nextInt();
        System.out.print("Введите координату y1 : "); int y1 = scanner.nextInt();
        System.out.print("Введите координату x2 : "); int x2 = scanner.nextInt();
        System.out.print("Введите координату y2 : "); int y2 = scanner.nextInt();
        System.out.print("Введите координату x3 : "); int x3 = scanner.nextInt();
        System.out.print("Введите координату y3 : "); int y3 = scanner.nextInt();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки лежат на одной плоскости.");
        } else System.out.print("Точки не лежат на одной плоскости.");
    }

    private static void task10() {
        System.out.println("\nЗаданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. " +
                "Определить, пройдет ли кирпич через отверстие.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер прямоугольного отверстия A : "); int a = scanner.nextInt();
        System.out.print("Введите размер прямоугольного отверстия B : "); int b = scanner.nextInt();
        System.out.print("Введите размер кирпича x : "); int x = scanner.nextInt();
        System.out.print("Введите размер кирпича y : "); int y = scanner.nextInt();
        System.out.print("Введите размер кирпича z : "); int z = scanner.nextInt();
        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Проходит");
        } else {
            System.out.print("Не проходит");
        }
    }

    private static void task11() {
        System.out.println("\nВычислить значение функции : ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x : "); int x = scanner.nextInt();
        if (x <= 3) {
            double f = Math.pow(x, 2) - 3 * x + 9;
            System.out.print("f(" + x + ")=  " + f);
        } else {
            double f = 1 / ((Math.pow(x, 3)) + 6);
            System.out.print("f(" + x + ")=  " + f);
        }
    }

    //part 3 Cycle
    private static void task12() {
        System.out.println("\nНапишите программу, где пользователь вводит любое целое положительное число. А программа суммирует\n" +
                "все числа от 1 до введенного пользователем числа.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а : "); int a = scanner.nextInt();
        int Sum = 0;
        for (int i = a; i >= 1; i--) Sum += i;
        System.out.println("Сумма : " + Sum);
    }

    private static void task13() {
        System.out.println("\nВычислить значения на отрезке [a,b] с шагом h:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a : "); int a = scanner.nextInt();
        System.out.print("Введите b : "); int b = scanner.nextInt();
        System.out.print("Введите шаг : "); double h = scanner.nextDouble();
        System.out.print("Введите x : "); int x = scanner.nextInt();
        int  y;
        for (double i = a; i <= b; i = i + h) {
            if (x > 2) {
                y = x;
            } else
                y = -x;
            System.out.println("x = "+ x + "\n" + "y = " + y);
        }
    }

    private static void task14() {
        System.out.println("\nНайти сумму квадратов первых ста чисел");
        int Sum = 0;
        for (int i = 1; i <= 100; i++) Sum += i * i;
        System.out.print("Сумма : " + Sum);
    }

    private static void task15() {
        System.out.println("\nСоставить программу нахождения квадратов первых двухсот чисел");
        BigInteger Sum = BigInteger.ONE;
        for (int i = 1; i <= 200; i++) {
            Sum = Sum.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.print("Квадраты первых двухсот чисел равны : " + Sum);
    }

    private static void task16(){
        System.out.println("\nДаны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен" +
                "заданному e. ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите e : "); double e =  scanner.nextDouble();
        int n = 0;
        double sum = 0;
        System.out.println("Print a series of common member series: ");
        for (int i = 0; i<=10; i++){
            ++n;
            System.out.print("\n");
            double a =  (1/Math.pow(2,n))+ (1/Math.pow(3,n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
                sum = sum+a;
            System.out.printf(" sum is %f", sum);
    }
 }

    private static void task17() {
        System.out.println("\nВывести на экран соответствий между символами и их численными обозначениями в памяти компьютера");
        // im use ASCII
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
    }

    private static void task18() {
        System.out.println("\nДля каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.\n" +
                "m и n вводятся с клавиатуры.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число m : "); int m = scanner.nextInt();
        System.out.print("Введите число n : "); int n = scanner.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print("\nЧисло " + i + " делится на - ");
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    System.out.print(" " + j);
                }
            }
        }
    }

    private static void task19() {
        System.out.println("\nДаны два числа. Определить цифры входящие в запись, как первого так и второго.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a : "); String a = scanner.nextLine();
        System.out.print("Введите число b : "); String b = scanner.nextLine();

        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        System.out.println("\nЦифры входящие в запись : ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print("|" + b.charAt(j));
                }
            }
        }
    }
}
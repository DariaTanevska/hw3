package hw3;

import java.util.Scanner;

public class Hw3ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 "Я тестирую замечательно. Что еще нужно?";
        System.out.println("Введіть текст:");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();
        scanner.close();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);


        System.out.println("========================");

        //2
        int a, b, c;
        System.out.println("Введіть три значення трикутника");
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());
        c = Integer.parseInt(scanner.next());
        if (a>0 && b>0 && c>0 && (a+b)>c && (b+c)>a) {
            System.out.println("трикутник можливо сконстроювати");
        } else {
            System.out.println("трикутник не можливо сконстроювати");
        }


        System.out.println("========================");

        //3
        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();
        int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        System.out.println("Разность двух чисел рівна: " + diff);


        System.out.println("==========================");


        //4
        System.out.println("введите день недели");
        int numberW = Integer.parseInt(scanner.next());
        if (numberW == 1) {
            System.out.println("Понедельник");
        } else if (numberW == 2) {
            System.out.println("Вторник");
        } else if (numberW == 3) {
            System.out.println("Среда");
        } else if (numberW == 4) {
            System.out.println("Четверг");
        } else if (numberW == 5) {
            System.out.println("Пятница");
        } else if (numberW == 6) {
            System.out.println("Суббота");
        } else if (numberW == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }


        System.out.println("========================");


        //5
        System.out.println("Введите два числа и символ арифметической операции:");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        char op = scanner.next().charAt(0);
        double result = 0;
        result = op == '+' ? a1 + b1 : op == '-' ? a1 - b1 : op == '*' ? a1 * b1 : op == '/' ? a1 / b1 : op == '%' ? a1 % b1 : 0;
        System.out.println("Результат: " + result);

        System.out.println("========================");


        //6

        System.out.println("Какая программа вам интересна? IntelliJ IDEA, Git или Java?");
        String program = scanner.nextLine();
        System.out.println("Какую ОС вы используете? Linux, macOS или Windows?");
        String os = scanner.nextLine();
        String link = "";
        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        link = "[IntelliJ IDEA для Linux](https://www.w3schools.com/java/java_switch.asp)";
                        break;
                    case "macOS":
                        link = "[IntelliJ IDEA для macOS](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)";
                        break;
                    case "Windows":
                        link = "[IntelliJ IDEA для Windows](https://www.geeksforgeeks.org/switch-statement-in-java/)";
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;
            case "Git":
                switch (os) {
                    case "Linux":
                        link = "[Git для Linux](https://www.programiz.com/java-programming/switch-statement)";
                        break;
                    case "macOS":
                        link = "[Git для macOS](https://dev.java/learn/language-basics/switch-statement/)";
                        break;
                    case "Windows":
                        link = "[Git для Windows]";
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;
            case "Java":
                switch (os) {
                    case "Linux":
                        link = "[Java для Linux]";
                        break;
                    case "macOS":
                        link = "[Java для macOS]";
                        break;
                    case "Windows":
                        link = "[Java для Windows]";
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;
            default:
                System.out.println("Такой программы не существует.");
                break;
        }
        if (!link.isEmpty()) {
            System.out.println("Вот ссылка для скачивания программы: " + link);
        }
    }
}

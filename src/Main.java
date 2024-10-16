public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 5
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i + " год является високосным");
            }
        }

        //Задание 6
        System.out.println("Задание 6");
        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 8
        System.out.println("Задание 8");
        int sum = 0;
        int contribution = 29000;
        for (int i = 1; i <= 12; i++) {
            sum += contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum);
        }

        //Задание 9
        System.out.println("Задание 9");
        float total = 0f;
        int salary = 29000;
        for (int i = 1; i <= 12; i++) {
            total += total /100;
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }

        //Задание 10
        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}
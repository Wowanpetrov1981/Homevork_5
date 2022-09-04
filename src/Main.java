public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
        System.out.println();
    }

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            System.out.println();
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                System.out.println();
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println();
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println();
        }
    } public static void task3 () {
        int year = 2013;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
            System.out.println();
        }
    }
    public static void task4 () {
        int deliveryDistance = 39;
        int deliveryInterval = 40;
        int countDay = (deliveryDistance - 20) / deliveryInterval + 2;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else {
            System.out.println("Потребуется дней: " + countDay);
            System.out.println();

        }
    } public static void task5 () {
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого месяца");


        }
    }
}



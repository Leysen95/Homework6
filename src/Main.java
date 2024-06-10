public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 2");
        int i = 10;
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        i = 0;
        for (; i <= 17; i = i + 2) {
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 4");
        i = 10;
        for (; i >= -10; i--) {
            System.out.print(i +  " ");
        }
        System.out.println();
        System.out.println("Task 5");
        i = 1904;
        for (; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Task 6");
        i = 0;
        for (; i <= 100; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 7");
        i = 1;
        for (; i <= 600; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 8-9");
        double total = 0;
        int deposite = 29000;
        double percentPerMonth = 1.01;
        for (int month = 1; month <= 12; month++) {
total += deposite;
total *= percentPerMonth;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month, total );
        }
        System.out.println("Task 10");
for (i = 1; i <= 10; i++) {
    System.out.printf("2 * %s = %s%n", i, i * 2);
}
    }
}
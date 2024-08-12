import java.time.Year;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }
    public static void task1(){
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }
    public static void task2(){
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--)
            System.out.println(i);
    }
    public static void task3(){
        System.out.println("Задача 3");
        for (int i = 0; i <=17; i = i+2)
            System.out.println(i);
    }
    public static void task4(){
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--)
            System.out.println(i);
    }
    public static void task5(){
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i+= 4)
            System.out.println(i+ " год является високосным");
    }
    public static void task6(){
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i+= 7)
            System.out.println(i);
    }
    public static void task7(){
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i*= 2)
            System.out.println(i);
    }
    public static void task8(){
        System.out.println("Задача 8");
        int total = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++) {
            total += deposit;
            System.out.println("Месяц " + i+ ", сумма накоплений равна " + total+ "рублей");
        }
    }
    public static void task9(){
        System.out.println("Задача 9");
        double sum = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++) {
            sum = sum + sum/100 + deposit;
            System.out.printf("Месяц %d, сумма накомлений равна %.2f рублей \n", i, sum);
        }
    }
    public static void task10(){
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            int num = 2;
            int res = num*i;
            System.out.println(num+"*"+i+"="+res);
        }
    }
    public static void task11() {
        System.out.println("Задача 11");
        int sum = 0;
        int deposit = 15000;
        int monthCount = 0;
        while (sum < 2459000){
            sum = sum + deposit;
            monthCount++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", monthCount, sum);
    }
    public static void task12() {
        System.out.println("Задача 12");
        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (i = 10; i >=1; i--){
            System.out.print(i+" ");
        }
    }
    public static void task13(){
        System.out.println();
        System.out.println("Задача 13");
        int birthRate = 12000*17;
        int mortalityRate = 8*12000;
        int population = 12000000;
        for (int i = 1; i <=10; i++){
            population = population + birthRate - mortalityRate;
            System.out.printf("Год %d, численность населения составляет %d\n", i, population);
        }
    }
    public static void task14(){
        System.out.println("Задача 14");
        double deposit = 15000;
        for (int i=1; deposit <= 12000000; i++){
            deposit = deposit + (deposit/100)*7;
            System.out.printf("Месяц %d, сумма накоплений - %.2f рублей\n", i, deposit);
        }
    }
    public static void task15(){
        System.out.println("Задача 15");
        double deposit = 15000;
        for (int i=1; deposit <= 12000000; i++){
            deposit = deposit + (deposit/100)*7;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений - %.2f рублей\n", i, deposit);
            }
        }
    }
    public static void task16(){
        System.out.println("Задача 16");
        double deposit = 15000;
        for (int i=1; i <= 12*9; i++){
            deposit = deposit + (deposit/100)*7;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений - %.2f рублей\n", i, deposit);
            }
        }
    }
    public static void task17(){
        System.out.println("Задача 17");
        int day =2;
        for (int i =1; i <=31; i++){
            if (i%7 == day){
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", i);
            }
        }
    }
    public static void task18(){
        System.out.println("Задача 18");
        int currentYear = Year.now().getValue();
        int yearBefore = currentYear-200;
        int yearAfter = currentYear+100;
        for (int year = yearBefore; year <= yearAfter; year++ ){
            if (year%79==0){
                System.out.println(year);
            }
        }
    }
}
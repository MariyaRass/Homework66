public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
      for (int i=0;i<11;i=i+1){
          System.out.println(i);}

        System.out.println("Задание 2");
        for (int i=10;i>0;i=i-1){
            System.out.println(i);}

        System.out.println("Задание 3");
        for (int i=0;i<17;i=i+2){
            System.out.println(i);}

        System.out.println("Задание 4");
        for (int i=10;i>-11;i=i-1){
            System.out.println(i);}

        System.out.println("Задание 5");
        for (int i=1904;i<2096;i=i+4){
            System.out.println("Вискокосный год " + i);}

        System.out.println("Задание 6");
        for (int i=7;i<99;i=i+7){
            System.out.println(i);}

        System.out.println("Задание 7");
        for (int i=1;i<513;i=i*2){
            System.out.println(i);}

        System.out.println("Задание 8");
            int contribution = 29000;
            int total = 0;
            for (int i=0;i<12;i=i+1){
                total = total+contribution;
                System.out.println("Месяц " + i + ". Сумма накоплений равна " + total);}

        System.out.println("Задание 9");
        int salary = 29000;
        double savings = 0;
        for (int i = 0; i < 12; i++) {
            savings = savings + (savings*0.01);
            savings = savings + salary;
            System.out.println("Месяц " + i + " Итого " + savings);}

        System.out.println("Задание 9");
        int mult1 = 2;
        for (int i = 1; i <= 10; i++) {
            int mult = 2 * i;
            System.out.println(mult1 + "*" + i + "=" + mult);}






    }
}
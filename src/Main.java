public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println(" Задание 1 ");
        {
            for (int i = 0; i <= 10; i++)
                System.out.println(" Иттерация цикла " + i);
        }
        //Задание 2
        System.out.println(" Задание 2 ");
        {
            for (int i = 10; i >= 0; i--)
                System.out.println(" Иттерация цикла " + i);
        }
        //Задание 3
        System.out.println(" Задание 3 ");
        {
            for (int i = 0; i < 17; i += 2)
                System.out.println(" Иттерация цикла " + i);
        }
        //Задание 4
        System.out.println(" Задание 4 ");
        {
            for (int i = 10; i >= -10; i--)
                System.out.println(" Иттерация цикла " + i);
        }
        //Задание
        System.out.println(" Задание високосный год ");
        {
            for (int i = 2020; i <= 2070; i = i + 4)
                System.out.println(" високосный год " + i);
        }
        //Задание 2.1
        System.out.println(" Задание 2.1 ");
        {
            for (int i = 1904; i <= 2096; i = i + 4)
                System.out.println(i + " год является високосным");
        }
        //Задание 2.2
        System.out.println(" Задание 2.2 ");
        {
            for (int i = 7; i <= 98; i = i + 7)
                System.out.println(i);
        }
        //Задание 2.3
        System.out.println(" Задание 2.3 ");
        {
            for (int i = 1; i <= 512; i = i * 2)
                System.out.println(i);
        }
        //Задание
        System.out.println(" Задание пример ");
        int salary = 65535;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        //Задание 3.1
        System.out.println(" Задание 3.1 ");
        int salary0 = 29000;
        int total0 = 0;
        for (int i = 1; i <= 12; i++) {
            total0 = total0 + salary0;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total0 + " рублей. ");
        }
        //Задание 3.2
        System.out.println(" Задание 3.2 ");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total1 + " рублей. ");
        }
        // Циклы 2
        //Задание 1.1
        System.out.println(" Задание 1.1 ");
        double salary2 = 15000.0;
        double total2 = 0.0;
        int i = 1;
        while (total2 < 2459000) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            System.out.println("Месяц " + i++ + " , сумма накоплений равна " + total2 + " рублей. ");
        }
        {
            System.out.println(" Количество месяцев, необходимых для накопления данной суммы " + i++);
        }
        //Задание 2.1
        System.out.println(" Задание 2.1 ");
        int i1 = 1;
        while (i1 <= 10) {
            System.out.print(i1++ + " ");
        }
        {System.out.println("  ");}
        for (int i2 = 10; i2 >= 1; i2--) {
            System.out.print(i2 + " ");
        }
        {
            System.out.println("  ");
        }
        //Задание 3.1
        System.out.println(" Задание 3.1 ");
        int countryPopulationY = 12_000_000;
        int populationGrowth = 17;
        int mortality = 8;
        for (int i3 = 1; i3 <= 10; i3++) {
            countryPopulationY = ((populationGrowth - mortality )*12000) + countryPopulationY ;
            System.out.println("Год " + i3 + " , численность населения составляет  " + countryPopulationY );}
        //Задание 1.2
        System.out.println(" Задание 1.2 ");
        int salary3 = 15000;
        int i4 = 1;
        for ( ;salary3 <= 12_000_000; i4 ++ ) {
            salary3 = salary3  + salary3 / 100 * 7;
            System.out.println("Месяц " + i4 + " , сумма накоплений равна " + salary3 + " рублей. ");
        }
        {
            System.out.println(" Количество месяцев, необходимых для накопления данной суммы " + i4  );
        }
        //Задание 2.2
        System.out.println(" Задание 2.2 ");
        int salary4 = 15000;
        int i5 = 1;
        for ( ;salary4 <= 12_000_000; i5 ++ ) {
            salary4 = salary4  + salary4 / 100 * 7;
            if (i5 % 6 == 0) {
                System.out.println("Месяц " + i5 + " , сумма накоплений равна " + salary4 + " рублей. ");
            }
            //Задание 3.2
            System.out.println(" Задание 3.2 ");
            int salary5 = 15000;
            int i6 = 1;
            for ( ;i6 <= 12*9; i6 ++ ) {
                salary5 = salary5 + salary5 / 100 * 7;
                if (i6 % 6 == 0) {
                    System.out.println("Месяц " + i6 + " , сумма накоплений равна " + salary5 + " рублей. ");
                }
                //Задание 4.2
                System.out.println(" Задание 4.2 ");
                for (int i7 = 5; i7 <= 31; i7 +=7) {
                    System.out.println("Сегодня пятница, " + i7 + "-е число. Необходимо подготовить отчет.");
                    if (i7 % 5 == 5)
                        System.out.println("Сегодня пятница, " + i7 + "-е число. Необходимо подготовить отчет.");
                }
                //Задание 1.3
                System.out.println(" Задание 1.3 ");
                for (int i8 = 1820; i8 < 2122; i8 +=79){
                    System.out.println( i8 );
                }
                //Задание 2.3
                System.out.println(" Задание 2.3 ");
                int n = 2;
                for (int i9 = 1 ; i9 <= 10; i9 ++ ){
                    System.out.println( n + " * " + i9 + " = " + n * i9);
                }}
            }
    }
}
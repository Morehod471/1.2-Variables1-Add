public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 47;
        int b = 13;
        int c = a/b;
        int d = a % b;
        System.out.println("Результат деления " + c + " остаток " + d);
    }


    private static void task2() {
        System.out.println("Задача 2");
        int a = 13;
        int b = a % 10;
        int c = a / 10;
        System.out.println("Сумма цифр двузначного числа " + a + " равна " + (b + c));
    }

    private static void task3() {
        System.out.println("Задача 3");
        int a = 345;
        int b = a % 100;
        int c = b % 10;
        int d = b / 10;
        int e = a / 100;
        System.out.println("Сумма цифр числа " + a + " равна " + ( c + d + e ));
    }

    private static void task4() {
        System.out.println("Задача 4");
        int flowerBouquet = 4899;
        int postcard = 157;
        int purchase = flowerBouquet + postcard;
        float discount = purchase / 10f;
        float purchaseWithoutDiscount = purchase - discount;
        System.out.println("Сумму двух покупок с учетом скидки составляет " + purchaseWithoutDiscount);
        System.out.println("Сумма скидки составляет " + discount);
    }

    private static void task5() {
        System.out.println("Задача 5");
        //Task 1
        int orangePrice = 73;
        int orangeDiscount = 15;
        float orangePriceDiscount = orangePrice * (1 - orangeDiscount / 100f);
        int bananaPrice = 95;
        int orangeWeight = 10;
        int bananaWeight = 2;
        float totalPrice = orangePriceDiscount * orangeWeight + bananaPrice * bananaWeight;
        System.out.println("Сумма покупок с учётом скидки " + totalPrice);
        //Task 2
        int champagnePrice = 2870;
        int champagneDiscount = 50;
        float champagnePriceDiscount = champagnePrice * (1 - champagneDiscount / 100f);
        int breadPrice = 27;
        int champagneAmount = 7;
        int breadAmount = 1;
        float totalPrice2 = champagnePriceDiscount * champagneAmount + breadPrice * breadAmount;
        System.out.println("Сумма покупок с учётом скидки " + totalPrice2);
        //Task 3
        int championsPrice = 436;
        int whiteMushroomsPrice = 578;
        int whiteMushroomsDiscount = 5;
        float whiteMushroomsPriceDiscount = whiteMushroomsPrice * (1 - whiteMushroomsDiscount / 100f);
        float championsWeight = 2.5f;
        float whiteMushroomsWeight = 3.75f;
        float totalPrice3 = (championsPrice * championsWeight + whiteMushroomsPriceDiscount * whiteMushroomsWeight);
        System.out.println("Сумма покупок с учётом скидки " + totalPrice3);
    }

    private static void task6() {
        System.out.println("Задача 6");
        double x = 0.40;
        double y = 0.87;
        double a = 11 * x + y;
        System.out.println(a);
        double b = (x + 10 * y) - 15 * (x / y);
        System.out.println(b);
    }
}

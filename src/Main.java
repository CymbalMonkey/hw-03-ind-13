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
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte apples = 58;
        System.out.println("Значение переменной apple c типом byte равно " + apples);
        short hours = 25000;
        System.out.println("Значение переменной hours с типом short равно " + hours);
        int likes = 3675894;
        System.out.println("Значение переменной likes с типом int равно " + likes);
        long meters = 5;
        System.out.println("Значение переменной meters с типом long равно " + meters);
        float daysLeft = 19.745f;
        System.out.println("Зачение переменной daysLeft с типом float равно " + daysLeft);
        double kilograms = 35.293867;
        System.out.println("Значение переменной kilograms с типом double равно " + kilograms);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        short studentsLP = 23;
        short studentsAS = 27;
        short studentsYeA = 30;
        int totalStudents = studentsLP + studentsAS + studentsYeA;
        short totalSheets = 480;
        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        short bottleOutputRate = 16 / 2;
        int outputIn20Min = bottleOutputRate * 20;
        System.out.println("За 20 минут машина произвела " + outputIn20Min + " штук бутылок");
        int outputPerDay = bottleOutputRate * 60 * 24;
        System.out.println("В сутки машина произвела " + outputPerDay + " штук бутылок");
        int outputIn3Days = outputPerDay * 3;
        System.out.println("За 3 дня машина произвела " + outputIn3Days + " штук бутылок");
        int outputPerMonth = outputPerDay * 30;
        System.out.println("За 1 месяц машина произвела " + outputPerMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        short totalPaintCans = 120;
        short whitePerClass = 2;
        short brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;
        int totalClasses = totalPaintCans / cansPerClass;
        int totalWhite = whitePerClass * totalClasses;
        int totalBrown = brownPerClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        short bananaUnit = 80;
        short milkUnit = 105;
        short iceCreamUnit = 100;
        short eggUnit = 70;
        int totalBanana = bananaUnit * 5;
        int totalMilk = milkUnit * 2;
        int totalIceCream = iceCreamUnit * 2;
        int totalEgg = eggUnit * 4;
        int totalWeightG = totalBanana + totalMilk + totalIceCream + totalEgg;
        System.out.println("Вес завтрака составляет " + totalWeightG + " граммов");
        int gPerKg = 1000;
        float totalWeightKG = totalWeightG / (float) gPerKg;
        System.out.println("Вес завтрака составляет " + totalWeightKG + " килограммов");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int weightToLoseKg = 7;
        int gPerKg = 1000;
        int weightToLoseG = weightToLoseKg * gPerKg;
        int lossRatePerDay1 = 250;
        int lossRatePerDay2 = 500;
        int daysLeft1 = weightToLoseG / lossRatePerDay1;
        System.out.println("В первом случае спортсмен похудеет за " + daysLeft1 + " дней");
        int daysLeft2 = weightToLoseG / lossRatePerDay2;
        System.out.println("Во втором случае спортсмен похудеет за " + daysLeft2 + " дней");
        int weightLossMean = (daysLeft1 + daysLeft2) / 2;
        System.out.println("В среднем спортсмен худеет за " + weightLossMean + " день");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        float payRaise = 0.1f;
        int mashaSalaryBefore = 67760;
        float mashaRaise = mashaSalaryBefore * payRaise;
        float mashaSalaryAfter = mashaSalaryBefore + mashaRaise;
        float mashaAnnualRaise = mashaRaise * 12;
        System.out.println("Маша теперь получает " + mashaSalaryAfter + " рублей. Годовой доход вырос на " + mashaAnnualRaise + " рублей");
        int denisSalaryBefore = 83690;
        float denisRaise = denisSalaryBefore * payRaise;
        float denisSalaryAfter = denisSalaryBefore + denisRaise;
        float denisAnnualRaise = denisRaise * 12;
        System.out.println("Денис теперь получает " + denisSalaryAfter + " рублей. Годовой доход вырос на " + denisAnnualRaise + " рублей");
        int christinaSalaryBefore = 76230;
        float christinaRaise = christinaSalaryBefore * payRaise;
        float christinaSalaryAfter = christinaSalaryBefore + christinaRaise;
        float christinaAnnualRaise = christinaRaise * 12;
        System.out.println("Кристина теперь получает " + christinaSalaryAfter + " рублей. Годовой доход вырос на " + christinaAnnualRaise + " рублей");
    }
}
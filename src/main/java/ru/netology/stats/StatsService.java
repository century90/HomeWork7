package ru.netology.stats;


public class StatsService {

    // 4) месяц с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 3) месяц с максимальными продажами (считается последний из месяцов)
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // 1) сумма всех продаж

    public int sumSales(long[] sales) {
        long sum = 0;
        long quantity = sales.length;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return (int) sum;

    }

    // 2) средняя сумма продаж в месяц
    public int avgSales(long[] sales) {

        return sumSales(sales) / sales.length;

    }

    // 5) количество месяцев, в которых продажи были ниже среднего
    public int monthWithBellowAvgSales(long[] sales) {

        int monthWithBellowAvgSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSales(sales)) {
                monthWithBellowAvgSales++;
            }
        }

        return monthWithBellowAvgSales;

    }

    // 5) количество месяцев, в которых продажи были выше среднего
    public int monthWithAboveAvgSales(long[] sales) {

        int monthWithAboveAvgSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSales(sales)) {
                monthWithAboveAvgSales++;
            }
        }

        return monthWithAboveAvgSales;

    }
}
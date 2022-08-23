package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void monthWithMinimumSales () {

        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthWithMaximumSales () {

        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void avaregeSales () {

        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 15;
        int actual = service.avgSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sumSales () {

        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthWithBellowAvgSales () {

        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.monthWithBellowAvgSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthWithAboveAvgService () {

        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.monthWithAboveAvgSales(sales);

        Assertions.assertEquals(expected, actual);

    }
}

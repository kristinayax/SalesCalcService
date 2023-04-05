package ru.netology.stats.statisticalservice.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SalesCalcServiceTest {

    @Test
    public void shouldCalcSummaryOfALlSales() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSummarySales = 180;
        int actualSummarySales = service.summaryOfALlSales(sales);

        Assertions.assertEquals(expectedSummarySales, actualSummarySales);
    }

    @Test
    public void shouldCalcAverageSalesAmount() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSales = 15;
        int actualAverageSales = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldCalcMonthOfMaxSales() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSale = 8;
        int actualMaxSale = service.monthOfMaxSales(sales);

        Assertions.assertEquals(expectedMaxSale, actualMaxSale);
    }

    @Test
    public void shouldCalcMonthOfMinSales() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSale = 9;
        int actualMinSale = service.monthOfMinSales(sales);

        Assertions.assertEquals(expectedMinSale, actualMinSale);
    }

    @Test
    public void shouldCalcNumberOfMonthWithSalesBelowAverage() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesBelowAverage = 5;
        int actualSalesBelowAverage = service.numberOfMonthWithSalesBelowAverage(sales);

        Assertions.assertEquals(expectedSalesBelowAverage, actualSalesBelowAverage);
    }

    @Test
    public void shouldCalcNumberOfMonthWithSalesUpperAverage() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesUpperAverage = 5;
        int actualSalesUpperAverage = service.numberOfMonthWithSalesUpperAverage(sales);

        Assertions.assertEquals(expectedSalesUpperAverage, actualSalesUpperAverage);
    }

}

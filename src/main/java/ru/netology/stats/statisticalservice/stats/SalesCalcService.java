package ru.netology.stats.statisticalservice.stats;

public class SalesCalcService {

    // сумма всех продаж
    public int summaryOfALlSales(int[] sales) {
        int summarySales = 0;// общая сумма продаж
        for (int sale : sales) {
            summarySales = sale + summarySales;
        }
        return summarySales;
    }

    // средняя сумма продаж в месяц
    public int averageSalesAmount(int[] sales) {
        return summaryOfALlSales(sales) / sales.length;
    }

    // номер месяца, в котором был пик продаж
    public int monthOfMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // номер месяца, в котором был минимум продаж
    public int monthOfMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int numberOfMonthWithSalesBelowAverage(int[] sales) {
        int numberOfMonth = 0; //количество месяцев с продажами ниже средних
        int average = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale < average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int numberOfMonthWithSalesUpperAverage(int[] sales) {
        int numberOfMonth = 0;
        int average = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale > average) {
                numberOfMonth = numberOfMonth + 1; //количество месяцев с продажами выше средних
            }
        }
        return numberOfMonth;
    }
}

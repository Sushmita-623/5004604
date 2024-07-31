package com.example.financial;

public class FinancialForecast {
    
    // Recursive method to calculate future value
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * predictFutureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10;

        double futureValue = predictFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}

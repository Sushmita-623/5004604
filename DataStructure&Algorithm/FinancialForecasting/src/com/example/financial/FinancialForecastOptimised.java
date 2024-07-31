package com.example.financial;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecastOptimised {
    
    // Map to store memoized values
    private static Map<Integer, Double> memo = new HashMap<>();
    
    // Recursive method to calculate future value with memoization
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double futureValue = (1 + growthRate) * predictFutureValue(presentValue, growthRate, years - 1);
        memo.put(years, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10;

        double futureValue = predictFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}

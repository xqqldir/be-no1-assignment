package com.example.calculator.Lv3;

import java.util.*;
import java.util.stream.Collectors;

public class ArithmeticCalculatorLv3<E extends Number> {
    private final List<Double> results = new ArrayList<>();

    public double calculate(E a, E b, OperatorType operator) {
        double result = operator.calculation(a.doubleValue(), b.doubleValue());
        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return this.results;
    }

    public void setResults(List<Double> newResults) {
        this.results.clear();
        this.results.addAll(newResults);
    }

    public void removeResults() {
        if (!results.isEmpty()) {
            results.remove(0);  // 가장 먼저 저장된 값 삭제
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }

    public List<Double> getResultsGreaterThan(double value) {
        return results.stream()
                .filter(r -> r > value)
                .collect(Collectors.toList());
    }
}
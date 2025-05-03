package com.example.calculator.Lv2;

import java.util.*;

public class CalculatorLv2 {
    private List<Integer> results = new ArrayList<>();;

    public int Claculator(int firstNum, int secondNum, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                }
                break;
            default:
                System.out.println("올바른 기호를 입력하세요.");
                break;
        }
        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        return this.results;
    }

    public void setResults(List<Integer> newResults) {
        this.results = newResults;
    }

    public void removeResults() {
        if (!results.isEmpty()) {
            results.remove(0);  // 가장 먼저 저장된 값 삭제
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }
}

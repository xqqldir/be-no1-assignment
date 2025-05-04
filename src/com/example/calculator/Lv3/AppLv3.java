package com.example.calculator.Lv3;

import java.util.Scanner;

public class AppLv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculatorLv3<Double> cal = new ArithmeticCalculatorLv3<>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            double firstNum = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            double secondNum = sc.nextDouble();

            if (firstNum < 0 || secondNum < 0) {
                System.out.println("0을 포함한 양의 정수를 입력하세요.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요 : "); // + - * /
            char operatorChar = sc.next().charAt(0);
            OperatorType operator = OperatorType.getOperatorType(operatorChar);

            if (operator == null) {
                System.out.println("잘못된 연산자입니다.");
                continue;
            }

            double result = cal.calculate(firstNum, secondNum, operator);
            System.out.println("결과 : " + result);

            System.out.print("비교할 숫자를 입력하세요 : ");
            double compare = sc.nextDouble();
            System.out.println("지금까지의 결과들 중 " + compare + " 보다 큰 값들: " + cal.getResultsGreaterThan(compare));

            String answer;
            while (true) {
                System.out.println("계속 계산하시겠습니까?\n yes : 계속하기\n exit : 종료하기");
                answer = sc.next();

                if (answer.equals("exit")) {
                    break;
                }
                else if (answer.equals("yes")){
                    break;
                }
                else System.out.println("올바른 값을 입력해주세요.");
            }

            if (answer.equals("exit")) {
                System.out.println("지금까지의 결과들: " + cal.getResults());
                break;
            }
        }
    }
}
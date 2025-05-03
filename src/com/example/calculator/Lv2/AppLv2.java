package com.example.calculator.Lv2;

import java.util.Scanner;

public class AppLv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorLv2 cal = new CalculatorLv2();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int firstNum = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int secondNum = sc.nextInt();

            if(firstNum < 0 || secondNum < 0){
                System.out.println("0을 포함한 양의 정수를 입력하세요.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요 : "); //+ - * /
            char operator = sc.next().charAt(0);

            int result = cal.Claculator(firstNum,secondNum,operator);
            System.out.println("결과 : " + result);


            String answer;
            while (true){
                System.out.println("계속 계산하시겠습니까?\n yes : 계속하기\n exit : 종료하기");
                answer = sc.next();

                if (answer.equals("exit")) {
                    break;
                } else if (answer.equals("yes")) {
                    break;
                } else {
                    System.out.println("올바른 값을 입력해주세요.");
                }
            }

            if(answer.equals("exit")){
                System.out.println("지금까지의 결과들: " + cal.getResults());
                break;
            }
        }
    }
}

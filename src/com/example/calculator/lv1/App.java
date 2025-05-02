package com.example.calculator.lv1;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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


            switch (operator) {
                case '+':
                    System.out.println("덧셈 결과 : " + (firstNum + secondNum));
                    break;
                case '-':
                    System.out.println("뺼셈 결과 : " + (firstNum - secondNum));
                    break;
                case '*':
                    System.out.println("곱셈 결과 : " + (firstNum * secondNum));
                    break;
                case '/':
                    if (secondNum != 0) {
                        System.out.println("나눗셈 결과 : " + (firstNum / secondNum));
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                    }
                    break;
                default:
                    System.out.println("올바른 기호를 입력하세요. ( + - * / )");
                    continue;
            }

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
                break;
            }
        }
    }
}

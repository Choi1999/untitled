package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true; // 계산을 계속할지 여부를 체크하는 변수

        while (continueCalculating) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double firstNumber = sc.nextInt(); //확장을 위해서 자료형 변경
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            double secondNumber = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.println("입력한 첫 번째 숫자: " + firstNumber);
            System.out.println("입력한 두 번째 숫자: " + secondNumber);
            System.out.println("입력한 연산자: " + operator);

            double result = 0; //결과값을 저장할 변수
            boolean validOperation = true; // 연산의 유효성을 체크하는 변수


            //연산자에 따른 계산을 수행하는 반복문
            if (operator == '+') {
                result = firstNumber + secondNumber;
            } else if (operator == '-') {
                result = firstNumber - secondNumber;
            } else if (operator == '*') {
                result = firstNumber * secondNumber;
            } else if (operator == '/') {
                if (secondNumber == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    validOperation = false; // 연산이 유효하지 않음을 표시
                } else {
                    result = firstNumber / secondNumber; // double로 나누기
                }
            } else {
                System.out.println("유효하지 않은 연산자입니다. +, -, *, / 중 하나를 입력하세요.");
                validOperation = false; // 연산이 유효하지 않음을 표시
            }

            //결과출력
            if (validOperation) {
                System.out.println("결과: " + result);
            }

            //진행 여부 확인
            char continueInput;
            do {
                System.out.print("계속하시겠습니까? (예: Y / 아니오: N): ");
                continueInput = sc.next().charAt(0);
                if (continueInput == 'N' || continueInput == 'n') {
                    continueCalculating = false; // 사용자가 'N' 또는 'n'을 입력하면 반복 종료
                } else if (continueInput != 'Y' && continueInput != 'y') {
                    System.out.println("잘못된 입력입니다. 'Y' 또는 'N'을 입력하세요.");
                }
            } while (continueInput != 'Y' && continueInput != 'y' && continueInput != 'N' && continueInput != 'n');

        }
        sc.close();
        System.out.println("계산 종료.");
    }
}
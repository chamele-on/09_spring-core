package com.ohgiraffers.section01;

public class Application {
    public static void main(String[] args) {

       Calculator calc = new Calculator();

       calc.checkMethod();
         int a = 10;
         int b = 20;

        System.out.println("더하기 결과 : " + calc.sumTwoNumber(a, b));
        System.out.println("빼기 결과 : " + calc.minusTwoNumber(a, 5));
        System.out.println("곱하기 결과 : " + calc.multipleTwoNumber(a, b));
        System.out.println("나누기 결과 : " + calc.nanugiTwoNumber(a, b));


    }

}

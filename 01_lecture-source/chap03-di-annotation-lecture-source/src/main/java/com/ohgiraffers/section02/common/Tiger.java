package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 가지를 먹는다");
    }
}

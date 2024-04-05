package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;
/* @Primary는 한 개 이상을 설정할 수 없다. */
@Component
public class Raccoon implements Animal{

    @Override
    public void eat() {
        System.out.println("너구리가 보노보노를 떄린다.");
    }
}

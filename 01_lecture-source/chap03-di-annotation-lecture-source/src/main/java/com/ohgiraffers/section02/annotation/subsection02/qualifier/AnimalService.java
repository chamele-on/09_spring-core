package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("animalQialifier")
public class AnimalService {

    /* 필기.
    *   @Qualifier 어노테이션은 여러 개의 Bean 객체 중에서 특정 Bean 객체를
    *   이름으로 지정하는 어노테이션이다.
    *   */

    /* 필드 주입 방식 */
//    @Autowired
//    @Qualifier
//    private Animal animal;



    /* 생성자 주입 방식 */

    private Animal animal;
    @Autowired

    public AnimalService(@Qualifier("raccoon")Animal animal) {
        this.animal = animal;

    }




}

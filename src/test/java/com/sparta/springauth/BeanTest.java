package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Qualifier("chicken")
    @Autowired
    Food food1;

    @Qualifier("pizza")
    @Autowired
    Food food2;
    @Test
    void test1() {
        food1.eat();
        food2.eat();
    }

}

package com.nero.springboot.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitApplicationTests {

    @DisplayName("1=2?")
    @Test
    void contextLoads() {
        assertEquals(1, 1);
    }

}

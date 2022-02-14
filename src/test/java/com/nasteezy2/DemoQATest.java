package com.nasteezy2;

import org.junit.jupiter.api.*;

public class DemoQATest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all the tests!\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before the test!\n");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After the test!\n");
    }

    @Test
    void firstTest() {
        System.out.println("I love you QA.GURU!\n"); // junit нужен для того, чтобы сказать некому ядру (main for ex), что является тестом, а что нет (тестом отмечено все, что отмечено @test)
    }

    @Test
    void secondTest() {
        System.out.println("I love you QA.GURU, second test!\n"); // junit нужен для того, чтобы сказать некому ядру (main for ex), что является тестом, а что нет (тестом отмечено все, что отмечено @test)
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("After all the tests!\n");
    }

}

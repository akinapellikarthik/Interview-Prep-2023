package com.karthik.demo;

import org.junit.jupiter.api.Test;

import java.util.List;


class OpenTextTest {

    @Test
    void findItems() {
        OpenText openText = new OpenText();
        System.out.println(openText.findItems(List.of("KA","ab","KS"),"ka"));
    }
}
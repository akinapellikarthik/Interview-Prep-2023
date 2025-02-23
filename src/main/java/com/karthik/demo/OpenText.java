package com.karthik.demo;

import java.util.List;

public class OpenText {

    public static void main(String[] args) {
        System.out.println("Hello World");
        OpenText openText = new OpenText();
        System.out.println(openText.findItems(List.of("ka","ab","KS"),"Ka"));
    }
    //"KA","AB","KAA"
    public List<String> findItems(List<String> inputItems, String match) {
        return inputItems
                .stream()
                .filter(item -> item.toLowerCase().contains(match.toLowerCase()))
                .map(String::toUpperCase)
                .toList();
    }

    //t1 -> odd print
    //t2 -> even print
}

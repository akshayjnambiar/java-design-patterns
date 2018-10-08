package com.akshay.design_patterns.chain_of_responsibility;

public class CEO extends Handler {
    public void handleRequest(Request request) {
        System.out.println("APPROVED BY CEO");
    }
}

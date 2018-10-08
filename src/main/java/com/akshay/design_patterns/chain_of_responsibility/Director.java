package com.akshay.design_patterns.chain_of_responsibility;

public class Director extends Handler {

    public void handleRequest(Request request) {
        if(request.getRequestType().equals(RequestType.CONFERENCE)){
            System.out.println("APPROVED BY DIRECTOR");
        } else {
            successor.handleRequest(request);
        }
    }
}

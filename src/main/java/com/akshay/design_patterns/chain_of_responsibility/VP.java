package com.akshay.design_patterns.chain_of_responsibility;

public class VP extends Handler{

    public void handleRequest(Request request) {
        if(request.getRequestType().equals(RequestType.PURCHASE)) {
            if(request.getAmount() < 1500) {
                System.out.println("APPROVED BY VP");
            }else {
                successor.handleRequest(request);
            }
        }
    }
}

package com.akshay.design_patterns.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request1 = new Request(RequestType.CONFERENCE, 500);
        Request request2 = new Request(RequestType.PURCHASE, 1000);
        Request request3 = new Request(RequestType.PURCHASE, 2000);


        director.handleRequest(request1);
        director.handleRequest(request2);
        director.handleRequest(request3);


    }
}

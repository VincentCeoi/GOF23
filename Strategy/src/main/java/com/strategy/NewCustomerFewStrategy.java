package com.strategy;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class NewCustomerFewStrategy implements Strategy{

    public double getPrice(double standarPrice) {
        System.out.println("不打折，原价！");
        return standarPrice;
    }
}

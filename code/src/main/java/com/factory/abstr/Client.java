/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.abstr;

/**
 *
 * @author ING MBAME MBAME
 */
public class Client {

    public static void main(String[] args) {
        IProductFactory productFactory1 = new ProductFactory1() {};
        IProductFactory productFactory2 = new ProductFactory2() {};

        ProductA productA = null;
        ProductB productB = null;

        System.out.println("Here, we are using the first Fabric");
        productA = productFactory1.getProductA();
        productB = productFactory1.getProductB();

        productA.methodA();
        productB.methodB();

        System.out.println("Here, we are using the second Fabric");
        productA = productFactory2.getProductA();
        productB = productFactory2.getProductB();

        productA.methodA();
        productB.methodB();

    }
}



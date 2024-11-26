/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.method;

/**
 *
 * @author ING MBAME MBAME
 */
public class ProductFactory {

    public static final String typeA = "A";
    public static final String typeB = "B";
    public static final String typeC = "C";

    public Product createProduct(String type) {
        Product product = null;
        switch (type) {
            case typeA:
                product = new ProductA();
                break;
            case typeB:
                product = new ProductB();
                break;
            case typeC:
                product = new ProductC();
                break;
            default:
                System.out.println("No such product");
                //throw new IllegalArgumentException("Unknown product type");
        }
        
        return product;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.method;

/**
 *
 * @author ING MBAME MBAME
 */
public class Client {
    public static void main(String[] args){
        System.out.println("Hello World");
        
        ProductFactory productfactory = new ProductFactory();
        Product product = null;
        
        //product A
        product = productfactory.createProduct(productfactory.typeA);
        product.productMethod();
        
        //product A
        product = productfactory.createProduct(productfactory.typeB);
        product.productMethod();
        
        //product A
        product = productfactory.createProduct(productfactory.typeC);
        product.productMethod();
        
        //error product
        String z = "Z";
        product = productfactory.createProduct(z);
        product.productMethod();
    }
}

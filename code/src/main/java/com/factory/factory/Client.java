/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.factory;

/**
 *
 * @author ING MBAME MBAME
 */
public class Client {
    public static void main(String[] args){
        System.out.println("_______Factory Method______");
        ProductFactory productfactoryA = new ProductFactoryA();
        ProductFactory productfactoryB = new ProductFactoryB();
        ProductFactory productfactoryC = new ProductFactoryC();
        Product product = null;
        
        //display A, B and C in order
        product = productfactoryA.getProduct();
        product.productMethod();
        
        product = productfactoryB.getProduct();
        product.productMethod();
        
        product = productfactoryC.getProduct();
        product.productMethod();
    }
}

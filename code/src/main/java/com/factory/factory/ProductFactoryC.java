/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.factory;

/**
 *
 * @author ING MBAME MBAME
 */
public class ProductFactoryC extends ProductFactory {
    protected Product createProduct(){
        Product product = null;
        product = new ProductC();
        return product;
    }
}


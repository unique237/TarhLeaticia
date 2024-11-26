/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.abstr;

/**
 *
 * @author ING MBAME MBAME
 */
public abstract class ProductFactory1 implements IProductFactory {
    public ProductA getProductA(){
        return new ProductA1();
    }
    
    public ProductB getProductB(){
        return new ProductB1();
    }
}

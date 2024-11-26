/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.abstr;

/**
 *
 * @author ING MBAME MBAME
 */
public abstract class ProductFactory2 implements IProductFactory {

    public ProductA getProductA(){
        return new ProductA2();
    }
    
    public ProductB getProductB(){
        return new ProductB2();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory.factory;

/**
 *
 * @author ING MBAME MBAME
 */
public abstract class ProductFactory {
    public Product getProduct(){
        return createProduct();
    }
    protected abstract Product createProduct();
}

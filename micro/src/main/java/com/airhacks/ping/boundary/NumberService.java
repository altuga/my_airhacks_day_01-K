/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ping.boundary;

/**
 *
 * @author altuga
 */
public class NumberService {
    
    public long getNumber() {
        return (long) (Math.random() * 10000) ; 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ping.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author altuga
 */
@Stateless
public class PingService {
    
    @Inject
    NumberService numberService;
    
    @Inject
    String prefix;
    
    public String getMessage() {
        return this.prefix + " PingService ----- - " + numberService.getNumber();
    }
            
           
         
    
}

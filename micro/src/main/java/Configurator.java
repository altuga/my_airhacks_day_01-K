
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author altuga
 */
public class Configurator {
    
    @Produces
    public String expose(InjectionPoint injectionPoint) {
        String fieldName = injectionPoint.getMember().getName();
        
        return System.getenv().getOrDefault(fieldName, System.getProperty(fieldName, "!!!"));
        
    }
    
}

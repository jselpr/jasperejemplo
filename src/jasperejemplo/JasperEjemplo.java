/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperejemplo;

import org.apache.log4j.Logger;



/**
 *
 * @author joselopezruiz
 */
public class JasperEjemplo {
    
    //initializing the logger
static Logger log = Logger.getLogger(JasperEjemplo.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //logging in different levels
        log.trace("This is a Trace");
        log.debug("This is a Debug");
        log.info("This is an Info");
        log.warn("This is a Warn");
        log.error("This is an Error");
        log.fatal("This is a Fatal");

    }
    
}

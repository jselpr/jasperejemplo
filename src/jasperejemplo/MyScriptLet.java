/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperejemplo;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/**
 *
 * @author joselopezruiz
 */
public class MyScriptLet extends JRDefaultScriptlet{
    public void afterReportInit() throws JRScriptletException
   {
      System.out.println("call afterReportInit()");
     // this.setVariableValue("AllCountries", sbuffer.toString());
      String somevar = (String)this.getVariableValue("someVar");
      if (somevar.equals("This is the initial variable value.")){
           this.setVariableValue("someVar", somevar.concat("This variable value was modified by the scriptlet."));
      }
   }

   public String hello() throws JRScriptletException
   {
      return "Hello! I'm the report's scriptlet object.";
   }
}

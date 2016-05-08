/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperejemplo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

/**
 *
 * @author joselopezruiz
 */
public class JasperReportCompileScritplet {
        public static void main(String[] args) {
      String sourceFileName = "/src/jasperejemplo/jasper_report_scriptlet.jrxml";

      System.out.println("Compiling Report Design ...");
       java.io.File file = new java.io.File("JasperReportCompile.java");
        String path = file.getAbsolutePath();
        String only_path = path.substring(0,path.lastIndexOf('/'));
        System.out.println(only_path);
      try {
         /**
          * Compile the report to a file name same as
          * the JRXML file name
          */
         JasperCompileManager.compileReportToFile(only_path+sourceFileName);
      } catch (JRException e) {
         e.printStackTrace();
      }
      System.out.println("Done compiling!!! ...");
   }
}

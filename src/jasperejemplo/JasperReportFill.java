/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperejemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author joselopezruiz
 */
public class JasperReportFill {
    @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      String sourceFileName = "/src/jasperejemplo/jasper_report_template.jasper";
       java.io.File file = new java.io.File("JasperReportCompile.java");
        String path = file.getAbsolutePath();
        String only_path = path.substring(0,path.lastIndexOf('/'));
        String absoluteSourceFileName = only_path + sourceFileName;
      DataBeanList DataBeanList = new DataBeanList();
      ArrayList<DataBean> dataList = DataBeanList.getDataBeanList();

      JRBeanCollectionDataSource beanColDataSource =
      new JRBeanCollectionDataSource(dataList);

      Map parameters = new HashMap();
      try {
         JasperFillManager.fillReportToFile(
         absoluteSourceFileName,
         parameters,
         beanColDataSource);
      } catch (JRException e) {
         e.printStackTrace();
      }
   }
}

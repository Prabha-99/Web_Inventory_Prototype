package com.example.wip_back.service;

import com.example.wip_back.model.User;
import com.example.wip_back.repository.userRepo;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private userRepo userrepo;

    public String exportReport(String format) throws FileNotFoundException, JRException {
        String reportPath = "F:\\Projects\\Wen_Inventory_Prototype\\Reports";// Declaring the Report path as a Global variable.
        List<User> users=userrepo.findAll();

        //Loading the .jrxml file and Compiling it
        File file= ResourceUtils.getFile("classpath:SystemUsers.jrxml");
        JasperReport jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());

        //Mapping List Data into the Report
        JRBeanCollectionDataSource source=new JRBeanCollectionDataSource(users);
        Map<String,Object> parameters=new HashMap<>();
        parameters.put("Created by","DPW pvt,Ltd");
        //Printing the Report
        JasperPrint print= JasperFillManager.fillReport(jasperReport,parameters,source);
        if(format.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(print,reportPath+"\\Users.html");
        }else{
            JasperExportManager.exportReportToPdfFile(print,reportPath+"\\Users.pdf");
        }
        return "Report generated Successfully at : "+reportPath;
    }
}

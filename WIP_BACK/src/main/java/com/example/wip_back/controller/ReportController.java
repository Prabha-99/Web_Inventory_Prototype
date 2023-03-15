package com.example.wip_back.controller;

import com.example.wip_back.repository.userRepo;
import com.example.wip_back.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;


@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private userRepo userrepo;

    @Autowired
    private ReportService reportService;

    @GetMapping("/userReport/{format}")
    public String generateReport(@PathVariable String format) throws JRException, FileNotFoundException {
        return reportService.exportReport(format);
    }
}

package com.demo.di.controllers;

import org.springframework.stereotype.Controller;

import com.demo.di.services.datasource.DataSourceService;

@Controller
public class DataSourceController {
    private final DataSourceService dataSourceService;

    public DataSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getSource() {
        return dataSourceService.getSource();
    }
}

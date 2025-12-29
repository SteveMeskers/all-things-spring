package com.demo.di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.di.controllers.DataSourceController;

@SpringBootTest
public class DataSourceControllerTestDev {
    @Autowired
    DataSourceController dataSourceController;

    @Test
    void getSource() {
        System.out.println(dataSourceController.getSource());
    }

}

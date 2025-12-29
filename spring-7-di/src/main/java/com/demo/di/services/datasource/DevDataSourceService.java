package com.demo.di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevDataSourceService implements DataSourceService {

    @Override
    public String getSource() {
        return "dev source";
    }

}

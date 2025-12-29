package com.demo.di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDataSourceService implements DataSourceService {

    @Override
    public String getSource() {
        return "prod source";
    }

}


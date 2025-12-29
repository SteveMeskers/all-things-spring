package com.demo.di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QADataSourceService implements DataSourceService {

    @Override
    public String getSource() {
        return "qa source";
    }

}

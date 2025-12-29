package com.demo.di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.demo.di.services.GreetingService;

@Profile({"en", "default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }

}

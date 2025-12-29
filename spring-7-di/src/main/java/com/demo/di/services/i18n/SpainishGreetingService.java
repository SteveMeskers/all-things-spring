package com.demo.di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.demo.di.services.GreetingService;

@Profile("es")
@Service("i18nService")
public class SpainishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }

}

package ru.netology.moneytransferservice.configapp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.moneytransferservice.profiles.DevProfiles;
import ru.netology.moneytransferservice.profiles.ProductionProfile;
import ru.netology.moneytransferservice.profiles.SystemProfile;

@Configuration
public class ConfigApp {
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfiles();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
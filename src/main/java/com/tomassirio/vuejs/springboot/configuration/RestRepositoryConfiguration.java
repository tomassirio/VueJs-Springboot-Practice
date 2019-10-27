package com.tomassirio.vuejs.springboot.configuration;

import com.tomassirio.vuejs.springboot.model.Todo;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
class RestRepositoryConfigurator implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Todo.class);
    }
}

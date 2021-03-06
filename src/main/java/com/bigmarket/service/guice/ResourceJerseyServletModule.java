package com.bigmarket.service.guice;

import com.bigmarket.service.controller.PingController;

import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class ResourceJerseyServletModule extends JerseyServletModule {

    @Override
    protected void configureServlets() {
        bind(PingController.class);

        serve("/*").with(GuiceContainer.class);
    }
}

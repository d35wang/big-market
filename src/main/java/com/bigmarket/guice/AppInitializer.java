package com.bigmarket.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class AppInitializer extends GuiceServletContextListener {
    protected Injector getInjector() {
        return Guice.createInjector(new ResourceJerseyServletModule());
    }
}

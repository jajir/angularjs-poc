package cz.equa.sandbox.angular.poc;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class SimpleContextListener extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
	return Guice.createInjector(new ServletModule() {

	    @Override
	    protected void configureServlets() {
		super.configureServlets();

		ResourceConfig resourceConfig = new PackagesResourceConfig(
			"cz/equa/sandbox/angular/poc/resources");
		for (Class<?> resource : resourceConfig.getClasses()) {
		    bind(resource);
		}

		serve("*.html").with(SimpleHttpServlet.class);
		serve("/services/*").with(GuiceContainer.class);
	    }
	});
    }

}

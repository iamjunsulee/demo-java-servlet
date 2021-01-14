package me.junsu;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context Initialized");
        sce.getServletContext().setAttribute("name", "junsu");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context Destroyed");
    }
}

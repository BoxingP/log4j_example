package com.boxing.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.sql.SQLException;

public class Log4jExample {
    static Logger logger = Logger.getLogger(Log4jExample.class.getName());

    public static void main(String[] args) throws IOException, SQLException {
        PropertyConfigurator.configure("log4j.properties");

        logger.debug("Hello this is an debug message");
        logger.info("Hello this is an info message");
    }
}
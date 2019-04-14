package com.blaszczyk.api;

import org.slf4j.LoggerFactory;
import java.util.logging.Logger;

public class Example {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        logger.info("Example log from {}" +  Example.class.getSimpleName());
    }
}
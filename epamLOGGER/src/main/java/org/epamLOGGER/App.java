package org.epamLOGGER;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    private static final Logger myLogger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        myLogger.debug("Debug");
        myLogger.info("Info");
        myLogger.warn("Warn");
        myLogger.error("Error");
        myLogger.fatal("Fatal");
    }
}
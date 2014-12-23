package com.realmsmaster.powernap.utility;

import  com.realmsmaster.powernap.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by mike on 12/23/14.
 */
public class LogHelper {

    /* This is Pahimar's way of handling logging and debuggin and I like it a lot.
    He discusses its use in the second half of Episode 7 in the LMR series
     */

        public static void log(Level logLevel, Object object)
        {
            FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
        }

        public static void all(Object object)
        {
            log(Level.ALL, object);
        }

        public static void debug(Object object)
        {
            log(Level.DEBUG, object);
        }

        public static void error(Object object)
        {
            log(Level.ERROR, object);
        }

        public static void fatal(Object object)
        {
            log(Level.FATAL, object);
        }

        public static void info(Object object)
        {
            log(Level.INFO, object);
        }

        public static void off(Object object)
        {
            log(Level.OFF, object);
        }

        public static void trace(Object object)
        {
            log(Level.TRACE, object);
        }

        public static void warn(Object object)
        {
            log(Level.WARN, object);
        }
}

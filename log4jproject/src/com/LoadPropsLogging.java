package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoadPropsLogging {

	public static void logConfigure(String log4jProperties)
	{
		if (null==log4jProperties||"".equalsIgnoreCase(log4jProperties))
		{
			log4jProperties="log4j.properties";
		}
		Properties props = new Properties();
        try {
			props.load(new FileInputStream(log4jProperties));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PropertyConfigurator.configure(props);
	}
	
	private static final Logger logger = LogManager.getLogger(LoadPropsLogging.class.getName());  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logConfigure("log4j.properties");
		
		logger.info("Welcome to Log4J");
		
	}

}

package com;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Logging {
	private static final Logger logger = LogManager.getLogger(Logging.class);  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();  
		  logger.info("Hello world");  
		  logger.info("we are in logger info mode");  
	}

}

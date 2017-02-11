package com.niit.chitchatbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.niit.config.AppContextConfig;


public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
    	
    	
    }
}

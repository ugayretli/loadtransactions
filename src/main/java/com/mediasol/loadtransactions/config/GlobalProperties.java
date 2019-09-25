package com.mediasol.loadtransactions.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties
public class GlobalProperties {
	

    private String inputdir;

	public void setInputDir(String inputdir) {
		this.inputdir = inputdir;
	}

	public String getInputDir() {
		return inputdir;
	}

/*	public String getFileExtension() {
		
		String fileext = filename.substring(filename.lastIndexOf(".") + 1);
		return fileext;
	}*/
    //getters and setters

}
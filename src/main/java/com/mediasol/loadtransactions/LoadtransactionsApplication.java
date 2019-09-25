package com.mediasol.loadtransactions;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mediasol.loadtransactions.config.GlobalProperties;
import com.mediasol.loadtransactions.gpc.IO.GPCFileIO;

@SpringBootApplication
@EnableConfigurationProperties(GlobalProperties.class)
public class LoadtransactionsApplication {


	
	public static void main(String[] args) {


		
		SpringApplication.run(LoadtransactionsApplication.class, args);
		
		

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				LoadtransactionsApplication.class);

		GlobalProperties theConfig = context.getBean("globalProperties", GlobalProperties.class);

		String inputDir = theConfig.getInputDir();
		if (( inputDir == null))
			System.err.println("Configure the input directory in application.properties");
		else
		{
			GPCFileIO theFileIO = context.getBean("GPCFileIO", GPCFileIO.class);
			theFileIO.readFileNames(inputDir);
		}

		context.close();

	}
	
	
}

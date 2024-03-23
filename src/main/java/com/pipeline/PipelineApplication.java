package com.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipelineApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(PipelineApplication.class, args);
		new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        System.exit(0); 
                    }
                },
                20000 
        );
	}

}

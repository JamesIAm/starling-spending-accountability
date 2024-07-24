package org.nahajski.startspac;

import org.nahajski.baseauth.BaseAuthSharedConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

@Import(BaseAuthSharedConfiguration.class)
@SpringBootApplication
@ConfigurationPropertiesScan
public class StarSpAcApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarSpAcApplication.class, args);
	}

}

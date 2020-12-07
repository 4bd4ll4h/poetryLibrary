package org.poetryLibrary.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackageClasses = PoetryLibraryApplication.class)

public class PoetryLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoetryLibraryApplication.class, args);
	}


}

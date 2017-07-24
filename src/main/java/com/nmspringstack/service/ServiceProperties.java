package com.nmspringstack.service;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person.service", ignoreUnknownFields = false)
@Component
public class ServiceProperties {
	
	//TODO Change Name
	
	@NotNull // you can also create configurationPropertiesValidator
	private String name = "Person Spring Data Jpa Service";
	
	//TODO Change Desc
	@NotNull // you can also create configurationPropertiesValidator
	private String description = "Person Spring Data Jpa Service for demoing microservices with database features";

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

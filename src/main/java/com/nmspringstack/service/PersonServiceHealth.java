package com.nmspringstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceHealth implements HealthIndicator {
	
	@Autowired
	private ServiceProperties configuration;

	public Health health() {
		return Health.up().withDetail("details",
				"{ 'internals' : 'getting close to limit', 'profile' : '" + this.configuration.getName() + "' }" +  this.configuration.getDescription())
				.status("itsok!").build();
	}
}

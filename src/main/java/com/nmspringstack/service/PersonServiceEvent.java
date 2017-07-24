package com.nmspringstack.service;

import org.springframework.context.ApplicationEvent;

import com.nmspringstack.domain.Person;

public class PersonServiceEvent extends ApplicationEvent {
	Person eventPerson;
	String eventType;

	public PersonServiceEvent(Object source, String eventType, Person eventPerson) {
		super(source);
		this.eventType = eventType;
		this.eventPerson = eventPerson;
	}

	public String toString() {
		return "My Person Microservice Event: " +eventType + "Event";
	}

	public Person getEventPerson() {
		return eventPerson;
	}

	public void setEventPerson(Person eventPerson) {
		this.eventPerson = eventPerson;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
}

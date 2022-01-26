package com.saanvi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleData {

	
	public List<Person> getPersons()
	
	{
		return Stream.of(new Person("7506495051","Rakesh Jena","India"),
				new Person("7506495051","Rakesh Jena","India"),
				new Person("7506495051","Rakesh Jena","India")).collect(Collectors.toList());
	}
}

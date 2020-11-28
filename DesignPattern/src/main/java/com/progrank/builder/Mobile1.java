package com.progrank.builder;

//Telescoping constructor...
public class Mobile1 {
	private String name;
	private String color;
	private String processor;		//class type
	private String ram;				// class type
	
	public Mobile1(String name) {
		this.name = name;
	}
	
	public Mobile1(String name,String color) {
		this(name);
		this.color = color;
	}
	
	public Mobile1(String name,String color,String processor) {
		this(name,color);
		this.processor = processor;
	}
	
	public Mobile1(String name,String color,String processor,String ram) {
		this(name,color,processor);
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Mobile1 [name=" + name + ", color=" + color + ", processor=" + processor + ", ram=" + ram + "]";
	}
	
	
	
}
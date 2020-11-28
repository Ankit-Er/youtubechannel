package com.progrank.builder;

public class Mobile2 {
	private String name;
	private String color;
	private String processor; // class type
	private String ram; // class type

	public Mobile2(String name, String color, String processor, String ram) {
		this.name = name;
		this.color = color;
		this.processor = processor;
		this.ram = ram;
	}

	public Mobile2(String name, String color, String processor) {
		this(name, color, processor, null);
	}

	public Mobile2(String name, String color) {
		this(name, color,null, null);
	}

	public Mobile2(String name) {
		this(name, null, null, null);
	}

	@Override
	public String toString() {
		return "Mobile2 [name=" + name + ", color=" + color + ", processor=" + processor + ", ram=" + ram + "]";
	}

}
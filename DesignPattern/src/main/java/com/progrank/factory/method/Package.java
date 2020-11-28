package com.progrank.factory.method;

import java.util.HashMap;
import java.util.Map;

public abstract class Package {
	
	protected Map<String,Database> dbList = new HashMap<String,Database>();
	
	public Package() {
		creatingPackage();
	}

	protected abstract void creatingPackage();

	@Override
	public String toString() {
		return "Package [dbList=" + dbList + "]";
	}
	
}

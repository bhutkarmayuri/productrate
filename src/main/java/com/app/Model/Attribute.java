package com.app.Model;

public class Attribute {
		
	    private String key;
	    private String value;

	    // Constructors
	    public Attribute() {}

	    public Attribute(String key, String value) {
	        this.key = key;
	        this.value = value;
	    }

	    // Getters and setters
	    public String getKey() {
	        return key;
	    }

	    public void setKey(String key) {
	        this.key = key;
	    }

	    public String getValue() {
	        return value;
	    }

	    public void setValue(String value) {
	        this.value = value;
	    }
}

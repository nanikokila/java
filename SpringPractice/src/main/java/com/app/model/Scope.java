package com.app.model;

public class Scope {

	private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Scope [name=" + name + "]";
    }
}

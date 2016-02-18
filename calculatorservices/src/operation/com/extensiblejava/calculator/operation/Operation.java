package com.extensiblejava.calculator.operation;

public interface Operation {
	
	public String execute();	
	public void setValues(Values values);
	public String getDescriptor();
}

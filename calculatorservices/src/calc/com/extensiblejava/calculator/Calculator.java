package com.extensiblejava.calculator;

import java.util.HashMap;
import java.util.Map;

import com.extensiblejava.calculator.operation.Operation;
import com.extensiblejava.calculator.operation.Values;

public class Calculator {

	private String message;
	private Map<String, Operation> operations = new HashMap<String,Operation>();
	private Map<String, Values> values = new HashMap<String,Values>();	
	
	public void calculate(String operation) {
		Operation opSvc = this.operations.get(operation);
		Values valSvc = this.values.get(operation+"UI");
		opSvc.setValues(valSvc);
		String result = opSvc.execute();
		System.out.println(result);
	}
	

	public void setOperation(Operation opSvc, Map<String, Object> props) {
		String name = (String) props.get("name");
		operations.put(name, opSvc);
	}

	public void setValues(Values valSvc, Map<String, Object> props) {
		String name = (String) props.get("name");
		values.put(name, valSvc);
	}

}
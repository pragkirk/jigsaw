package com.extensiblejava.calculator;

import java.util.HashMap;
import java.util.Map;

import aQute.bnd.annotation.component.Reference;

import org.apache.felix.service.command.CommandProcessor;

import com.extensiblejava.calculator.operation.Operation;
import com.extensiblejava.calculator.operation.Values;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

@Component(properties =	{
		CommandProcessor.COMMAND_SCOPE + ":String=example", 
		CommandProcessor.COMMAND_FUNCTION + ":String=calculate"
	},
	provide = Object.class
)
public class Calculator {

	private String message;
	private Map<String, Operation> operations = new HashMap<String,Operation>();
	private Map<String, Values> values = new HashMap<String,Values>();	
	
	public void calculate(String operation) {		
		Operation opSvc = this.operations.get(operation);
		Values valSvc = this.values.get(operation+"UI");
		Calculator calc = new Calculator();
		opSvc.setValues(valSvc);
		String result = opSvc.execute();
		System.out.println(result);
	}
	

	@Reference(dynamic=true, multiple=true)
	public void setOperation(Operation opSvc, Map<String, Object> props) {
		String name = (String) props.get("name");
		operations.put(name, opSvc);
	}

	@Reference(dynamic=true, multiple=true)
	public void setValues(Values valSvc, Map<String, Object> props) {
		String name = (String) props.get("name");
		values.put(name, valSvc);
	}
	
	@Reference 
	public void unsetOperation(Operation opSvc, Map<String, Object> props) {
		
	}
	
	@Reference 
	public void unsetValues(Values valSvc, Map<String, Object> props) {
		
	}

}
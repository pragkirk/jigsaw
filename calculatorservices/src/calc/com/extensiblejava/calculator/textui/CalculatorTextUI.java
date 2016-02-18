package com.extensiblejava.calculator.textui;

import com.extensiblejava.calculator.*;
import com.extensiblejava.calculator.operation.*;

import java.io.*;
import java.util.Properties;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ServiceLoader;

public class CalculatorTextUI {
	public static void main(String args[]) {
		Calculator calculator = registerCalculators();
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(streamReader);
		boolean again = true;
		try {
			while (again) {
				String calcType = null;
				if (args.length == 0) {
					System.out.print("Enter type of calculation: ");
					calcType = reader.readLine();
				} else {
					calcType = args[0];
				}
		
				calculator.calculate(calcType);
				System.out.print("Another calculation? ('y' or 'n'): ");
				again = reader.readLine().equals("y");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	public static Calculator registerCalculators() {
		Calculator calculator = new Calculator();
		Iterable<Values> values = ServiceLoader.load(Values.class);
		for(Values vals: values) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			//System.out.println(vals.getDescriptor());
			map.put("name", vals.getDescriptor());
			calculator.setValues(vals,map);
  			//renderDashboardIcon(app);
		}
		
		Iterable<Operation> operations = ServiceLoader.load(Operation.class);
		for(Operation op: operations) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			//System.out.println(op.getDescriptor());
			map.put("name", op.getDescriptor());
			calculator.setOperation(op,map);
  			//renderDashboardIcon(app);
		}
		
		return calculator;
	}
	
}
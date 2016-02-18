package com.extensiblejava.calculator.textui;

import com.extensiblejava.calculator.*;
import com.extensiblejava.calculator.operation.*;

import java.io.*;
import java.util.Properties;
import java.util.Enumeration;
import java.util.HashMap;

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
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("Resource.properties"));
			Enumeration props = prop.propertyNames();
			while (props.hasMoreElements()) {
				String key = (String) props.nextElement();
				int delimiter = key.indexOf(".");
				String calcType = key.substring(0,delimiter);
				//System.out.println(calcType);
				if (key.endsWith("ui")) {
					String valClass = prop.getProperty(key);
					try {
						Class valClz = Class.forName(valClass);
						Values values = (Values) valClz.newInstance();
						HashMap<String, Object> map = new HashMap<String, Object>();
						map.put("name", calcType+"UI");
						calculator.setValues(values,map);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
						//suppress
					}
				} else {
					String opClass = prop.getProperty(key);
					try {
						Class opClz = Class.forName(opClass);
						Operation op = (Operation) opClz.newInstance();
						HashMap<String, Object> map = new HashMap<String, Object>();
						map.put("name", calcType);
						calculator.setOperation(op,map);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
						//suppress
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return calculator;
	}
	
}
package com.extensiblejava.calculator.math;

import com.extensiblejava.calculator.*;
import com.extensiblejava.calculator.operation.Values;

import java.io.*;

import java.util.Map;
import java.util.HashMap;

public class MathUIValues implements Values {

	public Map<String, Integer> getValues() {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(streamReader);
		
		Map<String, Integer> vals = new HashMap<String, Integer>();
		try {
			System.out.print("Enter math operation - Add (a), Substract (s), Multiply (m), Divide (d):");
			String mathOp = reader.readLine();
			if (mathOp.equals("a")) {
				vals.put("type", Math.ADD);
			} else if (mathOp.equals("s")) {
				vals.put("type", Math.SUBTRACT);
			} else if (mathOp.equals("m")) {
				vals.put("type", Math.MULTIPLY);
			} else {
				vals.put("type", Math.DIVIDE);
			}
			System.out.print("Enter first value: ");
			String val1 = reader.readLine();
			Integer operand1 = new Integer(val1);
		
			System.out.print("Enter second value: ");
			String val2= reader.readLine();
			Integer operand2 = new Integer(val2);
			
			
			vals.put("operand1",operand1);
			vals.put("operand2",operand2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vals;
	}
	
	public String getDescriptor() { return "MathUI"; }
}
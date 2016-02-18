package com.extensiblejava.calculator.loan;

import com.extensiblejava.calculator.*;
import com.extensiblejava.calculator.operation.Values;

import java.io.*;

import java.util.Map;
import java.util.HashMap;

import aQute.bnd.annotation.component.Component;

@Component(properties="name=LoanUI")
public class LoanUIValues implements Values {

	public Map getValues() {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(streamReader);
		
		Map<String, Integer> vals = new HashMap<String, Integer>();
		try {
			System.out.print("Enter principle: ");
			Integer principle = new Integer(reader.readLine());
		
			System.out.print("Enter rate: ");
			Integer rate = new Integer(reader.readLine());
			
			System.out.print("Enter term: ");
			Integer term = new Integer(reader.readLine());
			
			vals.put("principle",principle);
			vals.put("rate",rate);
			vals.put("term",term);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vals;
	}
}
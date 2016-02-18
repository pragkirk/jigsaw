package com.extensiblejava.calculator.math;

import java.util.Map;
import com.extensiblejava.calculator.operation.Operation;
import com.extensiblejava.calculator.operation.Values;

public class Math implements Operation {
	public final static Integer ADD = new Integer(0);
	public final static Integer SUBTRACT = new Integer(1);
	public final static Integer MULTIPLY = new Integer(2);
	public final static Integer DIVIDE = new Integer(3);
	private int val1;
	private int val2;
	private Integer type;
	
	public void setValues(Values values) {
		Map<String,Integer> map = values.getValues();
		this.val1 = map.get("operand1").intValue();
		this.val2 = map.get("operand2").intValue();
		this.type = map.get("type");
	}
	
	public String execute() {
		String result = null;
		if (this.type == ADD) {
			result = new Integer(val1 + val2).toString();
		} else if (this.type == SUBTRACT) {
			result = new Integer(val1 - val2).toString();
		} else if (this.type == MULTIPLY) {
			result = new Integer(val1 * val2).toString();
		} else {
			result = new Integer(val1 / val2).toString();
		}
		return result;
	}

	public String getDescriptor() { return "Math"; }
}

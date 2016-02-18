package com.extensiblejava.calculator.loan;

import com.extensiblejava.calculator.operation.Operation;
import com.extensiblejava.calculator.operation.Values;

import java.util.Map;
import java.math.BigDecimal;


public class Loan implements Operation {
	private int principle;
	private int rate;
	private int term;
	
	public void setValues(Values values) {
		Map<String,Integer> map = values.getValues();
		this.principle = map.get("principle").intValue();
		this.rate = map.get("rate").intValue();
		this.term = map.get("term").intValue();
	}
	
	public String execute() {
		BigDecimal prin = new BigDecimal(this.principle);
		BigDecimal rt = new BigDecimal(this.rate);
		BigDecimal payment = this.calculatePayment(prin,rt,this.term);
		return "$" + payment.toString();
	}
	
	private BigDecimal calculatePayment(BigDecimal presentValue, 
										BigDecimal rate, 
										int term) {
		double dPresentValue = presentValue.doubleValue();
		double dRate = rate.doubleValue() / (1200);

		double revisedRate = dRate + 1;
		double dTerm = term;
		double powRate = Math.pow(revisedRate, dTerm);

		double left = powRate * dPresentValue;

		double middle = dRate / (powRate - 1);

		double right = 1 / (1);

		BigDecimal payment = new BigDecimal(left * middle * right);
		return payment.setScale(2, BigDecimal.ROUND_UP);

	}

	public String getDescriptor() { return "Loan"; }
}

module loan { 
	requires operation;
	
	provides com.extensiblejava.calculator.operation.Operation with com.extensiblejava.calculator.loan.Loan;
	provides com.extensiblejava.calculator.operation.Values with com.extensiblejava.calculator.loan.LoanUIValues;
}
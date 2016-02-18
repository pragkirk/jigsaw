module math { 
	requires operation;
	
	provides com.extensiblejava.calculator.operation.Operation with com.extensiblejava.calculator.math.Math;
	provides com.extensiblejava.calculator.operation.Values with com.extensiblejava.calculator.math.MathUIValues;
}
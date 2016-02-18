module calc { 
	requires operation;
	//If I comment these two modules out, I get a runtime error.
	requires math;
	requires loan;
}
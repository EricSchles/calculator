package calculator;


//***********************************************************************
//
//Test1 : confirms that the stack is initially of size 0
//
//***********************************************************************
//Computer Science 102: Data Structures
//Spring 2014
//Eric Koskinen
//New York University
//***********************************************************************

public class Test1 extends TestHarness {

	public Test1(String s) { super(s); }

	public boolean test() {
		StackList<String> stack = new StackList<String>();
		if(!stack.isEmpty()) return false;
		return true;
	}

}
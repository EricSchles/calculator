package calculator;




//***********************************************************************
//
//Test Class -- The main function that registers and executes tests.
//
//***********************************************************************
//Computer Science 102: Data Structures
//Spring 2014
//Eric Koskinen
//New York University
//***********************************************************************

public class Test {

	public static void main(String [] args) {
		new Test1("t1");
		new Test2("t2");
		new Test3("t3");
		new Test4("t4");

		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// %%%%% Register your new tests here, by extending this method %%%%%
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


		TestHarness.run();
	}
}
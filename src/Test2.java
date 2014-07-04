package IlanaHomeworkDue3_9_14;


//***********************************************************************
//
//Test2 : confirms that we cannot pop from an empty stack.
//
//***********************************************************************
//Computer Science 102: Data Structures
//Spring 2014
//Eric Koskinen
//New York University
//***********************************************************************

public class Test2 extends TestHarness {

	public Test2(String s) { super(s); }

	public boolean test() { 
		QueueList<String> q = new QueueList<String>();

		try {
		    q.dequeue();
		    return false;
		} catch (InvalidOperationException e) { return true; }

	}
}
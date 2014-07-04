package IlanaHomeworkDue3_9_14;


//***********************************************************************
//
//Test4 : confirms that number of arithmetic operators encountered in the input string is correctly calculated
//
//***********************************************************************
//Computer Science 102: Data Structures
//Spring 2014
//Eric Koskinen
//New York University
//***********************************************************************

public class Test4 extends TestHarness {

	public Test4(String s) { super(s); }

	public boolean test() { 
	    QueueList<String> q = new QueueList<String>();
	    
	    q.enqueue("1");
	    q.enqueue("2");
	    q.enqueue("+");
	    q.enqueue("3");
	    q.enqueue("*");
	    q.enqueue("+");

	    PostFix pf = new PostFix(q);

	    // calculator should catch an exception!
	    try {
		pf.evaluatePostFix();
		return false;
	    } catch (InvalidOperationException e) { return true; }

	}
}
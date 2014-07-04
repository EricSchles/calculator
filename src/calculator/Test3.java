package calculator;





//***********************************************************************
//
//Test3 : confirms that number of arithmetic operators encountered in the input string is correctly calculated
//
//***********************************************************************
//Computer Science 102: Data Structures
//Spring 2014
//Eric Koskinen
//New York University
//***********************************************************************

public class Test3 extends TestHarness {

	public Test3(String s) { super(s); }

	public boolean test() { 
	    QueueList<String> q = new QueueList<String>();
	    
	    q.enqueue("1");
	    q.enqueue("2");
	    q.enqueue("+");
	    q.enqueue("3");
	    q.enqueue("*");
	    q.enqueue("6");
	    q.enqueue("+");
	    q.enqueue("2");
	    q.enqueue("3");
	    q.enqueue("+");
	    q.enqueue("/");

	   // System.out.println("ILANA ADDED THIS PRINT STATMENT");
	    //q.PrettyPrint();
	    PostFix pf = new PostFix(q);
	    //System.out.println("ILANA ADDED THIS PRINT STATMENT");
	    //q.PrettyPrint();

	    // calculator should be ready to go!
	   if(!pf.ready()) return false;

	    // calculator should give the right result!
	    try {
	    	//System.out.println(pf.evaluatePostFix());
		if(pf.evaluatePostFix() != 3) return false;
	    } catch (InvalidOperationException e) { return false; }

	    // calculator should no longer be ready to go!
	    if(pf.ready()) return false;

	    return true;
	}
}
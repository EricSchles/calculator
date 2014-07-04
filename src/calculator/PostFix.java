package calculator;



//***********************************************************************
//
//PostFix class -- Implementation of a calculator for PostFix expressions.
//
//***********************************************************************
//Computer Science 102: Data Structures
//Spring 2014
//Eric Koskinen
//New York University
//***********************************************************************

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//%%%%%  
//%%%%% You must implement the methods in this file
//%%%%% 
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class PostFix {

QueueList<String> q = new QueueList<String>();
StackList<String> stack = new StackList<String>();


 /**
  * Constructor -- Sets up a new expression from a queue of strings
  */
 public PostFix(QueueList<String> qu) { 
	
	 while(!qu.isEmpty()){
		 try{
			 String s = qu.dequeue();
			 this.q.enqueue(s);
		 }
		 catch(InvalidOperationException e){
			 System.out.println("queue constructor failure");
		 }
		 
	}
	
 }

 /**
  * reset() -- This function restarts the PostFix calculator with a new queue
  */
 public void reset(QueueList<String> qu) {
	
	// %%%%% TODO -- Implement
	 //this.q.clear();
	 while(!this.q.isEmpty()){
		try{
			this.q.dequeue();
		}catch(InvalidOperationException e){
			System.out.println("queue reset failure");
		}
	 }
	 while(!this.q.isEmpty()){
		 try{
			 String s = qu.dequeue();
			 this.q.enqueue(s);
		 }catch(InvalidOperationException e){
			 System.out.println("queue reset failure");
		 }
	 }
	

 }

 /**
  * ready() -- Returns true if there is a queue ready to be
  * processed. That is, ready() returns true whenever it is safe to
  * call evaluatePostFix().
  */
 public boolean ready() {
	
	// %%%%% TODO -- Implement
	 if(!this.q.isEmpty()){
		 return true;
	 }
	 
	 
	return false;

 }

 /**
  * evaluatePostFix() -- This function evaluates the input
  * expression from the queue, and returns the result.
  */	
 public int evaluatePostFix(  ) throws InvalidOperationException {

	
	 
	 int result = 0;
	 
	 	
	 	if(this.q.isEmpty()){
	 		if (stack.isEmpty()) {
		 		throw new InvalidOperationException("Passed empty queue");
		 	}
	 		return Integer.parseInt(stack.pop());
	 	}
	 	
	
	 	String next = this.q.dequeue();
	 	
	 	
	 	if(stack.size() < 2){
	 		if("+*-/".contains(next)){
	 			throw new InvalidOperationException("Not enough operands");
	 		}
	 	}
	 	
	 	//contains on all special characters raises an error. will implement if I have enough time
	 	
	 	if(("+*-/").contains(next)){
	 		String op = next;
	 		int a = Integer.parseInt(stack.pop()) ;
	 		int b = Integer.parseInt(stack.pop());
	 		if (op.equals("+")) { 
				result = a + b;
				String newResult = Integer.toString(result);
			 	stack.push(newResult);
			}
	 		else if (op.equals("*"))
	 		{
	 			result = a * b;
	 			String newResult = Integer.toString(result);
	 		 	stack.push(newResult);
	 		}
	 		else if (op.equals("-"))
	 		{
	 			result = a - b;
	 			String newResult = Integer.toString(result);
	 		 	stack.push(newResult);
	 		}
	 		else if (op.equals("/") && a !=0 ) //NOTE THAT THIS WILL NOT RETURN AN EXACTLY CORRECT NUMBER
	 		{
	 			//double x = (double)a;
	 			//double y = (double)b;
	 			//double z = x/y;
	 			//int w = (int)(Math.floor(z));
	 			
	 			result = b/a;
	 			String newResult = Integer.toString(result);
	 		 	stack.push(newResult);
	 		}
	 		
	 		else if (op.equals("/") && a ==0 ) {
	 			throw new InvalidOperationException("cannot divide by zero");
	 		}
	 	}
		else{
		
			stack.push(next);
		
		}
	 		
	 	
	 	
	 	//System.out.println(newResult);
	 	
	 	return	evaluatePostFix( );

		
 	}
 }


package calculator;



//import java.util.*;

public class TestQueue {
	public static void main(String [] args) {
		
		StackList<String> myStack = new StackList<String>();
		
		QueueList<String> myQueue = new QueueList<String>();
		
		
	
		myQueue.enqueue("2");
		System.out.println(myQueue);
		myQueue.enqueue("7");
		System.out.println(myQueue);
		myQueue.enqueue("4");
		System.out.println(myQueue);
		myQueue.enqueue("1");
		System.out.println(myQueue);
		myQueue.enqueue("+");
		System.out.println(myQueue);
		myQueue.enqueue("-");
		System.out.println(myQueue);
		myQueue.enqueue("*");
		System.out.println(myQueue);
		
		
		
		myQueue.toString();
		myQueue.PrettyPrint();
	
		
		PostFix calc = new PostFix(myQueue);
//		try{
//			System.out.println(calc.q.dequeue());
//			System.out.println(calc.q.dequeue());
//		}catch(InvalidOperationException e){
//			System.out.println("This is wrong");
//		}
		
		
		try{
			
			System.out.println( calc.evaluatePostFix() );
		}
		catch(InvalidOperationException e){
			System.out.println("This is somewhat wrong");
		}
	}
}

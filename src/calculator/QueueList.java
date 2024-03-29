package calculator;


//***********************************************************************
//
//List implementation of a Queue_change_back
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

public class QueueList<E> implements Queue<E> {

 static class Node<E> implements Comparable<Node<E>>
 {
	private E e;
	public Node(E e) { this.e = e; }
	public E get() { return e; }
	public String toString() { return "\"" + e +"\"";}
	@Override
	public int compareTo(Node o) //Not used 
	{
		return 0;
	} 
 }
 public QueueList() { }

 private SortedLinkedSet<Node<E>> myList = new SortedLinkedSet<Node<E>>();
 
 // Basic operations
 public int size() {
	 return myList.size();
}
 
 public void enqueue(E element) { 
	 myList.addFirst(new Node<E>(element));
 }
 
 public E dequeue() throws InvalidOperationException {
	 
		if(!myList.isEmpty()) {
			
			 E element = myList.removeBack().get();
				return element;
			}
			else {
				throw new InvalidOperationException("There are no elements in the queue");
			}
		 }
 
 
 public boolean isEmpty() {
	 boolean empty = myList.isEmpty();
		return empty; }

 // Output operations
 public String toString() {
	 return myList.toString();
// if(myList.firstNode == null) {
//	    return "[]";
//	} else {
//		String myString = "[";
//	while (myList.firstNode.next != null) {
//	     myString += ("\"" + myList.firstNode.getValue() + "\"") ;
//	} 
//	myString += "]";
//	System.out.println(myString);
//	return myString;
//}
 }
 
 public void PrettyPrint() { 
	 System.out.printf(this.toString() + "\n");
	 
 }

@Override
public boolean contains(E element) {
	return false;
}

@Override
public boolean add(E element) {
	Node<E> elem = new Node<E>(element);
	myList.addFirst(elem);
	return false;
}

@Override
public boolean remove(E element) {
	
	myList.removeBack();
	return false;
}

@Override
public int compareTo(E o) { //Not used!!
	return 0;
}
 
}


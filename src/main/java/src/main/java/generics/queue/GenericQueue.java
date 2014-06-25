package src.main.java.generics.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class GenericQueue<T> implements Iterable<T>{

	private Queue<T> genericQueue = new LinkedList<T>();
	
	private int maxItems;
	
	
	public GenericQueue(int maxItems){
		this.maxItems = maxItems;
	}
	
	public void addToQueue(T itemToAdd){
		if (genericQueue.size()< maxItems)
			genericQueue.add(itemToAdd);
	}
	
	public T removeFromQueue(){
		return genericQueue.remove();
	}
	
	public boolean isEmpty(){
		return genericQueue.isEmpty();
	}
	
	public T peek(){
		return genericQueue.peek();
	}
	
	public int getLength(){
		return genericQueue.size();
	}

	public Iterator<T> iterator() {
		
		return genericQueue.iterator();
	}
	
}

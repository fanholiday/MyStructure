package Data;

import LinkedList.ListNode;

public class MyListStack<T> {
	public MyListStack( ){ 
		topOfStack = null; 
	}
	
    public boolean isFull( ){ 
    	return false; 
    }
    
    public boolean isEmpty( ){ 
    	return topOfStack == null; 
    }
    
    public void makeEmpty( ){ 
    	topOfStack = null; 
    }

    public void push( Object x ) {
    	topOfStack = new ListNode(x, topOfStack);
    }
    
    public Object top( ) {
    	return topOfStack.element;
    }
    
    public T pop( ){
    	if(isEmpty())
    		return null;
    	return (T) (topOfStack = topOfStack.next).element;
    }
    
    public Object topAndPop( ) {
    	Object item = topOfStack.element;
    	topOfStack = topOfStack.next;
    	return item;
    }

    private  ListNode  topOfStack;
}

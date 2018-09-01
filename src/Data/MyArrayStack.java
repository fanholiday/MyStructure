package Data;



public class MyArrayStack {
	public MyArrayStack() {
		// TODO Auto-generated constructor stub
		this(DEFAULT_CAPACITY);
	}
	
	MyArrayStack(int capacity){
		arrays = new Object[capacity];
		topOfStack = -1;
	}
	
	public Boolean isFull() {
		return topOfStack == arrays.length -1;
	}
	
	public Boolean isEmpty() {
		return topOfStack == -1;
	}
	
	public void push(Object x) {
		if(isFull())
			return;
		topOfStack ++;
		arrays[topOfStack] = x;
	}
	
	public Object top() {
		if(isEmpty())
			return null;
		return arrays[topOfStack];
	}
	
	public void pop() {
		arrays[topOfStack--] = null;
	}
	
	public Object topAndPop() {
		Object item = this.top();
		this.pop();
		return item;
	}
	
	private Object[] arrays;
	private int topOfStack;
	static final int DEFAULT_CAPACITY = 10;
}

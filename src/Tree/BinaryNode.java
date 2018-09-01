package Tree;

import java.io.Serializable;

public class BinaryNode <T extends Comparable<?>> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BinaryNode() {
		// TODO Auto-generated constructor stub
		this(null,null,null);
	}
	
	public BinaryNode(T x){
		this(x, null, null);
	}
	
	public BinaryNode(T x, BinaryNode<T> l,BinaryNode<T> r){
		this.element = x;
		this.left = l;
		this.right = r;
	}
	
	public Boolean isLeaf() {
		return this.left==null&&this.right==null;
	}
	
	public T element;
	public BinaryNode<T> left;
	public BinaryNode<T> right;
}

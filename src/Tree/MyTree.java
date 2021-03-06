package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.RuntimeErrorException;

public class MyTree <T extends Comparable>{

	public MyTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public Boolean isEmpty() {
		return root==null;
	}
	
	public void insert(T data) {
		if(data == null)
			throw new RuntimeException("data can\\'Comparable be null !");
		root = insert(data,root);
		
	}
		
	public void delete(T data) {
		root = delete(root,data);
	}
	
	public int size() {
		int size = size(root,0);
		return size;
	}
	
	public int height() {
		return height(root,0);
	}
	
	public T findMin() {
		return (T) findMin(root).element;
	}
	
	public T findMax() {
		return (T) findMax(root).element;
	}
	
	public void clear() {
		root = null;
	}

	public boolean containX(T x) {
		return containX(root, x);
	}
	
	public BinaryNode<T> getRoot() {
		return root;
	}

	public BinaryNode<T> findNode(T data) {
		return findNode(root, data);
	}
	
	private BinaryNode<T> insert(T data, BinaryNode<T> node) {
		if(node == null) {
			node = new BinaryNode<>(data,null,null);
			return node;
		}
		int j=0;
		int result = data.compareTo(node.element);
		if(result<0) {
			node.left = insert(data, node.left);
		}else if (result>0) {
			node.right = insert(data, node.right);
		}
		
		return node;
	}

	private BinaryNode<T> delete(BinaryNode<T> node,T data) {
		if(node==null)
			return node;
		int result = data.compareTo(node.element);
		if(result<0) {
			node.left = delete(node.left, data);
		}else if(result>0){
			node.right = delete(node.right, data);
		}else {
			if(node.left!=null&&node.right!=null) {
				node.element = findMin(node.right).element;
				node.right = delete(node.right, node.element);
			}else {
				node = (node.left!=null)?node.left:node.right;
			}
		}
		
		return node;
	}
	
	private int size(BinaryNode<T> node,int size) {
		if(node == null)
			return size;
		size = size+1;
		if(node.left != null)
			size = size(node.left,size);
		if(node.right != null)
			size = size(node.right, size);
		return size;
	}
	
	private int height(BinaryNode<T> node,int height) {
		if(node == null)
			return height;
		return height = height + Math.max(height(node.left,0),height(node.right, 0))+1;
	}
	
	private BinaryNode<T> findMin(BinaryNode<T> node) {
		if(node == null)
			return null;
		if(node.left == null)
			return node;
		return findMin(node.left);
	}
	
	private BinaryNode<T> findMax(BinaryNode<T> node) {
		if(node == null)
			return null;
		if(node.right == null)
			return node;
		return findMax(node.right);
	}
	
	private boolean containX(BinaryNode<T> node,T x) {
		if(node == null)
			return false;
		int result = x.compareTo(node.element);
		if(result==0) {
			return true;
		}else if(result>0) {
			return containX(node.right, x);
		}else {
			return containX(node.left, x);
		}
	}
	
	private BinaryNode<T> findNode(BinaryNode<T> node,T data) {
		if(node == null)
			return null;
		int result = data.compareTo(node.element);
		if(result==0) {
			return node;
		}else if(result>0){
			return findNode(node.right, data);
		}else {
			return findNode(node.left, data);
		}
	}
	
	public MyTree<T> makeTree(T...strs) {
		MyTree<T> tree = new MyTree<>();
		for(T arg:strs) {
			tree.insert(arg);
		}
		return tree;
	}
	
	BinaryNode root;
}

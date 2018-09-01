package Tree;

public class CompleteBinaryTree <T extends Comparable> extends BinaryTree <T>{

	public CompleteBinaryTree() {
		// TODO Auto-generated constructor stub
		node = null;
	}
	
	/**
	 * 以层序遍历构造完全二叉树
	 * @param levelOrderArray
     */
	public CompleteBinaryTree(T[] levelOrderArray){
	       this.root = create(levelOrderArray, 0);
	}

	/**
	 * 层次遍历构造完全二叉树
	 * @param levelOrderArray
	 * @param i
	 * @return
     */
	 public BinaryNode<T> create(T[] levelOrderArray ,int i){
	       if(levelOrderArray ==null){
	           throw new RuntimeException("the param 'array' of create method can\'t be null !");
	       }
	       BinaryNode<T> p = null;

	       if (i<levelOrderArray.length){//递归结束条件
	           p=new BinaryNode<>(levelOrderArray[i],null,null);
	           p.left=create(levelOrderArray,2*i+1);  //根据完全二叉树的性质 2*i+1 为左孩子结点
	           p.right=create(levelOrderArray,2*i+2); //2*i+2 为右孩子结点
	       }
	       return p;
	   }

	BinaryNode<T> node;
}

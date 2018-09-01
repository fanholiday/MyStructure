package Apply;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;
import javax.print.attribute.standard.Fidelity;
import javax.sound.midi.Track;

import Data.CircleList;
import Data.MyQueue;
import LinkedList.ListNode;
import Path.Position;
import Tree.BinaryNode;
import Tree.BinaryTree;
import Tree.MyTree;

public class Test {
	
	static int[][] matrix = initMatrix();
	
	public static void main(String[] args) {
		
//		LinkedList lList = new LinkedList<>() ;
//		
//		lList.offer("1");
//		lList.offer("2");
//		lList.offer("3");
//		
//		lList.add(0, "4");
//		
//		lList.offerFirst("5");
//		
//		for(int i=0;i<100000;i++) {
//			lList.add(i);
//		}
//		
//		//System.out.println(lList);
//		
//		
//		//LinkedList遍历 迭代器方式
//		Long start = System.currentTimeMillis();
//		Iterator iterator = lList.iterator();
//		while (iterator.hasNext()) {
//			//iterator.next();
//			//System.out.print(iterator.next());
//			if(iterator.next().equals(100)) {
//				System.out.println("100 is finded.");
//				break;
//			}			
//		}
//		Long end = System.currentTimeMillis();
//		System.out.println("Method 1 spends"+(end-start)+"ms");
		
		Test test = new Test();
		//System.out.println(test.isLuckyOne(8, 3));
		
		matrix[2][3] =1;
		Queue<Position> queue = new LinkedList<>() ;
		Stack<Position> stack = new Stack<>();
		
//		test.findPath(2, 3, 6, 5);
//		for(int i=0;i<7;i++) {
//			for(int j =0;j<7;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		BinaryTree tree = new BinaryTree();
		tree.insert(7);
		tree.insert(2);
		tree.insert(9);
		tree.insert(1);
		tree.insert(5);
		tree.insert(3);
		tree.insert(4);
//		System.out.println("二叉树的高度是"+tree.height());
//		System.out.println("二叉树的最小值是"+tree.findMin());
//		System.out.println("二叉树的最大值是"+tree.findMax());
//		System.out.println("树中包含element4:"+tree.containX(4));
//		System.out.println("树中包含element8:"+tree.containX(8));
//		
//		BinaryNode node1 = tree.findNode(4);
//		BinaryNode node2 = tree.findNode(8);
//		System.out.println(node1==null);
//		System.out.println(node2==null);
		
		System.out.println(tree.levelOrder());
		System.out.println(tree.size());
	}
	
	public int isLuckyOne(int peopleNum, int specilNum) {
		int count = 1;
		int size = peopleNum;
		CircleList cList = new CircleList();
		for(int i=1;i<=peopleNum;i++)
			cList.add(i);	
		ListNode node = cList.getFirst();
		while(cList.size()>1) {
			if(count%specilNum == 0)
				cList.remove(node);
			count++;
			node = node.next;
		}
		return (int) node.element;
	}
	
	public void findPath(int x,int y,int endX,int endY) {		
		if(matrix[x][y] == -1) {
			return;
		}
		if( x==endX && y==endY) {
			return;
		}
		if(x>=1 && matrix[x-1][y] != 1 && matrix[x-1][y] != -1) {
			if(matrix[x-1][y] >= matrix[x][y]+1 || matrix[x-1][y] == 0 ) {
				matrix[x-1][y] = matrix[x][y]+1;
				findPath(x-1, y, endX, endY);	
			}			
		}
		if(x<=5 && matrix[x+1][y] !=1 && matrix[x+1][y] !=-1) {
			if(matrix[x+1][y] >= matrix[x][y]+1 ||  matrix[x+1][y] == 0 ){
				matrix[x+1][y] = matrix[x][y]+1;
				findPath(x+1, y, endX, endY);
			}
		}
		if(y>=1 && matrix[x][y-1]!=1 && matrix[x][y-1]!=-1) {
			if(matrix[x][y-1]==0 ||  matrix[x][y-1] >= matrix[x][y]+1){
				matrix[x][y-1] = matrix[x][y]+1;
				findPath(x, y-1, endX, endY);
			}
			
		}
		if(y<=5 && matrix[x][y+1] !=1 && matrix[x][y+1] !=-1) {
			if(matrix[x][y+1] >= matrix[x][y]+1 || matrix[x][y+1] == 0  ) {
				matrix[x][y+1] = matrix[x][y]+1;
				findPath(x, y+1, endX, endY);
			}
			
		}
	}

	private static int[][] initMatrix() {
		// TODO Auto-generated method stub
		int matrix[][] = new int[7][7];
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++)
				matrix[i][j] = 0;
		}
		matrix[0][2] = -1;
		matrix[1][2] = -1;		matrix[1][3] = -1;
		matrix[2][4] = -1;
		matrix[3][3] = -1; 		matrix[3][4] = -1;
		matrix[4][0] = -1;		matrix[4][4] = -1;
		matrix[5][0] = -1;		matrix[5][1] = -1;		matrix[5][2] = -1;
		matrix[6][0] = -1;		matrix[6][1] = -1;		matrix[6][2] = -1;
		return matrix;
	}
	
	
	
}

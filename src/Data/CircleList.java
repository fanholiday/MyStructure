package Data;

import LinkedList.ListNode;

public class CircleList {
	public CircleList() {
		// TODO Auto-generated constructor stub
		start = new ListNode(null);
		end = new ListNode(null);
		isNull = true;
	}
	
	public void add(Object x) {
		ListNode node = new ListNode(x);
		if(isNull) {
			start = node;
			end = node;
			end.next = start;
			start.pre = end;
			isNull = false ;
		}else {
			end.next = node;
			node.pre = end;
			end = node;
			end.next = start;			
		}
	}

	public boolean remove(Object x) {
		ListNode node = start;
		while(!isNull) {
			if(start.equals(x) || start.element.equals(x)) {
				end.next = start.next;
				start.next.pre = end;
				start = start.next;
				return true;
			}
			if(end.equals(x) || end.element.equals(x)) {
				end.pre.next = start;
				start.pre = end.pre;
				end = end.pre ;
				return true;
			}
			if(node.element.equals(x) || node.equals(x)) {
				node.pre.next = node.next;
				node.next.pre = node.pre;
				return true;
			}else if(node.equals(end)) {
				return false;
			}else {
				node = node.next ;
			}
		}
		return false;
	}
	
	public ListNode getFirst() {
		return start;
	}
	public ListNode getLast() {
		return end;
	}
	
	public int size() {
		ListNode node = start;
		int size = 0;
		for(;node != null && !node.equals(end); node = node.next) {
			size ++;
		}
		return size+1;
	}
	
	public void print() {
		ListNode node = start;
		for(;node != null && !node.equals(end); node = node.next) {
			System.out.println(node.element);
		}
		System.out.println(end.element);
	}
	ListNode start;
	ListNode end;
	boolean isNull;
}

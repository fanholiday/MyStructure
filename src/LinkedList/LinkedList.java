package LinkedList;

public class LinkedList {
	
	public LinkedList() {
		header = new ListNode(null);
	}
	
	public boolean isEmpty() {
		return header.next == null;
	}
	
	public void makeEmpty() {
		header.next = null;
	}

	public LinkedListItr zeroth() {
		return new LinkedListItr(header);
	}
	
	public LinkedListItr first() {
		return new LinkedListItr(header.next);
	}
	
	public LinkedListItr find(Object x) {
		ListNode itr = header.next;
		while (itr != null && !itr.element.equals(x)) {
			itr = itr.next;
		}
		return new LinkedListItr(itr);
	}
	
	public LinkedListItr findPrevious(Object x) {
		return null;
	}
	
	public void remove(Object x) {
		
	}
	
	public void insert(Object x) {
		
	}
	
	public static void printList(LinkedList theList) {
		if(theList.isEmpty()) {
			System.out.print("Empty List");
		}else {
			LinkedListItr itr = theList.first();
			for(; !itr.isPastEnd(); itr.advance()) {
				System.out.println(itr.retrieve()+"");
			}
		}
		System.out.println();
	}
	
	private ListNode header;
}

package LinkedList;

public class ListNode {
	
	//构造函数，头结点
	public ListNode( Object theElement){   
		this( theElement, null, null);
    }
     
	//构造函数，一般结点
	ListNode( Object theElement, ListNode n, ListNode p){  
		this.element = theElement;
		this.pre = p;
		this.next = n;
    }
	
	public ListNode(Object theElement, ListNode n) {
		element = theElement;
		next = n;
	}
	
    public Object element;
    public ListNode next;
    public ListNode pre;
}

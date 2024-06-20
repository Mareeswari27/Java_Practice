package dsa_practice;

public class SinglyLinkedList2 {
	private static ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void display(ListNode head) {
		
		//print elements of the singlyLinkedList
		ListNode current=head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current=current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public void addNode(int data) {
		ListNode newNode= new ListNode(data);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	public ListNode findmiddle() {
		if(head==null) {
			return head;
		}
		ListNode slowptr=head;
		ListNode fastptr=head;
		while(fastptr !=null && fastptr.next !=null ) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		return slowptr;
	}
	
	public ListNode findNthfromEnd(int n) {
		if(head==null) {
			return null;
		}
		if(n<=0) {
			throw new IllegalArgumentException("Invalid argument" + n);
		}
		ListNode mainptr=head;
		ListNode refptr=head;
		int count=0;
		while(count<n) {
			if(refptr==null) {
				throw new IllegalArgumentException(n + "is greater than number of nodes");
			}
			refptr=refptr.next;
			count++;
		}
		while(refptr != null) {
			refptr=refptr.next;
			mainptr=mainptr.next;
		}
		return mainptr;
		
	}
	public void removeDupFromSort() {
		if(head==null) {
			return;
		}
		ListNode current=head;
		
		while(current!=null && current.next !=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
		
	}
	public ListNode insertNodeInSorted(int value) {
		ListNode newNode=new ListNode(value);
		ListNode current=head;
		ListNode temp=null;
		while(current!=null && current.data != newNode.data) {
			temp=current;
			current=current.next;	
		}
		newNode.next=current;
		temp.next=newNode;
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList2 obj=new SinglyLinkedList2();
		obj.addNode(1);
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(5);
		obj.display(head);
		System.out.println("The middle node number is " + obj.findmiddle().data);
		System.out.println("The n th number is " +obj.findNthfromEnd(6).data);
		obj.removeDupFromSort();
		obj.display(head);
		obj.insertNodeInSorted(3);
		obj.display(head);
	}

}

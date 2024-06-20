package dsa_practice;

public class SinglyLinkedList {
	
	private static ListNode head;
	
	private static class ListNode{
		private int data;  //Generic type
		private ListNode next; //reference to next ListNode in list
		
		public ListNode(int data) {
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
		
		
		//find the length of the singlyLinkedlist
		public int length() {
			if(head==null) {
				return 0;
			}
			int count=0;
			ListNode current=head;
			while(current !=null) {
				count++;
				current=current.next;
			}
			return count;
		}
		
		//Insert a new node in the beginning
		public void insertFirst(int value) {
			ListNode newnode=new ListNode(value);
			newnode.next=head;
			head=newnode;	
		}
		
		//Insert a new node in a given position
		public void insert(int value, int position) {
			ListNode node=new ListNode(value);
			if(position==1) {
				node.next=head;
				head=node;
			}else {
				ListNode previous=head;
				int count=1;
				while(count<position-1) {
					previous=previous.next;
					count++;
				}
				ListNode current=previous.next;
				previous.next=node;
				node.next=current;
			}
			
		}
		
		//Insert a new node in the last
		public void insertLast(int value) {
			ListNode new1Node=new ListNode(value);
			if(head==null) { 
				head=new1Node;
				return;
			}
			ListNode current=head;
			while(null != current.next) {
				current=current.next;
			}
			current.next=new1Node;
 		}
		
		//delete first node 
		public ListNode deleteFirst() {
			if(head==null) {
				return null;
			}
			ListNode temp=head;
	       head=head.next;
				temp.next=null;
				return temp;
				
			}
		
		//delete last node
		public ListNode deleteLast() {
			if(head==null || head.next==null) {
				return head;
			}
			ListNode current=head;
			ListNode previous=null;
			while(current.next!=null) {
				previous=current;
				current=current.next;
			}
			previous.next=null; //break the chain
			return current;
			
		}
		
		//delete a node from a given position
		public void delete(int position) {
			if(position==1) {
				head=head.next;
			}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
		}	
		}
		
		public boolean search(ListNode head,int searchkey) {
			if(head==null) {
				return false;
			}
			ListNode current=head;
			while(current != null) {
				if(current.data==searchkey) {
					return true;
				}
					current=current.next;	
			}
			return false;
		}
		
		public ListNode reverse(ListNode head) {
			if(head==null) {
				return head;
			}
			
			ListNode current=head;
			ListNode previous=null;
			ListNode next=null;
			
			while(current !=null) {
				next=current.next;	
				current.next=previous;
				previous=current;
				current=next;	
			}
			return previous;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList obj=new SinglyLinkedList();
		obj.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		
		//Now we will connect together to form a chain
		obj.head.next=second; //10--->1
		second.next=third;// 1--> 8
		third.next=fourth; // 8--->11--->Null
		
//		obj.insertFirst(12);
//		obj.insertFirst(90);
//		obj.insertFirst(123);
//		obj.insertLast(90);
		
//		obj.insert(9, 3);
//		System.out.println(obj.deleteFirst().data);
//		System.out.println(obj.deleteFirst().data);
//		
		
//		System.out.println(obj.deleteLast().data);
//		System.out.println(obj.deleteLast().data);
//		System.out.println(obj.deleteLast().data);
//		System.out.println(obj.deleteLast().data);
		
//		obj.delete(1);
//		
//		if(obj.search(head, 8)) {
//		System.out.println("Search key found");}
//		else {
//			System.out.println("search key not found");
//		}
//		
//		ListNode reverseNode=obj.reverse(head);
//		obj.display(reverseNode);
		obj.display(head);
		
		obj.display(obj.reverse(head));
			
//		System.out.println();
//		System.out.println("The length of the singlyLinkedList is "+obj.length());
//		
//		

		

	}


}
